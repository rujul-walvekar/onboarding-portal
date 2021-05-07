// package com.accolite.ms.demo.functions;

// import java.sql.ResultSet;
// import java.sql.SQLException;
// import java.util.List;
// import java.util.ArrayList; 
// import org.springframework.jdbc.core.ResultSetExtractor;  

// import com.accolite.ms.demo.model.OnboardeeEnt;
// import com.accolite.ms.demo.model.DemandEnt;
// import com.accolite.ms.demo.model.StatusEnt;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.dao.DataAccessException;
// import org.springframework.jdbc.core.JdbcTemplate;
// import org.springframework.stereotype.Repository;

// @Repository
// public class OnboardeeRepImplement implements OnboardeeRepo {
//     private static final String INSERT_ONBOARDEE_DEET = "INSERT INTO board_details (name,age,num,company,location,cgpa,skills,emailID) values(?,?,?,?,?,?,?,?)";
//     private static final String UPDATE_ONBOARDEE_BY_EMAILID = "UPDATE board_details SET name=?,age=?,num=?,company=?,location=?,cgpa=?,skills=? WHERE emailID=?";
//     private static final String GET_ONBOARDEE_BY_EMAILID = "SELECT * FROM board_details WHERE emailID=?";
//     private static final String DELETE_ONBOARDEE_BY_EMAILID = "DELETE FROM board_details WHERE emailID=?";
//     private static final String GET_ONBOARDEES = "SELECT * FROM board_details";
//     private static final String GET_ALL = "SELECT board_details.Name, board_details.age, board_details.company, board_details.location, board_details.emailID, board_demand.demandID, board_status.bg_Check, board_status.boarding_status FROM board_details INNER JOIN board_demand ON board_details.id = board_demand.id INNER JOIN board_status ON board_demand.id = board_status.id";
//     @Autowired
//     private JdbcTemplate jdbcTemplate;
//     // private JdbcTemplate template;

//     // public void setTemplate(JdbcTemplate template) {  
//     //     this.template = template;  
//     // }  
    
//     @Override
//     public OnboardeeEnt createOnboardeeEnt(OnboardeeEnt onboardee) {
//         jdbcTemplate.update(INSERT_ONBOARDEE_DEET, onboardee.getName(), onboardee.getAge(), onboardee.getNum(), onboardee.getCompany(), onboardee.getLocation(), onboardee.getCgpa(), onboardee.getSkills(), onboardee.getEmailID());
//         return onboardee;
//     }


//     @Override
//     public OnboardeeEnt updateOnboardeeEnt(OnboardeeEnt onboardee) {
//         jdbcTemplate.update(UPDATE_ONBOARDEE_BY_EMAILID,onboardee.getName(), onboardee.getAge(), onboardee.getNum(), onboardee.getCompany(), onboardee.getLocation(), onboardee.getCgpa(), onboardee.getSkills(), onboardee.getEmailID());
//         return onboardee;
//     }
//     @Override
//     public  OnboardeeEnt getOnboardeeByEmailID(String emailID) {
//         return jdbcTemplate.queryForObject(GET_ONBOARDEE_BY_EMAILID, (rs, rowNum) -> {
//             return new OnboardeeEnt(rs.getString("name"),rs.getInt("age"),rs.getString("num"), rs.getString("company"), rs.getString("location"), rs.getFloat("cgpa"), rs.getString("skills"));
//         },emailID);
//     }

//     @Override
//     public String deleteOnboardeeByEmailID(String emailID) {
//         jdbcTemplate.update(DELETE_ONBOARDEE_BY_EMAILID, emailID);
//         return "User got deleted with id " + emailID;
//     }

//     @Override
//     public
//     List<OnboardeeEnt> allOnboardeeEnts() {
//         return jdbcTemplate.query(GET_ONBOARDEES, (rs, rowNum) -> {
//             return new OnboardeeEnt(rs.getString("name"),rs.getInt("age"),rs.getString("num"), rs.getString("company"), rs.getString("location"), rs.getFloat("cgpa"), rs.getString("skills"));
//         });

//     }

//     @Override
//     public
//     List<OnboardeeEnt> getAll() {
//         return jdbcTemplate.query(GET_ALL, new ResultSetExtractor<List<OnboardeeEnt>>() {
//             @Override  
//             public List<OnboardeeEnt> extractData(ResultSet rs) throws SQLException,DataAccessException{
//             List<OnboardeeEnt> list=new ArrayList<OnboardeeEnt>();
//             while(rs.next()){
//                 OnboardeeEnt onboardee=new OnboardeeEnt(null, null, null, null);
//                 DemandEnt demand=new DemandEnt();
//                 StatusEnt status=new StatusEnt();

//                 onboardee.setName(rs.getString("name"));
//                 onboardee.setCompany(rs.getString("company"));
//                 onboardee.setLocation(rs.getString("location"));
//                 onboardee.setEmailID(rs.getString("emailID"));
//                 demand.setDemandID(rs.getInt("demandID"));
//                 status.setBgCheck(rs.getString("bg_Check"));
//                 status.setOnboardingStatus(rs.getString("boarding_status"));
//                 onboardee.setDemand(demand);
//                 onboardee.setStatus(status);
                
//                 list.add(onboardee);

//             }
//             return list;
//             }
//         });
// }
// }