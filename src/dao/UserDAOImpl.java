package dao;

import model.User;
import java.util.ArrayList;
import java.util.List;

public class UserDAOImpl implements IUserDAO {
    private List<User> users = new ArrayList<>();

    @Override
    public void addUser(User user) {
        users.add(user);
    }

    @Override
    public User getUserById(int id) {
        for (User user : users) {
            if (user.getId() == id) return user;
        }
        return null;
    }

    @Override
    public User getUserByUsername(String username) {
        for (User user : users) {
            if (user.getUsername().equals(username)) return user;
        }
        return null;
    }

    @Override
    public List<User> getAllUsers() {
        return users;
    }

    @Override
    public boolean updateUser(User updatedUser) {
        for (User user : users) {
            if (user.getId() == updatedUser.getId()) {
                users.set(users.indexOf(user), updatedUser);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean deleteUser(int id) {
        return users.removeIf(user -> user.getId() == id);
    }
}
