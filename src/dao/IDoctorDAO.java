package dao;

import model.Doctor;
import java.util.List;

public interface IDoctorDAO {
    void addDoctor(Doctor doctor);
    Doctor getDoctorById(int id);
    List<Doctor> getAllDoctors();
    boolean updateDoctor(Doctor doctor);
    boolean deleteDoctor(int id);
}
