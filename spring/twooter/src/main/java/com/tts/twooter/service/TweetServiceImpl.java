package com.tts.twooter.service;

import com.tts.twooter.model.Tag;
import com.tts.twooter.model.Tweet;
import com.tts.twooter.model.TweetDisplay;
import com.tts.twooter.model.User;
import com.tts.twooter.repository.TagRepository;
import com.tts.twooter.repository.TweetRepository;
import org.ocpsoft.prettytime.PrettyTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Service
public class TweetServiceImpl implements TweetService {

    private TweetRepository tweetRepository;
    private TagRepository tagRepository;

    @Autowired
    public TweetServiceImpl(TweetRepository tweetRepository, TagRepository tagRepository) {
        this.tweetRepository = tweetRepository;
        this.tagRepository = tagRepository;
    }

    @Override
    public List<TweetDisplay> findAll() {
        List<Tweet> tweets = tweetRepository.findAllByOrderByCreatedAtDesc();
        return formatTweets(tweets);
    }

    @Override
    public List<TweetDisplay> findAllByUser(User user) {
        List<Tweet> tweets = tweetRepository.findAllByUserOrderByCreatedAtDesc(user);
        return formatTweets(tweets);
    }

    @Override
    public List<TweetDisplay> findAllByUsers(List<User> users) {
        List<Tweet> tweets = tweetRepository.findAllByUserInOrderByCreatedAtDesc(users);
        return formatTweets(tweets);
    }

    @Override
    public void save(Tweet tweet) {
        handleTags(tweet);
        tweetRepository.save(tweet);
    }

    // optional method, does not need to be implemented
    // mostly here for testing
    @Override
    public Optional<Tweet> findById(Long id) {
        return tweetRepository.findById(id);
    }

    @Override
    public List<TweetDisplay> findAllWithTag(String tag) {
        List<Tweet> tweets = tweetRepository.findByTags_PhraseOrderByCreatedAtDesc(tag);
        return formatTweets(tweets);
    }

    @Override
    public void handleTags(Tweet tweet) {
        List<Tag> tags = new ArrayList<Tag>();
        Pattern pattern = Pattern.compile("#\\w+");
        Matcher matcher = pattern.matcher(tweet.getMessage());
        while (matcher.find()) {
            String phrase = matcher.group().substring(1).toLowerCase();
            Tag tag = tagRepository.findByPhrase(phrase);
            if (tag == null) {
                tag = new Tag();
                tag.setPhrase(phrase);
                tagRepository.save(tag);
            }
            tags.add(tag);
        }
        tweet.setTags(tags);

    }

    @Override
    public List<TweetDisplay> formatTweets(List<Tweet> tweets) {
        addTagLinks(tweets);
        shortenLinks(tweets);
        List<TweetDisplay> displayTweets = formatTimestamps(tweets);
        return displayTweets;
    }

    @Override
    public void addTagLinks(List<Tweet> tweets) {
        Pattern pattern = Pattern.compile("#\\w+");
        for (Tweet tweet : tweets) {
            String message = tweet.getMessage();
            Matcher matcher = pattern.matcher(message);
            Set<String> tags = new HashSet<String>();
            while (matcher.find()) {
                tags.add(matcher.group());
            }
            for (String tag : tags) {
                message = message.replaceAll(tag,
                        "<a class=\"tag\" href=\"/tweets/" + tag.substring(1).toLowerCase() + "\">" + tag + "</a>");
            }
            tweet.setMessage(message);
        }
    }

    @Override
    public void shortenLinks(List<Tweet> tweets) {

        Pattern pattern = Pattern.compile("https?[^ ]+");
        for (Tweet tweet : tweets) {
            String message = tweet.getMessage();
            Matcher matcher = pattern.matcher(message);
            while (matcher.find()) {
                String link = matcher.group();
                String shortenedLink = link;
                if (link.length() > 23) {
                    shortenedLink = link.substring(0, 20) + "...";
                    message = message.replace(link,
                            "<a class=\"tag\" href=\"" + link + "\" target=\"_blank\">" + shortenedLink + "</a>");
                }
                tweet.setMessage(message);
            }

        }

    }

    @Override
    public List<TweetDisplay> formatTimestamps(List<Tweet> tweets) {
        List<TweetDisplay> response = new ArrayList<>();
        PrettyTime prettyTime = new PrettyTime();
        SimpleDateFormat simpleDate = new SimpleDateFormat("M/d/yy");
        Date now = new Date();

        for (Tweet tweet: tweets) {
            TweetDisplay tweetDisplay = new TweetDisplay();
            tweetDisplay.setUser(tweet.getUser());
            tweetDisplay.setMessage(tweet.getMessage());
            tweetDisplay.setTags(tweet.getTags());
            // Math.abs return the absolute value of the given argument
            long diffinMillies = Math.abs(now.getTime() - tweet.getCreatedAt().getTime());
            long diff = TimeUnit.DAYS.convert(diffinMillies, TimeUnit.MILLISECONDS);
            if (diff > 3) {
                tweetDisplay.setDate(simpleDate.format(tweet.getCreatedAt()));
            } else {
                tweetDisplay.setDate(prettyTime.format(tweet.getCreatedAt()));
            }
            response.add(tweetDisplay);
        }
        return response;
    }

}
