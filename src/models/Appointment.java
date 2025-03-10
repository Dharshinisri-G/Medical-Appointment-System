package models;
import java.util.Date;
public class Appointment {
    private int AppointmentId;
    private int DoctorId;
    private int PatientId;
    private Date Date;

    public Appointment(int DoctorId,int PatientId,Date Date){
        this.DoctorId=DoctorId;
        this.PatientId=PatientId;
        this.Date=Date;
    }

    public int getAppointmentId(){return AppointmentId;}
    public int getDoctorId(){return DoctorId;}
    public int getPatienId(){return PatientId;}
    public Date getDate(){return Date;}

    public String toString(){
        return "AppointmentId: "+AppointmentId+" | DoctorId: "+DoctorId+" | PatientId: "+PatientId+" | Date: "+Date;
    }
}