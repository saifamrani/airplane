package com.xyz.airplane.controllers;

import com.xyz.airplane.models.Airplane;
import com.xyz.airplane.services.AirplaneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("api/airplane")
public class AirplaneController {

    @Autowired
    private AirplaneService airplaneService;

    @GetMapping
    public ResponseEntity<List<Airplane>> getAllAirplanes(){
        return new ResponseEntity<>(airplaneService.findAllAirplanes(), HttpStatus.OK);
    }
    @PostMapping
    public ResponseEntity<Airplane> createAirPlane(@RequestBody Airplane airplane){
        return new ResponseEntity<>(airplaneService.createAirplane(airplane),HttpStatus.OK);
    }
    @PutMapping
    public ResponseEntity<Airplane> updateAirplane(@RequestBody Airplane airplane){
        return new ResponseEntity<>(airplaneService.updateAirplane(airplane),HttpStatus.OK);
    }
    @DeleteMapping("/{id}")
    public void deleteAirplane(@PathVariable int id ){
        System.out.println("id = " + id);
        airplaneService.deleteAirplane(id);
    }

}
