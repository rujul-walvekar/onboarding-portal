// package com.accolite.ms.demo.functions;

// import java.util.List;

// import com.accolite.ms.demo.model.AdminEnt;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.jdbc.core.JdbcTemplate;
// import org.springframework.stereotype.Repository;

// @Repository
// public class AdminRepImplement implements AdminRepo {
//     private static final String INSERT_ADMIN="INSERT INTO admin (a_name, a_num, a_email) VALUES (?,?,?);";
//     private static final String UPDATE_ADMIN="UPDATE admin SET a_name= ?, a_num = ?, a_email=? WHERE admin.adminID = ?";
//     private static final String GET_ADMIN_BY_EMAILID = "SELECT * FROM admin WHERE a_email=?";
//     private static final String DELETE_ADMIN_BY_EMAILID = "DELETE FROM admin WHERE a_email=?";
//     private static final String GET_ADMINS="SELECT * FROM admin";

//     @Autowired
//     private JdbcTemplate jdbcTemplate;

//     @Override
//     public AdminEnt createAdminEnt(AdminEnt admin) {
//         jdbcTemplate.update(INSERT_ADMIN, admin.getAdminName(), admin.getAdminNum(), admin.getAdminEmailID());
//         return admin;
//     }


//     @Override
//     public AdminEnt updateAdminEnt(AdminEnt admin) {
//         jdbcTemplate.update(UPDATE_ADMIN,admin.getAdminName(), admin.getAdminNum(), admin.getAdminEmailID());
//         return admin;
//     }
//     @Override
//     public AdminEnt getAdminByEmailID(String emailID) {
//         return jdbcTemplate.queryForObject(GET_ADMIN_BY_EMAILID, (rs, rowNum) -> {
//             return new AdminEnt (rs.getString("a_name"),rs.getString("a_num"),rs.getString("a_email"));
//         },emailID);
//     }

//     @Override
//     public String deleteAdminByEmailID(String emailID) {
//         jdbcTemplate.update(DELETE_ADMIN_BY_EMAILID, emailID);
//         return "User got deleted with id " + emailID;
//     }

//     @Override
//     public
//     List<AdminEnt> allAdminEnts() {
//         return jdbcTemplate.query(GET_ADMINS, (rs, rowNum) -> {
//             return new AdminEnt (rs.getString("a_name"),rs.getString("a_num"),rs.getString("a_email"));
//         });
//     }

// }
