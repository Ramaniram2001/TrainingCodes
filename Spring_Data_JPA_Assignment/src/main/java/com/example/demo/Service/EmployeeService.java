package com.example.demo.Service;

import java.time.LocalDate;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.demo.entity.Employees;
import com.example.demo.repo.EmployeeRepository;

@Service
public class EmployeeService {
	
	private EmployeeRepository repo;
	
	@Autowired
	public EmployeeService(EmployeeRepository repo) {
		super();
		this.repo = repo;
		System.err.println("repository implementation class:="+this.repo.getClass().getName());
	}
	
	public Employees add(Employees entity) {
		return this.repo.save(entity);
	}
	public List<Employees> findAll(){
		return this.repo.findAll();
	}
	
	public List<Employees> findByEmployeeId(int id){
		return this.repo.findByEmployeeId(id);
		
	}
	
	public Employees findByEmployeeName(String name){
		return this.repo.findByEmployeeName(name);
		
	}
	
	
	public List<Employees> findByLocationAndSkillset(String location,String skillset){
		return this.repo.getByLocationAndSkillset(location, skillset);
		}
	
	public List<Employees>  findByDateOfBirth(LocalDate date){
		return this.repo.findByDateOfBirth(date);
		
	}
	public List<Employees> findByLocation(String location){
		return this.repo.findByLocation(location);
	}
	
	public List<Employees> findBySkillSet(String skillset){
		return this.repo.findBySkillSet(skillset);
	}
	
	

}
