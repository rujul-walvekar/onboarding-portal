// package com.accolite.ms.demo.model;

// import lombok.AllArgsConstructor;
// import lombok.Data;
// import lombok.NoArgsConstructor;

// @Data
// @NoArgsConstructor
// @AllArgsConstructor
// public class OnboardeeEnt {
//     private String name;
//     private Integer age;
//     private String num;
//     private String company;
//     private String location;
//     private Float cgpa;
//     private String skills;
//     private String emailID;
//     private DemandEnt demand;
//     private StatusEnt status;
//     private AdminEnt admin;

//     public OnboardeeEnt(String name, int age, String num, String company, String location, Float cgpa, String skills ) {
//         this.name = name;
//         this.age = age;
//         this.num = num;
//         this.company = company;
//         this.location = location;
//         this.cgpa = cgpa;
//         this.skills = skills;
//     }
	

//     public OnboardeeEnt(String name, String company, String location, String emailID, int demandID, String bgCheck, String onboardingStatus) {
//         this.name = name;
//         this.company = company;
//         this.location = location;
//         this.emailID = emailID;
//         this.demand.demandID =demandID;
//         this.status.bgCheck = bgCheck;
//         this.status.onboardingStatus = onboardingStatus;
//     }

// 	public OnboardeeEnt(String name, String company, String location,String emailID) {
//         this.name = name;
//         this.company = company;
//         this.location = location;
//         this.emailID = emailID;
//     }


//     public String getName() {
//         return this.name;
//     }

//     public void setName(String name) {
//         this.name = name;
//     }

//     public Integer getAge() {
//         return this.age;
//     }

//     public void setAge(Integer age) {
//         this.age = age;
//     }

//     public String getNum() {
//         return this.num;
//     }

//     public void setNum(String num) {
//         this.num = num;
//     }

//     public String getCompany() {
//         return this.company;
//     }

//     public void setCompany(String company) {
//         this.company = company;
//     }

//     public String getLocation() {
//         return this.location;
//     }

//     public void setLocation(String location) {
//         this.location = location;
//     }

//     public Float getCgpa() {
//         return this.cgpa;
//     }

//     public void setCgpa(Float cgpa) {
//         this.cgpa = cgpa;
//     }

//     public String getSkills() {
//         return this.skills;
//     }

//     public void setSkills(String skills) {
//         this.skills = skills;
//     }

//     public String getEmailID() {
//         return this.emailID;
//     }

//     public void setEmailID(String emailID) {
//         this.emailID = emailID;
//     }

//     public void setDemand(DemandEnt demand){
//         this.demand = demand;
//     }
//     public void setStatus(StatusEnt status){
//         this.status = status;
//     }

//     public void setAdmin(AdminEnt admin){
//         this.admin = admin;
//     }


// }