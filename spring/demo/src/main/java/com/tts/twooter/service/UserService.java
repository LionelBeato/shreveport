package com.tts.twooter.service;

import com.tts.twooter.model.User;

import java.util.List;

public interface UserService {

    User findByUsername(String username);
    List<User> findAll();
    void save(User user);
    User saveNewUser(User user);
    User getLoggedInUser();

}
