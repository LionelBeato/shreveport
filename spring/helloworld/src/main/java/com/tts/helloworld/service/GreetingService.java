package com.tts.helloworld.service;

import com.tts.helloworld.model.Greeting;

import java.util.List;

// services should always have their methods define in an interface
public interface GreetingService {

    Greeting get(long id);
    List<Greeting> getAll();

}
