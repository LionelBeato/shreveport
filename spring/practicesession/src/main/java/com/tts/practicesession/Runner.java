package com.tts.practicesession;

import com.tts.practicesession.model.Crystal;
import com.tts.practicesession.repo.CrystalRepository;
import com.tts.practicesession.service.CrystalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

public class Runner implements CommandLineRunner {

    @Autowired
    CrystalRepository crystalRepository;


    @Override
    public void run(String... args) throws Exception {

        crystalRepository.save(new Crystal("clear", "clear quartz"));
        crystalRepository.save(new Crystal("purple", "amethyst"));
        crystalRepository.save(new Crystal("yellow", "citrine"));

    }
}
