package controller;

import dao.AdminDAO;
import models.Admin;

import java.sql.SQLException;
import java.util.*;

public class AdminController {
    AdminDAO admindao=new AdminDAO();
    public int  addAdmin(String name, String username, String password) throws SQLException {
           Admin admin=new Admin(name,username,password);
           return admindao.addAdmin(admin);
    }
    public List<Admin> viewAdmin() throws SQLException{
        return admindao.viewAdmin();
    }
    public List<Admin> viewAdminWithId(int id) throws SQLException{
        return admindao.viewAdminWithId(id);
    }

}
