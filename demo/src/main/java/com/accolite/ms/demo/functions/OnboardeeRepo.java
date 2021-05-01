package com.accolite.ms.demo.functions;

import com.accolite.ms.demo.model.OnboardeeEnt;

// import org.springframework.stereotype.Repository;

import java.util.List;

public interface OnboardeeRepo {

    OnboardeeEnt createOnboardeeEnt(OnboardeeEnt onboardee);

    OnboardeeEnt updateOnboardeeEnt(OnboardeeEnt onboardee);

    OnboardeeEnt getOnboardeeByEmailID(String emailID);

    String deleteOnboardeeByEmailID(String emailID);

    List<OnboardeeEnt> allOnboardeeEnts();
}

