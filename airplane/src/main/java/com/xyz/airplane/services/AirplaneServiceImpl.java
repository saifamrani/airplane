package com.xyz.airplane.services;

import com.xyz.airplane.models.Airplane;
import com.xyz.airplane.repositories.AirplaneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class AirplaneServiceImpl implements AirplaneService{

    @Autowired
    private AirplaneRepository airplaneRepository;
    @Override
    public List<Airplane> findAllAirplanes() {
        Iterable<Airplane> airplaneIterable = airplaneRepository.findAll();
        List<Airplane> airplaneList= new ArrayList<>();
        for (Airplane airplane : airplaneIterable){
            airplaneList.add(airplane);
        }
        return airplaneList;
    }

    @Override
    public Airplane createAirplane(Airplane airplane) {
        return airplaneRepository.save(airplane);
    }

    @Override
    public Airplane updateAirplane(Airplane airplane) {
        Optional<Airplane> airplaneOptional = airplaneRepository.findById(airplane.getId());
        airplaneOptional.get().setTypeOfAirplane(airplane.getTypeOfAirplane());
        airplaneOptional.get().setAirplaneIdentificationPlate(airplane.getAirplaneIdentificationPlate());
        airplaneOptional.get().setCurrentAirfield(airplane.getCurrentAirfield());
        airplaneOptional.get().setFuel(airplane.getFuel());
        airplaneRepository.save(airplaneOptional.get());
        return airplaneOptional.get();
    }

    @Override
    public void deleteAirplane(int id) {
        airplaneRepository.deleteById(id);

    }
}
