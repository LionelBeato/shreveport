package com.tts.twooter.controller;

import com.tts.twooter.model.Tweet;
import com.tts.twooter.model.User;
import com.tts.twooter.service.TweetService;
import com.tts.twooter.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.HashMap;
import java.util.List;

public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private TweetService tweetService;

    // TODO(): return to this to make sure it works
    @GetMapping( value = "/users/{username}")
    public String getUser(@PathVariable String username, Model model) {
        // find user
        User user = userService.findByUsername(username);
        // find tweets from user
        List<Tweet> tweets = tweetService.findAllByUser(user);
        model.addAttribute("user", user);
        model.addAttribute("tweetList", tweets);
        return "user";
    }

    @GetMapping(value = "/users")
    public String getUsers(Model model) {

        List<User> users = userService.findAll();
        model.addAttribute("users", users);
        setTweetCounts(users, model);
        return "users";
    }

    private void setTweetCounts(List<User> users, Model model) {
        HashMap<String, Integer> tweetCounts = new HashMap<>();
        for (User user : users) {
            List<Tweet> tweets = tweetService.findAllByUser(user);
            tweetCounts.put(user.getUsername(), tweets.size());
        }
        model.addAttribute("tweetCount", tweetCounts);
    }

}
