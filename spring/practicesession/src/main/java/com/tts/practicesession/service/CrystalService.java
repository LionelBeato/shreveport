package com.tts.practicesession.service;

import com.tts.practicesession.model.Crystal;

import java.util.Optional;

public interface CrystalService {

    Optional<Crystal> getCrystal(Long id);
    Iterable<Crystal> getAllCrystals();

}
