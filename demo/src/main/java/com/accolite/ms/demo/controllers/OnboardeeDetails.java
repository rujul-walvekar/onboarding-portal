package com.accolite.ms.demo.controllers;

import com.accolite.ms.demo.entities.OnboardeeEnt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")

public class OnboardeeDetails {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @GetMapping("/onboardeeDetails")
    public List<OnboardeeEnt> getAllOnboardees() {
// Read values from Onboardee, Demand & Admin Table

        String sql= "SELECT board_details.Name as name, board_details.age as age, board_details.company as company, board_details.location as location, board_details.emailID as emailID, board_demand.demandID as demandID, board_status.b_status as bg_check, board_status.boarding_status as onboardingStatus FROM board_details INNER JOIN board_demand ON board_details.id = board_demand.id INNER JOIN board_status ON board_demand.id = board_status.id";
        
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(OnboardeeEnt.class));
        
    }
}