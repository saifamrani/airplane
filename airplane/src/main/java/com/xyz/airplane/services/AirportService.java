package com.xyz.airplane.services;

import com.xyz.airplane.models.Airport;

import java.util.List;

public interface AirportService {
    List<Airport> findAllAirports();

    Airport createAirport(Airport airport);

    Airport updateAirport(Airport airport);

    void deleteAirport(int id);

}
