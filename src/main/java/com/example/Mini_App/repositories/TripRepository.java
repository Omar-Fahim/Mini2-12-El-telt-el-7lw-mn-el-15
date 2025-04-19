package com.example.Mini_App.repositories;

import com.example.Mini_App.models.Trip;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TripRepository extends JpaRepository< Trip , Long> {
    
}
