package com.example.demo.controllers;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;



import com.example.demo.entity.TripDetail;


@RestController
@RequestMapping(path="/client")
public class TripDetailController {
	
	private RestTemplate template;
	
	@Autowired
	public TripDetailController(RestTemplate template) {
		super();
		this.template = template;
	}

	@GetMapping(path="/trips")
	public String getDrivers() {
		return this.template.getForObject("http://TRIP-DETAILS-SERVICE/api/v1/trips",String.class);
	}
	
	@GetMapping(path="/trips/json")
	public TripDetail[] getDriversAsJson() {
		return this.template.getForObject("http://TRIP-DETAILS-SERVICE/api/v1/trips",TripDetail[].class);
	}
	
	
	@GetMapping(path="/trips/srch/{driverId}")
	public TripDetail[] getByDriverId(@PathVariable("driverId") int driverId) {
		return this.template.getForObject("http://TRIP-DETAILS-SERVICE/api/v1/trips/srch/"+driverId,TripDetail[].class);
	}
	
}
