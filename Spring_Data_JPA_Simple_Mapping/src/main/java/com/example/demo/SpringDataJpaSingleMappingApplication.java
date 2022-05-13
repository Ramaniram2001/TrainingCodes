package com.example.demo;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

import com.example.demo.Service.DoctorService;
import com.example.demo.entity.Doctor;


@SpringBootApplication
public class SpringDataJpaSingleMappingApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx=SpringApplication.run(SpringDataJpaSingleMappingApplication.class, args);
		Doctor shiva=ctx.getBean(Doctor.class);
		Doctor ramesh=ctx.getBean(Doctor.class);
		DoctorService service=ctx.getBean(DoctorService.class);
		service.findByDept("ENT").forEach(System.out::println);
		System.err.println("**********************************");
		System.out.println(service.findByDoctorName("Shiva"));
		System.err.println("***********************************");
		System.out.println(service.findByDoctorNameAndDepartment("Ramya","ENT"));
     	System.err.println("**********************************");
     	System.out.println(service.findByNameOrDept("Haripriya","Cardiac"));
//	Doctor added=service.add(ramesh);
//	if(added!=null) {
//			System.out.println("One Doctor Added");
//		}
		
		
		//ctx.close();
	}
	@Bean
	public Doctor shiva() {
		return new Doctor(2020,"Shiva","ENT",8939659);
		
	}

	@Bean
	@Primary
	public Doctor ramesh() {
		return new Doctor(2024,"Ramesh","Dentist",9968678);
		
	}
	
}
