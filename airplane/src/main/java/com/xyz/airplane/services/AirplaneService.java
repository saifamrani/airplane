package com.xyz.airplane.services;

import com.xyz.airplane.models.Airplane;

import java.util.List;

public interface AirplaneService {
    List<Airplane> findAllAirplanes();

    Airplane createAirplane(Airplane airplane);

    Airplane updateAirplane(Airplane airplane);

    void deleteAirplane(int id);
}
