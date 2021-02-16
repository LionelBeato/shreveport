package com.example.demo.service;

import com.example.demo.model.Role;
import com.example.demo.model.User;
import com.example.demo.repository.RoleRepository;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;
    private RoleRepository roleRepository;
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Autowired
    public UserServiceImpl(UserRepository userRepository,
                           RoleRepository roleRepository,
                           BCryptPasswordEncoder bCryptPasswordEncoder) {

        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
    }

    @Override
    public User findByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    @Override
    public List<User> findAll() {
       return (List<User>) userRepository.findAll();
    }

    @Override
    public void save(User user) {
        userRepository.save(user);
    }

    @Override
    public User saveNewUser(User user) {
        // encodes our user's password
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        // set the user as active
        user.setActive(1);
        // finds user role in database
        Role userRole = roleRepository.findByRole("USER");
        // sets the roles of our user
        user.setRoles(new HashSet<Role>(Arrays.asList(userRole)));
        // saves new user
        return userRepository.save(user);
    }

    @Override
    public User getLoggedInUser() {
        // returns information related to the logged in user
        // see: https://www.baeldung.com/get-user-in-spring-security
       String loggedInUsername = SecurityContextHolder
               .getContext()
               .getAuthentication()
               .getName();

       return findByUsername(loggedInUsername);
    }
}
