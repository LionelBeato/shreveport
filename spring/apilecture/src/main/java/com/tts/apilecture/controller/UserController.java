package com.tts.apilecture.controller;

import com.tts.apilecture.model.User;
import com.tts.apilecture.repo.UserRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RequestMapping("/user")
@RestController
public class UserController {

    UserRepository userRepository;

    public UserController (UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @PostMapping("/add")
    public ResponseEntity<Void> createUser(@RequestBody @Valid User user, BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        userRepository.save(user);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> getUser(@PathVariable Long id) {
        Optional<User> user = userRepository.findById(id);

        if (user.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(user.get(), HttpStatus.OK);
    }

//    public ResponseEntity<List<User>> getAllUsers() {
//
//    }



}
