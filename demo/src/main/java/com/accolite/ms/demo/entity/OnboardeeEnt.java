package com.accolite.ms.demo.entity;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Component

public class OnboardeeEnt {
    private String name;
    private Integer age;
    private String num;
    private String company;
    private String location;
    private Float cgpa;
    private String skills;
    private String emailID;
    private Integer demandID;
    private String bgCheck;
    private String boardingStatus;
    private AdminEnt admin;


    public OnboardeeEnt(String name, int age, String num, String company, String location, float cgpa, String skills, String emailID, int demandID, String bgCheck, String boardingStatus) {
                this.name = name;
                this.age = age;
                this.num = num;
                this.company = company;
                this.location = location;
                this.cgpa = cgpa;
                this.skills = skills;
                this.emailID = emailID;
                this.demandID = demandID;
                this.bgCheck = bgCheck;
                this.boardingStatus = boardingStatus;
    }

    public void setAdmin(AdminEnt admin) {
        this.admin = admin;
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

    public String getNum() {
        return this.num;
    }

    public void setNum(String num) {
        this.num = num;
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

    public String getSkills() {
        return this.skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
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

    public String getBgCheck() {
        return this.bgCheck;
    }

    public void setBgCheck(String bgCheck) {
        this.bgCheck = bgCheck;
    }

    public String getBoardingStatus() {
        return this.boardingStatus;
    }

    public void setBoardingStatus(String boardingStatus) {
        this.boardingStatus = boardingStatus;
    }
}
