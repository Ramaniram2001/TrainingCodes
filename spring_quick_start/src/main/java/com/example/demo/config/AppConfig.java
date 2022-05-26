package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.example.demo.model.Customer;
import com.example.demo.model.Product;
import com.example.demo.model.Student;
import com.example.demo.model.Teacher;

@Configuration
public class AppConfig {
	
	//id of the bean as the method name
	//ram is the method name which is by default in lower case
	//but class name is in upper case which should be changed to upper case
	@Bean
	public Student ram() {
		return new Student(101,"Ramesh",89);//creating the object
	}
	
	
	@Bean
	public Teacher harish() {
		return new Teacher(4848,"Harish","Computer Science");//creating the object
	}
	
	@Bean
	public Product tv() {
		return new Product(101,"sony tv");
	}
	
	@Bean
	public Customer suresh() {
		return new Customer(201,"Suresh");
	}
	
	
	@Bean
	public Customer magesh() {
		return new Customer(301,"magesh");
	}
	
	
	@Bean
	public Customer rajesh() {
		return new Customer(401,"Rajesh");
	}
	
	
	

}
