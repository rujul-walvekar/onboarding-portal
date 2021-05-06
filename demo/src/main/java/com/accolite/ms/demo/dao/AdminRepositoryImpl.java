package com.accolite.ms.demo.dao;

import com.accolite.ms.demo.entity.AdminEnt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public class AdminRepositoryImpl implements AdminRepository{
    private static final String INSERT_ADMIN="INSERT INTO admin (aName, aNum, aEmail) VALUES (?,?,?);";
    private static final String UPDATE_ADMIN="UPDATE admin SET aName= ?, aNum = ? WHERE aEmail = ?";
    private static final String GET_ADMIN_BY_EMAILID = "SELECT * FROM admin WHERE aEmail=?";
    private static final String DELETE_ADMIN_BY_EMAILID = "DELETE FROM admin WHERE aEmail=?";
    private static final String GET_ADMINS="SELECT * FROM admin";

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public AdminEnt createAdminEnt(AdminEnt admin) {
        jdbcTemplate.update(INSERT_ADMIN, admin.getAName(), admin.getANum(), admin.getAEmail());
        return admin;
    }


    @Override
    public AdminEnt updateAdminEnt(AdminEnt admin) {
        jdbcTemplate.update(UPDATE_ADMIN,admin.getAName(), admin.getANum(), admin.getAEmail());
        return admin;
    }
    @Override
    public AdminEnt getAdminByEmailID(String aEmail) {
        return jdbcTemplate.queryForObject(GET_ADMIN_BY_EMAILID, (rs, rowNum) -> {
            return new AdminEnt (rs.getString("aName"),rs.getString("aNum"),rs.getString("aEmail"));
        },aEmail);
    }

    @Override
    public String deleteAdminByEmailID(String aEmail) {
        jdbcTemplate.update(DELETE_ADMIN_BY_EMAILID, aEmail);
        return "User got deleted with id " + aEmail;
    }

    @Override
    public
    List<AdminEnt> allAdminEnts() {
        return jdbcTemplate.query(GET_ADMINS, (rs, rowNum) -> {
            return new AdminEnt (rs.getString("aName"),rs.getString("aNum"),rs.getString("aEmail"));
        });
    }

}

