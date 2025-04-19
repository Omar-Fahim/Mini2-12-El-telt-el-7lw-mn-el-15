package com.example.Mini_App.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
public class Trip {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long ID;

    LocalDateTime TripDate;
    String Origin;
    String Destination;
    Double TripCost;

    public Trip() {
    }

    public Trip(LocalDateTime tripDate, String origin, String destination, Double tripCost) {
        TripDate = tripDate;
        Origin = origin;
        Destination = destination;
        TripCost = tripCost;
    }

    public Trip(Long ID, LocalDateTime tripDate, String origin, String destination, Double tripCost) {
        this.ID = ID;
        TripDate = tripDate;
        Origin = origin;
        Destination = destination;
        TripCost = tripCost;
    }

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public LocalDateTime getTripDate() {
        return TripDate;
    }

    public void setTripDate(LocalDateTime tripDate) {
        TripDate = tripDate;
    }

    public String getOrigin() {
        return Origin;
    }

    public void setOrigin(String origin) {
        Origin = origin;
    }

    public String getDestination() {
        return Destination;
    }

    public void setDestination(String destination) {
        Destination = destination;
    }

    public Double getTripCost() {
        return TripCost;
    }

    public void setTripCost(Double tripCost) {
        TripCost = tripCost;
    }
}
