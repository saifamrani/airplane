package com.xyz.airplane.models;

import com.fasterxml.jackson.annotation.JsonTypeInfo;

import javax.persistence.*;
import java.util.List;

@Entity
public class Airport {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private String country;
    private String city;
    @OneToMany
    private List<Airplane> airplaneList;

    public Airport() {
    }

    public Airport(int id, String name, String country, String city, List<Airplane> airplaneList) {
        this.id = id;
        name = name;
        this.country = country;
        this.city = city;
        this.airplaneList = airplaneList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public List<Airplane> getAirplaneList() {
        return airplaneList;
    }

    public void setAirplaneList(List<Airplane> airplaneList) {
        this.airplaneList = airplaneList;
    }
}
