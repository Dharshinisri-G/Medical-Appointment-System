package controller;

import dao.DoctorDAO;
import models.Doctor;

import javax.print.Doc;
import java.util.*;

public class DoctorController {
    DoctorDAO doctorDAO=new DoctorDAO();
    public int addDoctor(String Name,int Age,String Contact,String Specialization,int Experience, int Limit,String UserName,String Password){
        Doctor doctor=new Doctor(Name, Age,Contact, Specialization, Experience,Limit,UserName,Password);
        return doctorDAO.addDoctor(doctor);
    }
    public List<Doctor> viewDoctors(){
        return doctorDAO.viewDoctors();
    }
    public List<Doctor> viewDoctorWithId(){
        return doctorDAO.viewDoctorWithId();
    }

}
