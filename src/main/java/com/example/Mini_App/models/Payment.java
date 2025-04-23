package com.example.Mini_App.models;

import jakarta.persistence.*;

@Entity
@Table(name = "payments")
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID;
    private Double amount;
    private String paymentMethod;
    private Boolean paymentStatus;

    @OneToOne
    @JoinColumn(name = "trip_id")
    private Trip trip;



    public Payment() {
    }
    public Payment(Long ID, Double amount, String paymentMethod, Boolean paymentStatus, Trip trip) {
        this.ID = ID;
        this.amount = amount;
        this.paymentMethod = paymentMethod;
        this.paymentStatus = paymentStatus;
        this.trip = trip;
    }
    public Payment(Long ID, Double amount, String paymentMethod, Boolean paymentStatus) {
        this.ID = ID;
        this.amount = amount;
        this.paymentMethod = paymentMethod;
        this.paymentStatus = paymentStatus;

    }

    public Payment(Double amount, String paymentMethod, Boolean paymentStatus, Trip trip) {
        this.amount = amount;
        this.paymentMethod = paymentMethod;
        this.paymentStatus = paymentStatus;
        this.trip = trip;

    }
    public Payment(Double amount, String paymentMethod, Boolean paymentStatus){
        this.amount = amount;
        this.paymentMethod = paymentMethod;
        this.paymentStatus = paymentStatus;

    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Boolean getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(Boolean paymentStatus) {
        this.paymentStatus = paymentStatus;
    }
    public Trip getTrip() {
        return trip;
    }

    public void setTrip(Trip trip) {
        this.trip = trip;
    }
}
