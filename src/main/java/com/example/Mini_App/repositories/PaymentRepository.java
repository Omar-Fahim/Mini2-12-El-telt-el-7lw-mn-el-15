package com.example.Mini_App.repositories;

import com.example.Mini_App.models.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment, Long> {
    
}
