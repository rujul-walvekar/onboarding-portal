package com.accolite.ms.demo.controller;

import java.util.List;

import com.accolite.ms.demo.dao.UserRepository;
import com.accolite.ms.demo.entity.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    @Autowired
    UserRepository userRepository;

    @PostMapping("/user")
    public User addUser(@RequestBody User user) {

        return userRepository.saveUser(user);

    }

    @PutMapping("/user")
    public User updateUser(@RequestBody User user) {

        return userRepository.updateUser(user);

    }

    @GetMapping("/user/{id}")
    public User getUser(@PathVariable("id") int id) {
        return userRepository.getById(id);
    }

    @GetMapping("/users")
    public List<User> getUsers() {
        return userRepository.allUsers();
    }

    @DeleteMapping("/user/{id}")
    public String deleteUser(@PathVariable("id") int id){
        return userRepository.deleteById(id);
    }
}
