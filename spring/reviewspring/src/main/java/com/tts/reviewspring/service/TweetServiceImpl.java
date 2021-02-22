package com.tts.reviewspring.service;

import com.tts.reviewspring.model.Tweet;
import com.tts.reviewspring.model.User;
import com.tts.reviewspring.repository.TweetRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TweetServiceImpl implements TweetService{

    private TweetRepository tweetRepository;

    public TweetServiceImpl(TweetRepository tweetRepository) {
        this.tweetRepository = tweetRepository;
    }

    @Override
    public List<Tweet> findAll() {
        return tweetRepository.findAllByOrderByCreatedDesc();
    }

    @Override
    public List<Tweet> findAllByUser(User user) {
        return tweetRepository.findAllByUserOrderByCreatedAtDesc(user);
    }

    @Override
    public List<Tweet> findAllByUsers(List<User> users) {
        return tweetRepository.findAllByUserInOrderByCreatedAtDesc(users);
    }

    @Override
    public void save(Tweet tweet) {
        tweetRepository.save(tweet);
    }

    @Override
    public Optional<Tweet> findById(Long id) {
        return tweetRepository.findById(id);
    }
}
