package com.accolite.ms.demo.entity;

import org.springframework.stereotype.Component;

@Component
public class AdminEnt {

    private String aName;
    private String aNum;
    private String aEmail;

    public AdminEnt(String aName, String aNum,String aEmail) {

        this.aName = aName;
        this.aNum = aNum;
        this.aEmail = aEmail;
    }

    public AdminEnt() {
	}

	public String getAName() {
        return this.aName;
    }

    public void setAName(String aName) {
        this.aName = aName;
    }

    public String getAEmail() {
        return this.aEmail;
    }

    public void setAEmail(String aEmail) {
        this.aEmail = aEmail;
    }

    public String getANum() {
        return this.aNum;
    }

    public void setANum(String aNum) {
        this.aNum = aNum;
    }

}

