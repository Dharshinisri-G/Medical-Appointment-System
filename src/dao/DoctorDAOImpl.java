package dao;

import model.Doctor;
import java.util.ArrayList;
import java.util.List;

public class DoctorDAOImpl implements IDoctorDAO {
    private List<Doctor> doctors = new ArrayList<>();

    @Override
    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
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
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean deleteDoctor(int id) {
        return doctors.removeIf(doctor -> doctor.getId() == id);
    }
}
