package com.accolite.ms.demo.model;

public class AdminEnt {

    private String adminName;
    private String adminNum;
    private String adminEmailID;

    public AdminEnt(String adminName, String adminNum, String adminEmailID) {
        this.adminName = adminName;
        this.adminNum = adminNum;
        this.adminEmailID = adminEmailID;
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

    public String getAdminEmailID() {
        return this.adminEmailID;
    }

    public void setAdminEmailID(String adminEmailID) {
        this.adminEmailID = adminEmailID;
    }
    
}

    
