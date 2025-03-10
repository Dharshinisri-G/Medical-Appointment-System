package controller;
import dao.PatientDAO;
import models.Patient;

import java.util.*;
public class PatientController {
    PatientDAO patientDAO=new PatientDAO();
    public int addPatient(String Name,int Age,String Contact,String Gender,String Address,String UserName,String Password){
        Patient patient=new Patient(Name,Age,Contact,Gender,Address,UserName,Password);
        return patientDAO.addPatient(patient);
    }
    public List<Patient> viewPatients(){
        return patientDAO.viewPatients();
    }
    public List<Patient> viewPatientWithId(){
        return patientDAO.viewPatientWithId();
    }
}
