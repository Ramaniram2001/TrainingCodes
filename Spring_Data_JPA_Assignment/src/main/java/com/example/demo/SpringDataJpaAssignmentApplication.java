package com.example.demo;

import java.time.LocalDate;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

import com.example.demo.Service.EmployeeService;

import com.example.demo.entity.Employees;

@SpringBootApplication
public class SpringDataJpaAssignmentApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx=SpringApplication.run(SpringDataJpaAssignmentApplication.class, args);
		//Employees haripriya=ctx.getBean(Employees.class);
		EmployeeService service=ctx.getBean(EmployeeService.class);
		//findall
		System.err.println("find all ********************************");
		service.findAll().forEach(System.out::println);
		System.err.println("find by id ***********************************");
		service.findByEmployeeId(101).forEach(System.out::println);
		System.err.println("find by Employee name *******************************");
		System.out.println(service.findByEmployeeName("Rajesh"));
	    System.err.println("find or method *********************************");
	    service.findByLocationAndSkillset("Patna","BA").forEach(System.out::println);
	    System.err.println("date ***********************************");
	    service.findByDateOfBirth(LocalDate.of(2001,04,29)).forEach(System.out::println);
	    System.err.println("location ********************************");
	    service.findByLocation("Patna").forEach(System.out::println);
	    System.err.println("skillset ********************************");
	    service.findBySkillSet("SQL").forEach(System.out::println);
		
		//Employees added=service.add(haripriya);
//    	if(added!=null) {
//			System.out.println("One Employee Added");
//			
//    	}


			
			
			ctx.close();
		}
	
//	@Bean
//	public Employees ramesh() {
//		return new Employees(102,"Ramesh",LocalDate.of(2002,2,9),"Ooty","SQL",698587);
//		
//	}
//	@Bean
//	@Primary
//	public Employees haripriya() {
//		return new Employees(105,"Haripriya",LocalDate.of(2005,8,24),"Patna","BA",985587);
//		
//	}
	}

