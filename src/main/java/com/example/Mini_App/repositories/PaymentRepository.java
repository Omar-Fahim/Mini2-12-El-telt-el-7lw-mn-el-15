package com.example.Mini_App.repositories;

import com.example.Mini_App.models.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PaymentRepository extends JpaRepository<Payment, Long> {
    // Finding payments with an amount above a set threshold.
    List<Payment> findByAmountGreaterThan(double threshold);

    
}
