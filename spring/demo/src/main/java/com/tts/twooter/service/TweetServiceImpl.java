package com.tts.twooter.service;

import com.tts.twooter.model.Tweet;
import com.tts.twooter.model.User;
import com.tts.twooter.repository.TweetRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TweetServiceImpl implements TweetService {

    private TweetRepository tweetRepository;

    public TweetServiceImpl(TweetRepository tweetRepository) {
        this.tweetRepository = tweetRepository;
    }

    @Override
    public List<Tweet> findAll() {
        List<Tweet> tweets = tweetRepository.findAllByOrderByCreatedAtDesc();
        return tweets;
    }

    @Override
    public List<Tweet> findAllByUser(User user) {
        List<Tweet> tweets = tweetRepository.findAllByUserOrderByCreatedAtDesc(user);
        return tweets;
    }

    @Override
    public List<Tweet> findAllByUsers(List<User> users) {
        List<Tweet> tweets = tweetRepository.findAllByUserInOrderByCreatedAtDesc(users);
        return tweets;
    }

    @Override
    public void save(Tweet tweet) {
        tweetRepository.save(tweet);
    }

    // optional method, does not need to be implemented
    // mostly here for testing
    @Override
    public Optional<Tweet> findById(Long id) {
        return tweetRepository.findById(id);
    }

}
