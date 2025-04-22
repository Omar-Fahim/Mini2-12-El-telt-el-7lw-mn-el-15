package com.example.Mini_App.models;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "trips")
public class Trip {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    LocalDateTime tripDate;
    String origin;
    String destination;
    Double tripCost;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "captain_id" , referencedColumnName = "id")
    Captain captain;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "customer_id" , referencedColumnName = "id")
    Customer customer;



    public Trip() {
    }

    public Trip(LocalDateTime tripDate, String origin, String destination, Double tripCost, Captain captain, Customer customer) {
        this.tripDate = tripDate;
        this.origin = origin;
        this.destination = destination;
        this.tripCost = tripCost;
        this.captain = captain;
        this.customer = customer;
    }

    public Trip(Long id, LocalDateTime tripDate, String origin, String destination, Double tripCost, Captain captain, Customer customer) {
        this.id = id;
        this.tripDate = tripDate;
        this.origin = origin;
        this.destination = destination;
        this.tripCost = tripCost;
        this.captain = captain;
        this.customer = customer;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getTripDate() {
        return tripDate;
    }

    public void setTripDate(LocalDateTime tripDate) {
        this.tripDate = tripDate;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public Double getTripCost() {
        return tripCost;
    }

    public void setTripCost(Double tripCost) {
        this.tripCost = tripCost;
    }
}
