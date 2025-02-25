package com.medicalappointmentsystem.service;

import com.medicalappointmentsystem.dao.ScheduleDAO;
import com.medicalappointmentsystem.dao.impl.ScheduleDAOImpl;
import com.medicalappointmentsystem.model.Schedule;

import java.util.List;

public class ScheduleService {
    private ScheduleDAO scheduleDAO = new ScheduleDAOImpl();

    public void addSchedule(Schedule schedule) {
        scheduleDAO.addSchedule(schedule);
    }

    public List<Schedule> getSchedulesByDoctorId(int doctorId) {
        return scheduleDAO.getSchedulesByDoctorId(doctorId);
    }
}
