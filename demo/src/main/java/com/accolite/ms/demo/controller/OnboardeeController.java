package com.accolite.ms.demo.controller;

import java.util.List;

import com.accolite.ms.demo.dao.OnboardeeRepository;
import com.accolite.ms.demo.dao.OnboardeeRepositoryImpl;
import com.accolite.ms.demo.entity.OnboardeeEnt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:4200")//for angular
@RestController
public class OnboardeeController {
    
    @Autowired
    OnboardeeRepository onboardeeRepository;
    OnboardeeRepositoryImpl onboardeeRepositoryImpl;

    @PostMapping("/addNewOnboardee")
    public OnboardeeEnt addBoardee (@RequestBody OnboardeeEnt onboardee){
        return onboardeeRepository.addBoardee(onboardee);
    }

    @PutMapping("/updateOnboardee")
    public OnboardeeEnt updateBoardee(@RequestBody OnboardeeEnt onboardee){
        return onboardeeRepository.updateBoardee(onboardee);
    }

    @GetMapping("/onboardee/{emailID}")
    public OnboardeeEnt getByID(@PathVariable("emailID") String emailID) {
        return onboardeeRepository.getByID(emailID);
    }

    @GetMapping("/onboardees")
    public List<OnboardeeEnt> getOnboardees() {
        return onboardeeRepository.allBoardees();
    }

    @DeleteMapping("/onboardee/{emailID}")
    public String deleteByID(@PathVariable("emailID") String emailID){
        return onboardeeRepository.deleteByID(emailID);
    }
    @GetMapping("/adminsa")
    public List<OnboardeeEnt> getAll() {
        return onboardeeRepositoryImpl.getAll();
    }

    
}