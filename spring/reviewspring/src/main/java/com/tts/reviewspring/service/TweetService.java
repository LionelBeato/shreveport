package com.tts.reviewspring.service;

import com.tts.reviewspring.model.Tweet;
import com.tts.reviewspring.model.User;

import java.util.List;
import java.util.Optional;

public interface TweetService {

    List<Tweet> findAll();
    List<Tweet> findAllByUser(User user);
    List<Tweet> findAllByUsers(List<User> users);
    void save(Tweet tweet);
    Optional<Tweet> findById(Long id);

}
