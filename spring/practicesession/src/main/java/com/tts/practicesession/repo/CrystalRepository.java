package com.tts.practicesession.repo;

import com.tts.practicesession.model.Crystal;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CrystalRepository extends CrudRepository<Crystal, Long> {
}
