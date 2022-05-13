package com.example.demo.repo;

import java.time.LocalDate;
import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.entity.Employees;

public interface EmployeeRepository extends JpaRepository<Employees,Integer> {
	public List<Employees> findByEmployeeId(int id);
	public Employees findByEmployeeName(String name);

	
	@Query(nativeQuery=true,value="select * from hari_employee where location=:location and skillset=:skillset")
	public List<Employees> getByLocationAndSkillset(@Param("location") String location,@Param("skillset")String skillset);
	
	public List<Employees>  findByDateOfBirth(LocalDate date);
	

	public List<Employees>  findByLocation(String location);
	public List<Employees>  findBySkillSet(String skillset);
	

}
