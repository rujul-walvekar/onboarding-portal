package com.accolite.ms.demo.functions;

import java.util.List;

import com.accolite.ms.demo.model.AdminEnt;

public interface AdminRepo {
    AdminEnt createAdminEnt(AdminEnt admin);

    AdminEnt updateAdminEnt(AdminEnt admin);

    AdminEnt getAdminByEmailID(String emailID);

    String deleteAdminByEmailID(String emailID);

    List<AdminEnt> allAdminEnts();
}
