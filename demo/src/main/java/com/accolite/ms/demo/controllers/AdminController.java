// package com.accolite.ms.demo.controllers;

// import com.accolite.ms.demo.model.AdminEnt;
// import com.accolite.ms.demo.functions.AdminRepo;

// import java.util.List;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.web.bind.annotation.*;

// @RestController
// public class AdminController {

//     @Autowired
//     AdminRepo adminRepo;
//     AdminEnt admin;

//     @PostMapping("/admin")
//     public AdminEnt createAdmin(@RequestBody AdminEnt admin) {

//         return adminRepo.createAdminEnt(admin);

//     }
//     @PutMapping("/admin")
//     public AdminEnt updateAdmin(@RequestBody AdminEnt admin) {

//         return adminRepo.updateAdminEnt(admin);

//     }
//     @GetMapping("/admin/{emailID}")
//     public AdminEnt getAdminByEmail(@PathVariable("emailID") String emailID) {
//         return adminRepo.getAdminByEmailID(emailID);
//     }

//     @GetMapping("/admins")
//     public List<AdminEnt> getAdmins() {
//         return adminRepo.allAdminEnts();
//     }

//     @DeleteMapping("/admin/{emailID}")
//     public String deleteadmin(@PathVariable("emailID") String emailID){
//         return adminRepo.deleteAdminByEmailID(emailID);
//     }

// }
