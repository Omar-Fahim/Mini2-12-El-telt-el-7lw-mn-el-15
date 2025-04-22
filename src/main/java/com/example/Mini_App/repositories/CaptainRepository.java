package com.example.Mini_App.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.Mini_App.models.Captain;
import java.util.List;

@Repository
public interface CaptainRepository extends JpaRepository<Captain, Long> {
    
   List<Captain> findByAvgRatingScoreGreaterThan(Double threshold);
   
   Captain findByLicenseNumber(String licenseNumber);

}
