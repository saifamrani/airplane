package com.xyz.airplane.repositories;

import com.xyz.airplane.models.Airport;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AirportRepository extends CrudRepository<Airport,Integer> {
}
