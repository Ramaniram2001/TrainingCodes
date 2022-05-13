package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.example.demo.entity.Doctor;
import com.example.demo.entity.Patient;
import com.example.demo.utils.DoctorUtils;

@SpringBootApplication
public class SpringDataJpaOneToManyApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx=SpringApplication.run(SpringDataJpaOneToManyApplication.class, args);
		DoctorUtils obj=ctx.getBean(DoctorUtils.class);
		
	
		obj.create();
		//obj.findAll();
		
		
		
		
		
		
		ctx.close();
	}
	
	
	@Bean
	public Doctor priya() {
		Doctor doc=new Doctor();
		doc.setDoctorId(107);
		doc.setDepartment("ENT");
		doc.setDoctorName("Priya");
		doc.setPhoneNumber(34563464);
		return doc;
	}
		
	@Bean
		public Patient reva(){
			
			return new Patient(209,"vedha",878789876l);
		}
		
		
	}




	
	
