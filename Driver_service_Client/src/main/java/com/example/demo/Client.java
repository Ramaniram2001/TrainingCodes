package com.example.demo;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.example.demo.model.Driver;

@Component
public class Client {
	
	
	String BASEURL="http://localhost:8080/api/v1/user";
	private RestTemplate template;
	
	@Autowired
	public Client(RestTemplate template) {
		super();
		this.template=template;
	}
	
	public String invokeGetAll() {
		return template.getForObject(BASEURL,String.class);
	}
	
	public Driver[] invokeAllAsObject() {
		return template.getForObject(BASEURL,Driver[].class);
	}
	
	public void add() {
		HttpHeaders header=new HttpHeaders();
		header.setContentType(MediaType.APPLICATION_JSON);
		int driverId;
		String driverName;
		long mobileNumber;
		double rating;
		
		HashMap<String,Object> map=new HashMap<>();
		map.put("driverId",1020);
		map.put("driverName", "Siva");
		map.put("mobileNumber",678545);
		map.put("rating",3.3);
		
		HttpEntity<Map<String,Object>> entity =new HttpEntity(map,header);
		ResponseEntity<Driver>resp=this.template.postForEntity(BASEURL,entity,Driver.class);
		System.out.println("status code: ="+resp.getStatusCodeValue());
		System.out.println("body :=" + resp.getBody());
		System.out.println("location"+resp.getHeaders().get("location"));
	}

}
