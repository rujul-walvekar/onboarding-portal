package com.accolite.ms.demo.controllers;

import com.accolite.ms.demo.model.OnboardeeEnt;
import com.accolite.ms.demo.functions.OnboardeeRepo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class Onboardees {
    @Autowired
    OnboardeeRepo onboardRepo;
    OnboardeeEnt onboardee;

    @PostMapping("/user")
    public OnboardeeEnt createOnboardee(@RequestBody OnboardeeEnt onboardee) {

        return onboardRepo.createOnboardeeEnt(onboardee);

    }
    @PutMapping("/user")
    public OnboardeeEnt updateOnboardee(@RequestBody OnboardeeEnt onboardee) {

        return onboardRepo.updateOnboardeeEnt(onboardee);

    }
    @GetMapping("/user/{emailID}")
    public OnboardeeEnt getOnboardeeByEmail(@PathVariable("emailID") String emailID) {
        return onboardRepo.getOnboardeeByEmailID(emailID);
    }

    @GetMapping("/users")
    public List<OnboardeeEnt> getOnboardees() {
        return onboardRepo.allOnboardeeEnts();
    }

    @DeleteMapping("/user/{emailID}")
    public String deleteUser(@PathVariable("emailID") String emailID){
        return onboardRepo.deleteOnboardeeByEmailID(emailID);
    }
}
