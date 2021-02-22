package com.tts.reviewspring.repository;

import com.tts.reviewspring.model.Greeting;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GreetingRepository extends CrudRepository<Greeting, Long> {

}
