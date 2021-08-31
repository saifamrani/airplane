package com.xyz.airplane.controllers;

import com.xyz.airplane.models.Airplane;
import com.xyz.airplane.models.Airport;
import com.xyz.airplane.services.AirplaneService;
import com.xyz.airplane.services.AirportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("api/airport")
public class AirportController {
    @Autowired
    private AirportService airportService;

    @GetMapping
    public ResponseEntity<List<Airport>> getAllAirports(){
        return new ResponseEntity<>(airportService.findAllAirports(), HttpStatus.OK);
    }
    @PostMapping
    public ResponseEntity<Airport> createAirport(@RequestBody Airport airport){
        return new ResponseEntity<>(airportService.createAirport(airport),HttpStatus.OK);
    }
    @PutMapping
    public ResponseEntity<Airport> updateAirport(@RequestBody Airport airport){
        return new ResponseEntity<>(airportService.updateAirport(airport),HttpStatus.OK);
    }
    @DeleteMapping("/{id}")
    public void deleteAirplane(@PathVariable int id ){
        System.out.println("id = " + id);
        airportService.deleteAirport(id);
    }

}

