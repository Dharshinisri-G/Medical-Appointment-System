package dao;

import model.Doctor;
import java.util.List;
import java.util.ArrayList;
import java.io.*;

public class DoctorDAOImpl implements IDoctorDAO {
    private List<Doctor> doctors = new ArrayList<>();
    private static final String FILE_NAME = "doctors.txt"; // File to store doctor data

    public DoctorDAOImpl() {
        loadFromFile(); // Load data from file when the DAO is initialized
    }

    @Override
    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
        saveToFile(); // Save data to file after adding a doctor
    }

    @Override
    public Doctor getDoctorById(int id) {
        for (Doctor doctor : doctors) {
            if (doctor.getId() == id) return doctor;
        }
        return null;
    }

    @Override
    public List<Doctor> getAllDoctors() {
        return doctors;
    }

    @Override
    public boolean updateDoctor(Doctor updatedDoctor) {
        for (Doctor doctor : doctors) {
            if (doctor.getId() == updatedDoctor.getId()) {
                doctors.set(doctors.indexOf(doctor), updatedDoctor);
                saveToFile(); // Save data to file after updating a doctor
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean deleteDoctor(int id) {
        boolean removed = doctors.removeIf(doctor -> doctor.getId() == id);
        if (removed) saveToFile(); // Save data to file after deleting a doctor
        return removed;
    }

    // Save the list of doctors to a file
    public void saveToFile() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(doctors);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Load the list of doctors from a file
    @SuppressWarnings("unchecked")
    public void loadFromFile() {
        File file = new File(FILE_NAME);
        if (file.exists()) {
            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
                doctors = (List<Doctor>) ois.readObject();
            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("No existing data file found. Starting with an empty list.");
        }
    }
}