package com.tts.practicesession.controller;

import com.tts.practicesession.model.Crystal;
import com.tts.practicesession.service.CrystalService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RequestMapping("/crystal")
@RestController
public class CrystalController {

    CrystalService crystalService;

    public CrystalController (CrystalService crystalService) {
        this.crystalService = crystalService;
    }

    // read methods
    @GetMapping("/{id}")
    public ResponseEntity<Optional<Crystal>> getCrystalById(@PathVariable Long id) {
       return new ResponseEntity<Optional<Crystal>>(crystalService.getCrystal(id), HttpStatus.OK);
    }

    @GetMapping("/all")
    public Iterable<Crystal> getAllCrystals() {
        return crystalService.getAllCrystals();
    }

}
