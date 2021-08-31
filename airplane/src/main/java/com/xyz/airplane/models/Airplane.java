package com.xyz.airplane.models;

import javax.persistence.*;
import java.util.List;

@Entity
public class Airplane {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private int id;
    private String typeOfAirplane;
    private String airplaneIdentificationPlate;
    private String currentAirfield;
    private String fuel;

    public Airplane() {
    }

    public Airplane(int id, String typeOfAirplane, String airplaneIdentificationPlate, String currentAirfield, String fuel) {
        this.id = id;
        this.typeOfAirplane = typeOfAirplane;
        this.airplaneIdentificationPlate = airplaneIdentificationPlate;
        this.currentAirfield = currentAirfield;
        this.fuel = fuel;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTypeOfAirplane() {
        return typeOfAirplane;
    }

    public void setTypeOfAirplane(String typeOfAirplane) {
        this.typeOfAirplane = typeOfAirplane;
    }

    public String getAirplaneIdentificationPlate() {
        return airplaneIdentificationPlate;
    }

    public void setAirplaneIdentificationPlate(String airplaneIdentificationPlate) {
        this.airplaneIdentificationPlate = airplaneIdentificationPlate;
    }

    public String getCurrentAirfield() {
        return currentAirfield;
    }

    public void setCurrentAirfield(String currentAirfield) {
        this.currentAirfield = currentAirfield;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }
}
