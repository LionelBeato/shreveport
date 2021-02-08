package com.tts.helloworld.service;

import com.tts.helloworld.DAO.GreetingDao;
import com.tts.helloworld.model.Greeting;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GreetingServiceImpl implements GreetingService {

    private GreetingDao greetingDao;

    public GreetingServiceImpl(GreetingDao greetingDao) {
        this.greetingDao = greetingDao;
    }

    @Override
    public Greeting get(long id) {
       return greetingDao.get(id)
               .orElseThrow();
    }

    @Override
    public List<Greeting> getAll() {
        return greetingDao.getAll();
    }


}
