package com.accolite.ms.demo.model;

import java.util.List;

public class OnboardeeEnt {
    private String name;
    private Integer age;
    private String company;
    private String location;
    private String emailID;
    private Float cgpa;
    private List<String> skills;

    // public OnboardeeEnt() {
    // }

    public String getEmailID() {
        return this.emailID;
    }

    public void setEmailID(String emailID) {
        this.emailID = emailID;
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

    public Float getCgpa() {
        return this.cgpa;
    }

    public void setCgpa(Float cgpa) {
        this.cgpa = cgpa;
    }

    public List<String> getSkills() {
        return this.skills;
    }

    public void setSkills(List<String> skills) {
        this.skills = skills;
    }

}