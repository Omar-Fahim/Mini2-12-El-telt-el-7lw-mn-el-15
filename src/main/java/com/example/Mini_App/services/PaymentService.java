package com.example.Mini_App.services;

import com.example.Mini_App.models.Payment;
import com.example.Mini_App.repositories.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaymentService {

    private final PaymentRepository paymentRepository;

    @Autowired
    public PaymentService(PaymentRepository paymentRepository) {
        this.paymentRepository = paymentRepository;
    }

    public Payment addPayment(Payment payment){
        return paymentRepository.save(payment);
    }
    public List<Payment> getAllPayments(){
        return paymentRepository.findAll();
    }

    public Payment getPaymentById(Long id){
        return paymentRepository.findById(id).orElse(null);
    }
    public Payment updatePayment(Long id, Payment payment){
        Payment existingPayment = paymentRepository.findById(id).orElse(null);
        if (existingPayment != null) {
            existingPayment = payment;
        }
        return null;
    }
    public void deletePayment(Long id){
        paymentRepository.deleteById(id);
    }
    public List<Payment> findByAmountThreshold(Double threshold){
        return paymentRepository.findByAmountGreaterThan(threshold);
    }

}