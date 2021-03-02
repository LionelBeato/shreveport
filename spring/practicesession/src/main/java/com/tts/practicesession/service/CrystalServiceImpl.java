package com.tts.practicesession.service;

import com.tts.practicesession.model.Crystal;
import com.tts.practicesession.repo.CrystalRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CrystalServiceImpl implements CrystalService {

    CrystalRepository crystalRepository;

    public CrystalServiceImpl (CrystalRepository crystalRepository) {
        this.crystalRepository = crystalRepository;
    }

    @Override
    public Optional<Crystal> getCrystal(Long id) {
        return crystalRepository.findById(id);
    }

    @Override
    public Iterable<Crystal> getAllCrystals() {
        return crystalRepository.findAll();
    }
}
