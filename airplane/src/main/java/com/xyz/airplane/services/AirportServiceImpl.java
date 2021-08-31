package com.xyz.airplane.services;

import com.xyz.airplane.models.Airport;
import com.xyz.airplane.repositories.AirportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class AirportServiceImpl implements AirportService{
    @Autowired
    private AirportRepository airportRepository;
    @Override
    public List<Airport> findAllAirports() {
        Iterable<Airport> airportIterable = airportRepository.findAll();
        List<Airport> airports= new ArrayList<>();
        for (Airport airport : airportIterable){
            airports.add(airport);
        }
        return airports;

    }

    @Override
    public Airport createAirport(Airport airport) {
        return airportRepository.save(airport);
    }

    @Override
    public Airport updateAirport(Airport airport) {
        Optional<Airport> optionalAirport = airportRepository.findById(airport.getId());
        optionalAirport.get().setName(airport.getName());
        optionalAirport.get().setCountry(airport.getCountry());
        optionalAirport.get().setCity(airport.getCity());
        optionalAirport.get().setAirplaneList(airport.getAirplaneList());
        airportRepository.save(optionalAirport.get());
        return optionalAirport.get();
    }

    @Override
    public void deleteAirport(int id) {
        airportRepository.deleteById(id);
    }
}
