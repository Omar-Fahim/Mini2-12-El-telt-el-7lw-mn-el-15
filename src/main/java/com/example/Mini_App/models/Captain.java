package com.example.Mini_App.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "captain")
public class Captain {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID;
    private String Name;
    private String LicenseNumber;
    private Double AvgRatingScore;

    @OneToMany(mappedBy = "captain")
    @JsonIgnore
    private List<Trip> trips;

    public Captain() {
        this.trips = new ArrayList<>();
    }
    public Captain(String name, String licenseNumber, Double avgRatingScore) {
        this.Name = name;
        this.LicenseNumber = licenseNumber;
        this.AvgRatingScore = avgRatingScore;
        this.trips = new ArrayList<>();
    }
    public Captain(Long ID, String name, String licenseNumber, Double avgRatingScore) {
        this.ID = ID;
        this.Name = name;
        this.LicenseNumber = licenseNumber;
        this.AvgRatingScore = avgRatingScore;
        this.trips = new ArrayList<>();
    }
    public Long getID() {
        return ID;
    }
    public void setID(Long iD) {
        ID = iD;
    }
    public String getName() {
        return Name;
    }
    public void setName(String name) {
        Name = name;
    }
    public String getLicenseNumber() {
        return LicenseNumber;
    }
    public void setLicenseNumber(String licenseNumber) {
        LicenseNumber = licenseNumber;
    }
    public Double getAvgRatingScore() {
        return AvgRatingScore;
    }
    public void setAvgRatingScore(Double avgRatingScore) {
        AvgRatingScore = avgRatingScore;
    }
    public List<Trip> getTrips() {
        return trips;
    }
    public void setTrips(List<Trip> trips) {
        this.trips = trips;
    }

    
}
