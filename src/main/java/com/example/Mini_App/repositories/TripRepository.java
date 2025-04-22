package com.example.Mini_App.repositories;

import com.example.Mini_App.models.Trip;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface TripRepository extends JpaRepository< Trip , Long> {

    @Query(value = "SELECT t.* FROM trip t WHERE t.trip_date >= :startDate AND t.trip_date <= :endDate" , nativeQuery = true)
    public List<Trip> findTripsWithinDateRange(@Param("startDate") LocalDateTime startDate ,@Param("endDate") LocalDateTime endDate);


    List<Trip> findByCaptainId(Long id);

}
