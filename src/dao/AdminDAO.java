package dao;

import models.Admin;
import utils.DBConnection;

import java.sql.*;
import java.util.List;

public class AdminDAO {
    String URL = "jdbc:mysql://localhost:3306/medical_db";
    String USER = "root";  // Change if needed
    String PASSWORD = "Mysql@225";
   public int addAdmin(Admin admin) throws SQLException {
       Connection connection= DriverManager.getConnection(URL,USER,PASSWORD);
       PreparedStatement ps=connection.prepareStatement("Insert into admin values(?,?,?);");
       ps.setString(2,admin.getName());
       ps.setString(3,admin.getUserName());
       ps.setString(4, admin.getPassword());
       int rows=ps.executeUpdate();
       return rows;
   }

//    public List<Admin> viewAdmin() {
//
//   }
//
//    public List<Admin> viewAdminWithId(int id) {
//
//    }
}
