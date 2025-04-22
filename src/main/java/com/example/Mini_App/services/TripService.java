package com.example.Mini_App.services;

import com.example.Mini_App.models.Trip;
import com.example.Mini_App.repositories.TripRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class TripService {


    private final TripRepository tripRepository;

    @Autowired
    public TripService(TripRepository tripRepository) {
        this.tripRepository = tripRepository;
    }

    public Trip addTrip(Trip trip){
        return tripRepository.save(trip);
    }

    public List<Trip> getAllTrips(){
        return tripRepository.findAll();
    }

    public Trip getTripById(Long id){
        Optional<Trip> t1 = tripRepository.findById(id);
        return t1.get();
    }

    public Trip updateTrip(Long id, Trip trip){
        trip.setId(id);
        return tripRepository.save(trip);
    }

    public void deleteTrip(Long id){
        tripRepository.deleteById(id);
    }

    public List<Trip> findTripsWithinDateRange(LocalDateTime startDate, LocalDateTime endDate){
        return tripRepository.findTripsWithinDateRange(startDate,endDate);
    }

    public List<Trip> findTripsByCaptainId(Long captainId){
        return tripRepository.findByCaptainId(captainId);
    }



}
