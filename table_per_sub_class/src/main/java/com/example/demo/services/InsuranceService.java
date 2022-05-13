package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.HealthInsurance;
import com.example.demo.entity.LifeInsurance;
import com.example.demo.repos.InsuranceRepository;

@Service
public class InsuranceService {
	
	@Autowired
	InsuranceRepository repo;
	
	@Autowired
	HealthInsurance entity;
	
	@Autowired
	LifeInsurance life;
	
	
	public void addHealthPolicy() {
		Object obj= repo.save(entity);
		
		if(obj!=null) {
			System.out.println("one record added");
		}
	}
	
	
	
	public void addLifePolicy() {
		Object lifeObj=repo.save(life);
		if(lifeObj!=null) {
			System.out.println("one record added");
		}
	}
	public void getLifePolicy() {
		repo.findAll().forEach(System.out::println);
	}
	
	public void findAll() {
		repo.findAll().forEach(System.out::println);
	}
	
	public void getHealthPolicy() {
		repo.findAll().forEach(System.out::println);
	}

	

	
	
}
