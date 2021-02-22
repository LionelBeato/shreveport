package com.tts.reviewspring.repository;

import com.tts.reviewspring.model.Tweet;
import com.tts.reviewspring.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TweetRepository extends CrudRepository<Tweet, Long> {

    List<Tweet> findAllByOrderByCreatedDesc();
    List<Tweet> findAllByUserOrderByCreatedAtDesc(User user);
    List<Tweet> findAllByUserInOrderByCreatedAtDesc(List<User> users);


}
