package com.example.Mini_App.repositories;

import com.example.Mini_App.models.Rating;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface RatingRepository extends MongoRepository<Rating, String> {
    List<Rating> findByIdAndAndEntityType(Long id, String entityType);
    List<Rating> findByScoreGreaterThan(Integer score);
}
