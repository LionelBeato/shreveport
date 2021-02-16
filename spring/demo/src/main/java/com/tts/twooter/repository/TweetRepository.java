package com.tts.twooter.repository;

import com.tts.twooter.model.Tweet;
import com.tts.twooter.model.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TweetRepository extends CrudRepository<Tweet, Long> {

    List<Tweet> findAllByOrderByCreatedAtDesc();
    List<Tweet> findAllByUserOrderByCreatedAtDesc(User user);
    List<Tweet> findAllByUserInOrderByCreatedAtDesc(List<User> users);

}
