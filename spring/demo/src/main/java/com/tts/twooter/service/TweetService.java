package com.tts.twooter.service;


import com.tts.twooter.model.Tweet;
import com.tts.twooter.model.User;

import java.util.List;
import java.util.Optional;

public interface TweetService {

    List<Tweet> findAll();
    List<Tweet> findAllByUser(User user);
    List<Tweet> findAllByUsers(List<User> users);
    void save(Tweet tweet);
    Optional<Tweet> findById(Long id);

}
