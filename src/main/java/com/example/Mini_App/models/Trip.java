package com.example.Mini_App.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
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

    @OneToOne(mappedBy = "trip")
    @JsonIgnore
    private Payment payment;



    public Trip() {
    }

    public Trip(LocalDateTime tripDate, String origin, String destination, Double tripCost) {
        this.tripDate = tripDate;
        this.origin = origin;
        this.destination = destination;
        this.tripCost = tripCost;
    }
    public Trip(LocalDateTime tripDate, String origin, String destination, Double tripCost, Captain captain, Customer customer) {
        this.tripDate = tripDate;
        this.origin = origin;
        this.destination = destination;
        this.tripCost = tripCost;
        this.captain = captain;
        this.customer = customer;

    }

    public Trip(LocalDateTime tripDate, String origin, String destination, Double tripCost, Captain captain, Customer customer, Payment payment) {
        this.tripDate = tripDate;
        this.origin = origin;
        this.destination = destination;
        this.tripCost = tripCost;
        this.captain = captain;
        this.customer = customer;
        this.payment = payment;
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
    public Trip(Long id, LocalDateTime tripDate, String origin, String destination, Double tripCost, Captain captain, Customer customer, Payment payment) {
        this.id = id;
        this.tripDate = tripDate;
        this.origin = origin;
        this.destination = destination;
        this.tripCost = tripCost;
        this.captain = captain;
        this.customer = customer;
        this.payment = payment;
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

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Captain getCaptain() {
        return captain;
    }

    public void setCaptain(Captain captain) {
        this.captain = captain;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
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