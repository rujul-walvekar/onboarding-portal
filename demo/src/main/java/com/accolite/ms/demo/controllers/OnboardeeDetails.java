package com.accolite.ms.demo.controllers;

import com.accolite.ms.demo.model.OnboardeeEnt;
import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;
import org.springframework.jdbc.core.BeanPropertyRowMapper;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")//for angular

public class OnboardeeDetails {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @GetMapping("/onboardeeDetails")
    public List<OnboardeeEnt> getAllOnboardees() {
// Read values from Onboardee, Demand & Admin Table

        String sql= "SELECT board_details.Name as name, board_details.age as age, board_details.company as company, board_details.location as location, board_details.emailID as emailID, board_demand.demandID as demandID, board_status.b_status as bgCheck, board_status.boarding_status as onboardingStatus FROM board_details INNER JOIN board_demand ON board_details.id = board_demand.id INNER JOIN board_status ON board_demand.id = board_status.id";
        
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(OnboardeeEnt.class));
        
    }

            @GetMapping("/AdminDetails")
        public List<OnboardeeEnt> shouldGetAllOnboardeesForAdmin() {
    // Read values from Onboardee, Demand & Admin Table
    
            String sql= "SELECT admin.a_name as adminName, admin.a_num as adminNum, admin.a_email as adminEmailID, board_details.Name as name, board_details.age as age, board_details.company as company, board_details.location as location, board_details.emailID as emailID, board_status.b_status as bgCheck, board_status.boarding_status as onboardingStatus FROM board_details INNER JOIN board_status ON board_details.id = board_status.id INNER JOIN board_demand ON board_status.id = board_demand.id RIGHT JOIN admin ON board_demand.adminID= admin.adminID";
            
            return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(OnboardeeEnt.class));
        
    }

    @GetMapping("/DemandDetails")
    public List<OnboardeeEnt> shouldGetAllDemandIDForOnboardee() {
// Read values from Onboardee, Demand & Admin Table

        String sql= "SELECT board_details.Name as name, board_details.age as age, board_details.company as company, board_details.location as location, board_details.emailID as emailID, board_demand.demandID as demandID FROM board_details INNER JOIN board_demand ON board_details.id = board_demand.id ";
        
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(OnboardeeEnt.class));
        
    }
}