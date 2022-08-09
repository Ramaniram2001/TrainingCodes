package com.example.demo.controller;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.example.demo.entity.Driver;
import com.example.demo.services.DriverService;



@RestController
@RequestMapping(path="/api/v1")
public class DriverController {
	
	private DriverService service;

	
	@Autowired
	public DriverController(DriverService service) {
		super();
		this.service = service;
	}
	
	@GetMapping(path="/drivers")
	public List<Driver> getAllDriver(){
		return this.service.findAll();
	}
	

	@GetMapping(path="/drivers/srch/id/{id}")
	public Driver getDriverById(@PathVariable("id")int id) {
		return this.service.findById(id);
	}
	
	@PostMapping(path="/drivers")
	public ResponseEntity<Driver>addDriver(@RequestBody Driver entity) {
		Driver driver=this.service.add(entity);
		URI location=ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(entity.getDriverId()).toUri();
		//return ResponseEntity.status(201).body(driver);
	     return ResponseEntity.created(location).body(driver);
	}
	
    @DeleteMapping(path="/{id}")
  	public ResponseEntity<String> remove(@PathVariable("id")Driver entity) {
    	Driver var=this.service.removeById(entity);
        if (var!=null) {
        	return  ResponseEntity.status(204).build();
        }else {
        	return  ResponseEntity.ok("no record matching");
    	
    	
        }
}
    @GetMapping(path="/drivers/srch/phone/{mobileNumber}")
	public List<Driver> getDriverByMobileNumber(@PathVariable("mobileNumber")long number) {
		return this.service.srchByMobileNumber(number);
	}
    @GetMapping(path="/drivers/srch/name/{driverName}")
	public List<Driver> getDriverByDriverName(@PathVariable("driverName")String srchName) {
		return this.service.findByDriverName(srchName);
	}
    @GetMapping(path="/drivers/srch/rating/{rating}")
   	public List<Driver> getDriverByDriverRating(@PathVariable("rating")double rating) {
   		return this.service.srchByDriverRating(rating);
   	}
    
    @PutMapping(path="/drivers/{id}/{rating}")
 public ResponseEntity<Object>updateRating (@PathVariable("id")int id,@PathVariable("rating")double updateRating){
	
	int rowUpdated=this.service.updateRating(id, updateRating);
	if(rowUpdated !=0) {
		return ResponseEntity.status(200).body(rowUpdated+ " updated")
				;
	}else {
		return ResponseEntity.ok("not updated");

	}
    }
    
    @GetMapping(path="/drivers/srch/sort/{propName}")
  	public List<Driver> getDriverBySortedList(@PathVariable("propName")String name) {
  		return this.service.sortedList(name);
  	}
    
    
 


	
	

}
