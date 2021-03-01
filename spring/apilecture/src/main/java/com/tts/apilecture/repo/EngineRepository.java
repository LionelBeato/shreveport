package com.tts.apilecture.repo;

import com.tts.apilecture.model.Engine;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EngineRepository extends CrudRepository<Engine, Long> {
}
