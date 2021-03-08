package com.tts.twooter.controller;

import com.tts.twooter.model.User;
import com.tts.twooter.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class FollowController {

    @Autowired
    private UserService userService;

    @PostMapping(value = "/follow/{username}")
    public String follow(@PathVariable String username, HttpServletRequest request) {
        User loggedInUser = userService.getLoggedInUser();
        User userToFollow = userService.findByUsername(username);

        List<User> followers = userToFollow.getFollowers();
        followers.add(loggedInUser);
        userToFollow.setFollowers(followers);
        userService.save(userToFollow);
        return "redirect:" + request.getHeader("Referer");
    }

    @PostMapping(value = "/unfollow/{username}")
    public String unfollow(@PathVariable String username, HttpServletRequest request) {
        User loggedInUser = userService.getLoggedInUser();
        User userToUnfollow = userService.findByUsername(username);
        List<User> followers = userToUnfollow.getFollowers();
        followers.remove(loggedInUser);
        userToUnfollow.setFollowers(followers);
        userService.save(userToUnfollow);
        return "redirect:" + request.getHeader("Referer");
    }



}
