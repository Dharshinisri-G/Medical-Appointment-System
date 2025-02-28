package dao;

import model.Patient;
import java.util.List;
import java.util.ArrayList;
import java.io.*;

public class PatientDAOImpl implements IPatientDAO {
    private List<Patient> patients = new ArrayList<>();
    private static final String FILE_NAME = "patients.txt"; // File to store patient data

    public PatientDAOImpl() {
        loadFromFile(); // Load data from file when the DAO is initialized
    }

    @Override
    public void addPatient(Patient patient) {
        patients.add(patient);
        saveToFile(); // Save data to file after adding a patient
    }

    @Override
    public Patient getPatientById(int id) {
        for (Patient patient : patients) {
            if (patient.getId() == id) return patient;
        }
        return null;
    }

    @Override
    public List<Patient> getAllPatients() {
        return patients;
    }

    @Override
    public boolean updatePatient(Patient updatedPatient) {
        for (Patient patient : patients) {
            if (patient.getId() == updatedPatient.getId()) {
                patients.set(patients.indexOf(patient), updatedPatient);
                saveToFile(); // Save data to file after updating a patient
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean deletePatient(int id) {
        boolean removed = patients.removeIf(patient -> patient.getId() == id);
        if (removed) saveToFile(); // Save data to file after deleting a patient
        return removed;
    }

    // Save the list of patients to a file
    public void saveToFile() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(patients);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Load the list of patients from a file
    @SuppressWarnings("unchecked")
    public void loadFromFile() {
        File file = new File(FILE_NAME);
        if (file.exists()) {
            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
                patients = (List<Patient>) ois.readObject();
            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("No existing data file found. Starting with an empty list.");
        }
    }
}