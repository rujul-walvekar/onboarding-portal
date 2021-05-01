package com.accolite.ms.demo.model;

import org.springframework.stereotype.Component;

@Component
public class StatusEnt{
    String bgCheck;
    String onboardingStatus;

    public String getBgCheck() {
        return this.bgCheck;
    }

    public void setBgCheck(String bgCheck) {
        this.bgCheck = bgCheck;
    }

    public String getOnboardingStatus() {
        return this.onboardingStatus;
    }

    public void setOnboardingStatus(String onboardingStatus) {
        this.onboardingStatus = onboardingStatus;
    }
}