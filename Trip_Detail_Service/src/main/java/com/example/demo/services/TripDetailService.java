package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.TripDetail;
import com.example.demo.repos.TripDetailRepository;

@Service
public class TripDetailService {
	
	private TripDetailRepository repo;
	
	@Autowired
	public TripDetailService(TripDetailRepository repo) {
		super();
		this.repo = repo;
	}
	
	
	public List<TripDetail> findAll(){
		return repo.findAll();
	}
	public TripDetail save(TripDetail entity) {
		return repo.save(entity);
	}
	
	public List<TripDetail> findByDriverId(int driverId) {
		return repo.findByDriverId(driverId);
	}
	

}
