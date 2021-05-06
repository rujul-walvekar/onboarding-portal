package com.accolite.ms.demo.dao;
import java.util.List;

import com.accolite.ms.demo.entity.AdminEnt;

public interface AdminRepository {

    AdminEnt createAdminEnt(AdminEnt admin);

    AdminEnt updateAdminEnt(AdminEnt admin);

    AdminEnt getAdminByEmailID(String emailID);

    String deleteAdminByEmailID(String emailID);

    List<AdminEnt> allAdminEnts();
}

