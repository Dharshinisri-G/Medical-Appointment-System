package dao;

import model.Patient;
import java.util.List;

public interface IPatientDAO {
    void addPatient(Patient patient);
    Patient getPatientById(int id);
    List<Patient> getAllPatients();
    boolean updatePatient(Patient patient);
    boolean deletePatient(int id);
}
