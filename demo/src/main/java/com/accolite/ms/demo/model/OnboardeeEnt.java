package com.accolite.ms.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
// import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OnboardeeEnt {
    private String name;
    private Integer age;
    private Integer num;
    private String company;
    private String location;
    private Float cgpa;
    private String skills;
    private String emailID;

    public OnboardeeEnt(String name, int age, int num, String company, String location, Float cgpa, String skills ) {
        this.name = name;
        this.age = age;
        this.num = num;
        this.company = company;
        this.location = location;
        this.cgpa = cgpa;
        this.skills = skills;
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

    public Integer getNum() {
        return this.num;
    }

    public void setNum(Integer num) {
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


}