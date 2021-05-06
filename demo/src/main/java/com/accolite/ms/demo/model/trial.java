// // package com.accolite.ms.demo.model;

// // public class trial {


    
// // }

// // public class AdminRepImplement implements AdminRepo {
// //     private static final String INSERT_ADMIN="INSERT INTO admin (a_name, a_num, a_email) VALUES (?,?,?);";
// //     private static final String UPDATE_ADMIN="UPDATE admin SET a_name= ?, a_num = ?, a_email=? WHERE admin.adminID = ?";
// //     private static final String GET_ADMIN_BY_EMAILID = "SELECT * FROM admin WHERE a_email=?";
// //     private static final String DELETE_ADMIN_BY_EMAILID = "DELETE FROM admin WHERE a_email=?";
// //     private static final String GET_ADMINS="SELECT * FROM admin";

// //     @Autowired
// //     private JdbcTemplate jdbcTemplate;

// //     @Override
// //     public AdminEnt createAdminEnt(AdminEnt admin) {
// //         jdbcTemplate.update(INSERT_ADMIN, admin.getAdminName(), admin.getAdminNum(), admin.getAdminEmailID());
// //         return admin;
// //     }


// //     @Override
// //     public AdminEnt updateAdminEnt(AdminEnt admin) {
// //         jdbcTemplate.update(UPDATE_ADMIN,admin.getAdminName(), admin.getAdminNum(), admin.getAdminEmailID());
// //         return admin;
// //     }
// //     @Override
// //     public AdminEnt getAdminByEmailID(String emailID) {
// //         return jdbcTemplate.queryForObject(GET_ADMIN_BY_EMAILID, (rs, rowNum) -> {
// //             return new AdminEnt (rs.getString("a_name"),rs.getString("a_num"),rs.getString("a_email"));
// //         },emailID);
// //     }

// //     @Override
// //     public String deleteAdminByEmailID(String emailID) {
// //         jdbcTemplate.update(DELETE_ADMIN_BY_EMAILID, emailID);
// //         return "User got deleted with id " + emailID;
// //     }

// //     @Override
// //     public
// //     List<AdminEnt> allAdminEnts() {
// //         return jdbcTemplate.query(GET_ADMINS, (rs, rowNum) -> {
// //             return new AdminEnt (rs.getString("a_name"),rs.getString("a_num"),rs.getString("a_email"));
// //         });
// //     }

// // }

// @Repository
// public class OnboardeeRepImplement implements OnboardeeRepo {
//     private static final String INSERT_ONBOARDEE_DEET = "INSERT INTO board_details (name,age,num,company,location,cgpa,skills,emailID) values(?,?,?,?,?,?,?,?)";
//     private static final String UPDATE_ONBOARDEE_BY_EMAILID = "UPDATE board_details SET name=?,age=?,num=?,company=?,location=?,cgpa=?,skills=? WHERE emailID=?";
//     private static final String GET_ONBOARDEE_BY_EMAILID = "SELECT * FROM board_details WHERE emailID=?";
//     private static final String DELETE_ONBOARDEE_BY_EMAILID = "DELETE FROM board_details WHERE emailID=?";
//     private static final String GET_ONBOARDEES = "SELECT * FROM board_details";
//     private static final String GET_ALL = " SELECT admin.a_name as adminName, admin.a_num as adminNum, admin.a_email as adminEmailID, board_details.Name as name, board_details.age as age, board_details.company as company, board_details.location as location, board_details.emailID as emailID, board_status.bg_Check as bgCheck, board_status.boarding_status as onboardingStatus FROM board_details INNER JOIN board_status ON board_details.id = board_status.id INNER JOIN board_demand ON board_status.id = board_demand.id RIGHT JOIN admin ON board_demand.adminID= admin.adminID WHERE emailID=? ";
    
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
//     List<OnboardeeEnt> getAll(String emailID) {
//         return jdbcTemplate.query(GET_ALL, new ResultSetExtractor<List<OnboardeeEnt>>() {
//             @Override  
//             public List<OnboardeeEnt> extractData(ResultSet rs) throws SQLException,DataAccessException{
//             List<OnboardeeEnt> list=new ArrayList<OnboardeeEnt>();
//             while(rs.next()){
//                 OnboardeeEnt onboardee=new OnboardeeEnt(null, null, null, null);
//                 // DemandEnt demand=new DemandEnt();
//                 StatusEnt status=new StatusEnt();
//                 AdminEnt admin=new AdminEnt();

//                 admin.setAdminName(rs.getString("adminName"));
//                 admin.setAdminNum(rs.getString("adminNum"));
//                 admin.setAdminEmailID(rs.getString("adminEmailID"));
//                 onboardee.setName(rs.getString("name"));
//                 onboardee.setCompany(rs.getString("company"));
//                 onboardee.setLocation(rs.getString("location"));
//                 onboardee.setEmailID(rs.getString("emailID"));
//                 // demand.setDemandID(rs.getInt("demandID"));
//                 status.setBgCheck(rs.getString("bgCheck"));
//                 status.setOnboardingStatus(rs.getString("onboardingStatus"));
//                 // onboardee.setDemand(demand);
//                 onboardee.setStatus(status);
//                 onboardee.setAdmin(admin);
//                 list.add(onboardee);
//             }
//             return list;
//             }
//         },new Object[]{emailID});
// }
// }

// ---------------------
// package com.accolite.ms.demo.functions;

// import com.accolite.ms.demo.model.OnboardeeEnt;

// import java.util.List;

// public interface OnboardeeRepo {

//     OnboardeeEnt createOnboardeeEnt(OnboardeeEnt onboardee);

//     OnboardeeEnt updateOnboardeeEnt(OnboardeeEnt onboardee);

//     OnboardeeEnt getOnboardeeByEmailID(String emailID);

//     String deleteOnboardeeByEmailID(String emailID);

//     List<OnboardeeEnt> allOnboardeeEnts();
//     List<OnboardeeEnt> getAll(String emailID);
// }


// --------------------------
// package com.accolite.ms.demo.functions;

// import java.util.List;

// import com.accolite.ms.demo.model.AdminEnt;

// public interface AdminRepo {
//     AdminEnt createAdminEnt(AdminEnt admin);

//     AdminEnt updateAdminEnt(AdminEnt admin);//

//     AdminEnt getAdminByEmailID(String adminEmailID);//

//     String deleteAdminByEmailID(String adminEmailID);

//     List<AdminEnt> allAdminEnts();
//     List<AdminEnt> getAll(String adminEmailID);
// }
