package com.tts.reviewspring.service;

import com.tts.reviewspring.model.Greeting;
import com.tts.reviewspring.repository.GreetingRepository;
import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {

    private GreetingRepository greetingRepository;

    public GreetingServiceImpl(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public Greeting getGreeting() {
        Greeting greeting = new Greeting("Hello");
        return greetingRepository.save(greeting);
    }

}
