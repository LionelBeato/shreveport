package com.tts.helloworld.DAO;

import com.tts.helloworld.model.Greeting;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

// the component annotation allows the dao to be picked up and instatiated and injected by spring boot
@Component
public class GreetingDao implements Dao<Greeting> {

    // this list is the closest thing we have in or app that could be considered a database
    private List<Greeting> greetings = new ArrayList<>();

    public GreetingDao() {
        greetings.add(new Greeting(0, "Hello"));
        greetings.add(new Greeting(1, "Hola"));
    }


    @Override
    public Optional<Greeting> get(long id) {
        return Optional.ofNullable(greetings.get((int) id));
    }

    @Override
    public List<Greeting> getAll() {
        return greetings;
    }

//    @Override
//    public void save(Greeting greeting) {
//
//    }
}
