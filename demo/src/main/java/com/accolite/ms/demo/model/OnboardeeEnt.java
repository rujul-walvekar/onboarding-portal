package com.accolite.ms.demo.model;

import java.util.List;

public class OnboardeeEnt {
    private String name;
    private Integer age;
    private String company;
    private String location;
    private String emailID;
    private Integer demandID;
    private String bg_check;
    private String onboardingStatus;
    private String adminName;
    private String adminNum;

    // private String adminEmailID;
    // private Float cgpa;
    // private List<String> skills;
    public OnboardeeEnt() {
    }
    public String getAdminName() {
        return this.adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    public String getAdminNum() {
        return this.adminNum;
    }

    public void setAdminNum(String adminNum) {
        this.adminNum = adminNum;
    }
    public String getEmailID() {
        return this.emailID;
    }

    public void setEmailID(String emailID) {
        this.emailID = emailID;
    }

    public Integer getDemandID() {
        return this.demandID;
    }

    public void setDemandID(Integer demandID) {
        this.demandID = demandID;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return this.age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getCompany() {
        return this.company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getLocation() {
        return this.location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    // public Float getCgpa() {
    //     return this.cgpa;
    // }

    // public void setCgpa(Float cgpa) {
    //     this.cgpa = cgpa;
    // }

    // public List<String> getSkills() {
    //     return this.skills;
    // }

    // public void setSkills(List<String> skills) {
    //     this.skills = skills;
    // }

    public String getBg_check() {
        return this.bg_check;
    }

    public void setBg_check(String bg_check) {
        this.bg_check = bg_check;
    }

    public String getOnboardingStatus() {
        return this.onboardingStatus;
    }

    public void setOnboardingStatus(String onboardingStatus) {
        this.onboardingStatus = onboardingStatus;
    }
}