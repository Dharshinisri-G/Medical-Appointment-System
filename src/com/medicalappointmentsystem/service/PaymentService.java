package com.medicalappointmentsystem.service;

import com.medicalappointmentsystem.dao.PaymentDAO;
import com.medicalappointmentsystem.dao.impl.PaymentDAOImpl;
import com.medicalappointmentsystem.model.Payment;

import java.util.List;

public class PaymentService {
    private PaymentDAO paymentDAO = new PaymentDAOImpl();

    public void addPayment(Payment payment) {
        paymentDAO.addPayment(payment);
    }

    public List<Payment> getPaymentsByPatientId(int patientId) {
        return paymentDAO.getPaymentsByPatientId(patientId);
    }
}
