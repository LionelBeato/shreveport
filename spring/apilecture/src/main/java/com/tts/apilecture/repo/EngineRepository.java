package com.tts.apilecture.repo;

import com.tts.apilecture.model.Engine;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EngineRepository extends CrudRepository<Engine, Long> {

    Optional<Engine> findEngineByCylinderAndHorsepower(Integer cylinder, Integer horsepower);

}
