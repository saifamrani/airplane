package com.xyz.airplane.repositories;

import com.xyz.airplane.models.Airplane;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AirplaneRepository extends CrudRepository<Airplane,Integer> {
}
