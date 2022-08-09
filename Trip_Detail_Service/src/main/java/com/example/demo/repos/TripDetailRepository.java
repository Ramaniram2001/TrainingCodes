package com.example.demo.repos;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.TripDetail;

public interface TripDetailRepository extends JpaRepository<TripDetail,Integer> {
	
	public List<TripDetail> findByDriverId(int driverId);

}
