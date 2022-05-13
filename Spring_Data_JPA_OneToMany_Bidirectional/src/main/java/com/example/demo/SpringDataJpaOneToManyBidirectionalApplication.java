package com.example.demo;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.example.demo.entity.bidirect.Doctor;
import com.example.demo.entity.bidirect.Patient;
import com.example.demo.utils.bidirect.Utility;

@SpringBootApplication
public class SpringDataJpaOneToManyBidirectionalApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx=SpringApplication.run(SpringDataJpaOneToManyBidirectionalApplication.class, args);
	    Utility obj=ctx.getBean(Utility.class);
	    //obj.create();
	    //obj.findAll();
	    obj.findDoctorFrmPatient();
	    ctx.close();
	}
	
	@Bean
	public Doctor priya() {
		Doctor doc=new Doctor();
		doc.setDoctorId(101);
		doc.setDepartment("ENT");
		doc.setDoctorName("Priya");
		doc.setPhoneNumber(34563464);
		return doc;
	}
		
	@Bean
		public Patient reva(){
			
			return new Patient(201,"vedha",878789876l);
		}
	
	@Bean
	public Patient revathy(){
		
		return new Patient(202,"varma",78469876l);
	}
		

}
