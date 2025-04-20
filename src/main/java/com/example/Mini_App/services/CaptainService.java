package com.example.Mini_App.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.Mini_App.models.Captain;
import com.example.Mini_App.repositories.CaptainRepository;

@Service
public class CaptainService {
    
    private final CaptainRepository captainRepository;

    public CaptainService(CaptainRepository captainRepository) {
        this.captainRepository = captainRepository;
    }

    public Captain addCaptain(Captain captain){
        return captainRepository.save(captain);
    }

    public List<Captain> getAllCaptains(){
        return captainRepository.findAll();
    }

    public Captain getCaptainById(Long id){
        return captainRepository.findById(id).orElse(null);
    }

    public List<Captain> getCaptainsByRating(Double ratingThreshold){
        return captainRepository.findByAvgRatingScoreGreaterThan(ratingThreshold);
    }

    public Captain getCaptainByLicenseNumber(String licenseNumber){
        return captainRepository.findByLicenseNumber(licenseNumber);
    }
}
