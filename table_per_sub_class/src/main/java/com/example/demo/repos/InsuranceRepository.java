package com.example.demo.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.entity.Insurance;

public interface InsuranceRepository<T extends Insurance> extends JpaRepository<T, Integer> {
	@Query(nativeQuery = true,value="select * from hari_health_insurance_2022")
	public List<Insurance> findHealthProduts();

	

}
