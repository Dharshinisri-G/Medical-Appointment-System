package controller;

import dao.IUserDAO;
import dao.UserDAOImpl;
import model.User;
import java.util.List;

public class UserController {
    private IUserDAO userDAO;

    public UserController() {
        this.userDAO = new UserDAOImpl();  // Using DAO implementation
    }

    public void registerUser(User user) {
        userDAO.addUser(user);
        System.out.println("✅ User registered successfully!");
    }

    public User getUserById(int id) {
        return userDAO.getUserById(id);
    }

    public User getUserByUsername(String username) {
        return userDAO.getUserByUsername(username);
    }

    public List<User> getAllUsers() {
        return userDAO.getAllUsers();
    }

    public boolean updateUser(User user) {
        return userDAO.updateUser(user);
    }

    public boolean deleteUser(int id) {
        return userDAO.deleteUser(id);
    }
}
