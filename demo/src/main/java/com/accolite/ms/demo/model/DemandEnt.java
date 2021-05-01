package com.accolite.ms.demo.model;

import org.springframework.stereotype.Component;

@Component
public class DemandEnt{

    Integer demandID;

    public Integer getDemandID() {
        return this.demandID;
    }

    public void setDemandID(Integer demandID) {
        this.demandID = demandID;
    }

}
