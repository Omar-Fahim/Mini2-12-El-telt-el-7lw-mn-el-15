package com.example.Mini_App.services;

import com.example.Mini_App.models.Rating;
import com.example.Mini_App.repositories.RatingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RatingService {
    private final RatingRepository ratingRepository;
    @Autowired
    public RatingService(RatingRepository ratingRepository) {
        this.ratingRepository = ratingRepository;
    }

    public Rating addRating(Rating rating) {
        return ratingRepository.save(rating);
    }

    public Rating updateRating(String id, Rating updatedRating){
        updatedRating.setId(id);
        return ratingRepository.save(updatedRating);
    }

    public void deleteRating(String id){
        ratingRepository.deleteById(id);
    }

    public List<Rating> getRatingsByEntity(Long entityId, String entityType){
        return ratingRepository.findByIdAndAndEntityType(entityId, entityType);
    }

    public List<Rating> findRatingsAboveScore(int minScore){
        return ratingRepository.findByScoreGreaterThan(minScore);
    }
}
