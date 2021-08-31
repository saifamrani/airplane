package com.xyz.airplane;

import com.xyz.airplane.models.Airplane;
import com.xyz.airplane.models.Airport;
import com.xyz.airplane.services.AirplaneService;
import com.xyz.airplane.services.AirportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class AirplaneApplication implements CommandLineRunner {

	@Autowired
	private AirplaneService airplaneService;
	@Autowired
	private AirportService airportService;

	public static void main(String[] args) {
		SpringApplication.run(AirplaneApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Airplane airplane = new Airplane(1,"Airbus A380","XYZ 103 443","Amsterdam","4 ton");
		List<Airplane> airplaneList = new ArrayList<>(Arrays.asList(airplane));

		Airport airport = new Airport(1,"Schiphol Airport","The Netherlands","Amsterdam",airplaneList);

		airplaneService.createAirplane(airplane);
		airportService.createAirport(airport);

	}
}
