package com.example.Mini_App.repositories;

import com.example.Mini_App.models.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface PaymentRepository extends JpaRepository<Payment, Long> {
    // Finding payments with an amount above a set threshold.
    List<Payment> findByAmountGreaterThan(double threshold);



    // Finding payments by trip ID
    List<Payment> findByTripId(Long tripId);

}
