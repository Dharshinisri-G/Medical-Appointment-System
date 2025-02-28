package dao;

import model.User;
import java.util.List;

public interface IUserDAO {
    void addUser(User user);
    User getUserById(int id);
    User getUserByUsername(String username);
    List<User> getAllUsers();
    boolean updateUser(User user);
    boolean deleteUser(int id);
}