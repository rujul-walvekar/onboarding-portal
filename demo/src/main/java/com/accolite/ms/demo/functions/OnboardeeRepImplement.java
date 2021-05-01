package com.accolite.ms.demo.functions;

import java.util.List;

import com.accolite.ms.demo.model.OnboardeeEnt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class OnboardeeRepImplement implements OnboardeeRepo {
    private static final String INSERT_ONBOARDEE_DEET = "INSERT INTO board_details (name,age,num,company,location,cgpa,skills,emailID) values(?,?,?,?,?,?,?,?)";
    private static final String UPDATE_ONBOARDEE_BY_EMAILID = "UPDATE board_details SET name=?,age=?,num=?,company=?,location=?,cgpa=?,skills=? WHERE emailID=?";
    private static final String GET_ONBOARDEE_BY_EMAILID = "SELECT * FROM board_details WHERE emailID=?";
    private static final String DELETE_ONBOARDEE_BY_EMAILID = "DELETE FROM board_details WHERE emailID=?";
    private static final String GET_ONBOARDEES = "SELECT * FROM board_details";
    @Autowired
    private JdbcTemplate jdbcTemplate;
    
    @Override
    public OnboardeeEnt createOnboardeeEnt(OnboardeeEnt onboardee) {
        jdbcTemplate.update(INSERT_ONBOARDEE_DEET, onboardee.getName(), onboardee.getAge(), onboardee.getNum(), onboardee.getCompany(), onboardee.getLocation(), onboardee.getCgpa(), onboardee.getSkills(), onboardee.getEmailID());
        return onboardee;
    }


    @Override
    public OnboardeeEnt updateOnboardeeEnt(OnboardeeEnt onboardee) {
        jdbcTemplate.update(UPDATE_ONBOARDEE_BY_EMAILID,onboardee.getName(), onboardee.getAge(), onboardee.getNum(), onboardee.getCompany(), onboardee.getLocation(), onboardee.getCgpa(), onboardee.getSkills(), onboardee.getEmailID());
        return onboardee;
    }
    @Override
    public  OnboardeeEnt getOnboardeeByEmailID(String emailID) {
        return jdbcTemplate.queryForObject(GET_ONBOARDEE_BY_EMAILID, (rs, rowNum) -> {
            return new OnboardeeEnt(rs.getString("name"),rs.getInt("age"),rs.getInt("num"), rs.getString("company"), rs.getString("location"), rs.getFloat("cgpa"), rs.getString("skills"));
        },emailID);
    }

    @Override
    public String deleteOnboardeeByEmailID(String emailID) {
        jdbcTemplate.update(DELETE_ONBOARDEE_BY_EMAILID, emailID);
        return "User got deleted with id " + emailID;
    }

    @Override
    public
    List<OnboardeeEnt> allOnboardeeEnts() {
        return jdbcTemplate.query(GET_ONBOARDEES, (rs, rowNum) -> {
            return new OnboardeeEnt(rs.getString("name"),rs.getInt("age"),rs.getInt("num"), rs.getString("company"), rs.getString("location"), rs.getFloat("cgpa"), rs.getString("skills"));
        });
    }
}
