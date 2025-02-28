package dao;

import model.User;
import java.util.List;
import java.util.ArrayList;
import java.io.*;

public class UserDAOImpl implements IUserDAO {
    private List<User> users = new ArrayList<>();
    private static final String FILE_NAME = "users.txt"; // File to store user data

    public UserDAOImpl() {
        loadFromFile(); // Load data from file when the DAO is initialized
    }

    @Override
    public void addUser(User user) {
        users.add(user);
        saveToFile(); // Save data to file after adding a user
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
                saveToFile(); // Save data to file after updating a user
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean deleteUser(int id) {
        boolean removed = users.removeIf(user -> user.getId() == id);
        if (removed) saveToFile(); // Save data to file after deleting a user
        return removed;
    }

    // Save the list of users to a file
    public void saveToFile() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(users);
            System.out.println("✅ Data saved successfully to " + FILE_NAME);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("❌ Error saving data to file.");
        }
    }


    // Load the list of users from a file
    @SuppressWarnings("unchecked")
    public void loadFromFile() {
        File file = new File(FILE_NAME);
        if (!file.exists()) {
            System.out.println("⚠ No existing data file found. Starting fresh.");
            return;
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            users = (List<User>) ois.readObject();
            System.out.println("✅ Data loaded successfully from " + FILE_NAME);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("❌ Error loading data from file.");
        }
    }

}