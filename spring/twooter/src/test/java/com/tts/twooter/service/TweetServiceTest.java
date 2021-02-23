package com.tts.twooter.service;

import com.tts.twooter.model.Tweet;
import com.tts.twooter.model.User;
import com.tts.twooter.repository.TweetRepository;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.mockito.Mockito.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.Date;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class TweetServiceTest {

    @Autowired
    private TweetService tweetService;

    @MockBean
    private TweetRepository tweetRepository;

    @BeforeEach
    public void setUp() {
        Tweet tweet = new Tweet(1l, new User(), "hello", new Date());
        when(tweetRepository.findById(1l))
                .thenReturn(java.util.Optional.of(tweet));
    }

    @Test
    void WhenValidId_ThenReturnTweet() {
        String message = "hello";
        Optional<Tweet> tweet = tweetService.findById(1l);

        assertThat(tweet
                .orElseThrow()
                .getMessage()).isEqualTo(message);
    }

    @AfterEach
    void tearDown() {
        tweetRepository.deleteAll();
    }

}