package com.accolite.ms.demo.dao;

import java.util.List;

import com.accolite.ms.demo.entity.OnboardeeEnt;

public interface OnboardeeRepository {
    OnboardeeEnt addBoardee(OnboardeeEnt onboardee);
    OnboardeeEnt updateBoardee(OnboardeeEnt onboardee);
    OnboardeeEnt getByID(String emailID);
    String deleteByID(String emailID);
    List<OnboardeeEnt> allBoardees();

    List<OnboardeeEnt> getAll();
}
