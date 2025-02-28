package controller;

import dao.IPatientDAO;
import dao.PatientDAOImpl;
import model.Patient;
import java.util.List;

public class PatientController {
    private IPatientDAO patientDAO;

    public PatientController() {
        this.patientDAO = new PatientDAOImpl();
    }

    public void addPatient(Patient patient) {
        patientDAO.addPatient(patient);
        System.out.println("✅ Patient added successfully!");
    }

    public Patient getPatientById(int id) {
        return patientDAO.getPatientById(id);
    }

    public List<Patient> getAllPatients() {
        return patientDAO.getAllPatients();
    }

    public boolean updatePatient(Patient patient) {
        return patientDAO.updatePatient(patient);
    }

    public boolean deletePatient(int id) {
        return patientDAO.deletePatient(id);
    }

    // Add this method to save data
    public void saveData() {
        ((PatientDAOImpl) patientDAO).saveToFile();
    }

    // Add this method to load data
    public void loadData() {
        ((PatientDAOImpl) patientDAO).loadFromFile();
    }
}