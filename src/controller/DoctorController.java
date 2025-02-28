package controller;

import dao.IDoctorDAO;
import dao.DoctorDAOImpl;
import model.Doctor;
import java.util.List;

public class DoctorController {
    private IDoctorDAO doctorDAO;

    public DoctorController() {
        this.doctorDAO = new DoctorDAOImpl();
    }

    public void addDoctor(Doctor doctor) {
        doctorDAO.addDoctor(doctor);
        System.out.println("✅ Doctor added successfully!");
    }

    public Doctor getDoctorById(int id) {
        return doctorDAO.getDoctorById(id);
    }

    public List<Doctor> getAllDoctors() {
        return doctorDAO.getAllDoctors();
    }

    public boolean updateDoctor(Doctor doctor) {
        return doctorDAO.updateDoctor(doctor);
    }

    public boolean deleteDoctor(int id) {
        return doctorDAO.deleteDoctor(id);
    }

    // Add this method to save data
    public void saveData() {
        ((DoctorDAOImpl) doctorDAO).saveToFile();
    }

    // Add this method to load data
    public void loadData() {
        ((DoctorDAOImpl) doctorDAO).loadFromFile();
    }
}