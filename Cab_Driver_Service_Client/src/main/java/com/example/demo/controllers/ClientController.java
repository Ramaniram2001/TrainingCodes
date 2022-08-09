package com.example.demo.controllers;

import java.util.Arrays;


import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.demo.dto.TripDTO;
import com.example.demo.entity.CabDriver;
import com.example.demo.entity.TripDetail;

@RestController
@RequestMapping(path="/client")
public class ClientController {
	
	private RestTemplate template;
	@Autowired
	private TripDTO dto;
	
	@Autowired
	public ClientController(RestTemplate template) {
		super();
		this.template = template;
	}
	
	@GetMapping(path="/drivers")
	public String getDrivers() {
		return this.template.getForObject("http://CAB-DRIVER-SERVICE/api/v1/drivers",String.class);
	}
	
	@GetMapping(path="/drivers/json")
	public CabDriver[] getDriversAsJson() {
		return this.template.getForObject("http://CAB-DRIVER-SERVICE/api/v1/drivers",CabDriver[].class);
	}
	
	
	@GetMapping(path="/drivers/srch/{name}")
	public String getDriversByName(@PathVariable("name") String name) {
		return this.template.getForObject("http://CAB-DRIVER-SERVICE/api/v1/drivers/srch/"+name,String.class);
	}
	
	@GetMapping(path="/trips")
	public String gettrips() {
		return this.template.getForObject("http://TRIP-DETAILS-SERVICE/api/v1/trips",String.class);
	}
	
//	//FOR MERGING
//	@GetMapping(path="/driver/trips/{id}")
//	public TripDTO getDriverTrips(@PathVariable("id")int id) {
//		CabDriver driver=this.template.getForObject("http://CAB-DRIVER-SERVICE/api/v1/drivers/"+id,CabDriver.class);
//		TripDetail[] trips=this.template.getForObject("http://TRIP-DETAILS-SERVICE/api/v1/trips/"+id,TripDetail[].class);
//	
//			
//			Set<TripDetail> tripSet=Arrays.stream(trips).collect(Collectors.toSet());
//			dto.setDriver(driver);
//			
//			dto.setTrips(tripSet);
//
//			return dto;
//			}		
		
				
	@GetMapping(path = "/drivers/trips/json/{id}")
	public TripDTO getDriverTripsJson(@PathVariable("id") int id) {
		CabDriver driver = this.template.getForObject("http://CAB-DRIVER-SERVICE/api/v1/drivers/"+id, CabDriver.class);

		TripDetail[] trips =  this.template.getForObject("http://TRIP-DETAILS-SERVICE/api/v1/trips/"+id, TripDetail[].class);
		
		Set<TripDetail> tripSet=Arrays.stream(trips).collect(Collectors.toSet());
		dto.setDriver(driver);
		
		
		
		
		
		
		dto.setTrips(tripSet);

		return dto;
		}		
	}
		
		
		
	
	

