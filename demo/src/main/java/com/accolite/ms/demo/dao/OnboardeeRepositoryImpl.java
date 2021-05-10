package com.accolite.ms.demo.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.accolite.ms.demo.entity.AdminEnt;
import com.accolite.ms.demo.entity.OnboardeeEnt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Repository;

@Repository
public class OnboardeeRepositoryImpl implements OnboardeeRepository {

    private static final String INSERT_ONBOARDEE = "INSERT INTO BOARD_DETAILS(name,age,num,company,location,cgpa,skills,emailID,demandID,bgCheck,boardingStatus) values (?,?,?,?,?,?,?,?,?,?,?)";
    private static final String UPDATE_ONBOARDEE_BY_ID = "UPDATE BOARD_DETAILS SET name=?,age=?,num=?,company=?,location=?,cgpa=?,skills=?,demandID=?,bgCheck=?,boardingStatus=? WHERE emailID = ?";
    private static final String GET_ONBOARDEE_BY_ID = "SELECT * FROM BOARD_DETAILS WHERE emailID=?";
    private static final String DELETE_ONBOARDEE_BY_ID = "DELETE FROM BOARD_DETAILS WHERE emailID=?";
    private static final String GET_ONBOARDEE_QUERY = "SELECT * FROM BOARD_DETAILS";
    private static final String GET_ALL = "SELECT board_details.Name, board_details.age, board_details.company, board_details.location, board_details.emailID, board_details.demandID, board_details.bgCheck, board_details.boardingStatus FROM board_details";

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public OnboardeeEnt addBoardee(OnboardeeEnt onboardee) {
        jdbcTemplate.update(INSERT_ONBOARDEE, onboardee.getName(), onboardee.getAge(), onboardee.getNum(), onboardee.getCompany(), onboardee.getLocation(), onboardee.getCgpa(),onboardee.getSkills(),onboardee.getEmailID(),onboardee.getDemandID(),onboardee.getBgCheck(),onboardee.getBoardingStatus());
        return onboardee;
    }

    @Override
    public OnboardeeEnt updateBoardee(OnboardeeEnt onboardee) {
        jdbcTemplate.update(UPDATE_ONBOARDEE_BY_ID, onboardee.getName(), onboardee.getAge(), onboardee.getNum(), onboardee.getCompany(), onboardee.getLocation(), onboardee.getCgpa(),onboardee.getSkills(),onboardee.getDemandID(),onboardee.getBgCheck(),onboardee.getBoardingStatus(),onboardee.getEmailID());
        return onboardee;
    }

    @Override
    public OnboardeeEnt getByID(String emailID) {
        return jdbcTemplate.queryForObject(GET_ONBOARDEE_BY_ID, (rs, rowNum) -> {

            return new OnboardeeEnt(
            rs.getString("name"),rs.getInt("age"), rs.getString("num"), rs.getString("company"), rs.getString("location"), rs.getFloat("cgpa"), rs.getString("skills"), rs.getString("emailID"), rs.getInt("demandID"), rs.getString("bgCheck"), rs.getString("boardingStatus"));
        },emailID);
    }

    @Override
    public String deleteByID(String emailID) {
        jdbcTemplate.update(DELETE_ONBOARDEE_BY_ID, emailID);
        // return "User got deleted with id " + emailID;
        return null;
    }

    @Override
    public List<OnboardeeEnt> allBoardees() {
        return jdbcTemplate.query(GET_ONBOARDEE_QUERY, (rs, rowNum) -> {
            return new OnboardeeEnt( rs.getString("name"),rs.getInt("age"), rs.getString("num"), rs.getString("company"), rs.getString("location"), rs.getFloat("cgpa"), rs.getString("skills"), rs.getString("emailID"), rs.getInt("demandID"), rs.getString("bgCheck"), rs.getString("boardingStatus"));
        });
    }

    @Override
    public
    List<OnboardeeEnt> getAll() {
        return jdbcTemplate.query(GET_ALL, new ResultSetExtractor<List<OnboardeeEnt>>() {
            @Override  
            public List<OnboardeeEnt> extractData(ResultSet rs) throws SQLException,DataAccessException{
            List<OnboardeeEnt> list=new ArrayList<OnboardeeEnt>();
            while(rs.next()){
                OnboardeeEnt onboardee=new OnboardeeEnt(null, 0, null, null, null, 0, null, null, 0, null, null);

                onboardee.setName(rs.getString("name"));
                onboardee.setCompany(rs.getString("company"));
                onboardee.setLocation(rs.getString("location"));
                onboardee.setEmailID(rs.getString("emailID"));
                onboardee.setDemandID(rs.getInt("demandID"));
                onboardee.setBgCheck(rs.getString("bg_Check"));
                onboardee.setBoardingStatus(rs.getString("boarding_status"));
                
                list.add(onboardee);

            }
            return list;
            }
        });
    }
}
