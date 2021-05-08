package com.accolite.ms.demo.controller;

import com.accolite.ms.demo.dao.AdminRepository;
import com.accolite.ms.demo.entity.AdminEnt;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:4200")//for angular
@RestController
public class AdminController {

    @Autowired
    AdminRepository adminRepository;
    AdminEnt admin;

    @PostMapping("/recruiter")
    public AdminEnt createAdmin(@RequestBody AdminEnt admin) {

        return adminRepository.createAdminEnt(admin);

    }
    @PutMapping("/recruiter")
    public AdminEnt updateAdmin(@RequestBody AdminEnt admin) {

        return adminRepository.updateAdminEnt(admin);

    }
    @GetMapping("/recruiter/{aEmail}")
    public AdminEnt getAdminByEmail(@PathVariable("aEmail") String aEmail) {
        return adminRepository.getAdminByEmailID(aEmail);
    }

    @GetMapping("/recruiters")
    public List<AdminEnt> getAdmins() {
        return adminRepository.allAdminEnts();
    }

    @DeleteMapping("/recruiter/{aEmail}")
    public String deleteadmin(@PathVariable("aEmail") String aEmail){
        return adminRepository.deleteAdminByEmailID(aEmail);
    }

}

