// package com.accolite.ms.demo.controllers;

// import com.accolite.ms.demo.model.OnboardeeEnt;
// // import com.accolite.ms.demo.model.UpdateEnt;

// import org.springframework.beans.factory.annotation.Autowired;
// // import org.springframework.dao.DataAccessException;
// import org.springframework.jdbc.core.JdbcTemplate;
// import org.springframework.web.bind.annotation.*;
// // import org.springframework.jdbc.core.BeanPropertyRowMapper;

// // import java.sql.Types;
// // import java.util.List;
// @RestController
// @CrossOrigin(origins = "http://localhost:4200")
// public class UpdateDetails {

//     @Autowired
//     JdbcTemplate jdbcTemplate;


//     @PostMapping("/updateOnboardeeDetails")
//     public Integer updateOnboardee(OnboardeeEnt onboardeeEnt)
//     {
//         String sql= "UPDATE board_details SET location= 'Godric's Hollow' WHERE emailID='rujul.walvekar@accolitedigital.com'";
//         return jdbcTemplate.update(sql);
// }
    
// }