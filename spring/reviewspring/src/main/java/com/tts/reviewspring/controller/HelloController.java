package com.tts.reviewspring.controller;


// i want to create a controller that will
// define a restful endpoint for some sort of message

import com.tts.reviewspring.model.Greeting;
import com.tts.reviewspring.repository.GreetingRepository;
import com.tts.reviewspring.service.GreetingService;
import com.tts.reviewspring.service.GreetingServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    GreetingService greetingService;

    public HelloController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    // we're going to implementing a simple GET
    @GetMapping("/hello")
    public Greeting getHello() {
        return greetingService.getGreeting();
    }

}
