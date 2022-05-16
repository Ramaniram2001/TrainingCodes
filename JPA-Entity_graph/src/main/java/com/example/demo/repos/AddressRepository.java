package com.example.demo.repos;

import java.util.List;

import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Address;
import com.example.demo.entity.City;


public interface AddressRepository extends JpaRepository<Address, Integer> {
	
	
	//if we comment the below line,we get nearly 7 sequel queries(user-3,city-2,address-2)
	//in order to get the direct sequel queries,WE WRITE THE BELOW CODE,we get only 3 joining the three table
	//but if we comment the queries from the bean till end we can get only one query that it refers
	//the findAll method 
	//but if we don't comment the bean in main method we will get three table such that the queries referring 
	//that the same values are not added 
//	@EntityGraph(attributePaths = {"user","city"},type=EntityGraph.EntityGraphType.LOAD)
//	List<Address> findAll();
//	
@EntityGraph(attributePaths = {"user"},type=EntityGraph.EntityGraphType.FETCH)
	List<Address> findAll();
	



}
