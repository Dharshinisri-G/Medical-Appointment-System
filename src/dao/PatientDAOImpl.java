package dao;

import model.Patient;
import java.util.ArrayList;
import java.util.List;

public class PatientDAOImpl implements IPatientDAO {
    private List<Patient> patients = new ArrayList<>();

    @Override
    public void addPatient(Patient patient) {
        patients.add(patient);
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
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean deletePatient(int id) {
        return patients.removeIf(patient -> patient.getId() == id);
    }
}
