package com.tts.helloworld.controller;

import com.tts.helloworld.model.Greeting;
import com.tts.helloworld.service.GreetingService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GreetingRestController {

    private GreetingService greetingService;

    public GreetingRestController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    @GetMapping("/get")
    public String getGreeting() {
        return "hello world from REST controller!";
    }

    @GetMapping("/all")
    public List<Greeting> getAllGreetings() {
        return greetingService.getAll();
    }

}
