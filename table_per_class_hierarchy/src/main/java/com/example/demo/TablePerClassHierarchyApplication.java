package com.example.demo;

import javax.persistence.PrimaryKeyJoinColumn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

import com.example.demo.entity.HealthInsurance;
import com.example.demo.entity.LifeInsurance;
import com.example.demo.services.InsuranceService;

@SpringBootApplication
public class TablePerClassHierarchyApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx=SpringApplication.run(TablePerClassHierarchyApplication.class, args);
		InsuranceService service=ctx.getBean(InsuranceService.class);
		service.addHealthPolicy();
		service.addLifePolicy();
		ctx.close();
	}


	@Bean
	public LifeInsurance life() {
		return new LifeInsurance(987654,"Ramya",23,"IT services");
	}
	
	@Bean
	public HealthInsurance health() {
		return new HealthInsurance(345625,"Ramesh",52,"Diabetic");
	}
	


	@Bean
	@Primary
	public LifeInsurance life1() {
		return new LifeInsurance(102328,"Ramani",60,"Teacher");
	}
	
	@Bean
	@Primary
	public HealthInsurance health1() {
		return new HealthInsurance(235267,"Rajesh",28,"Healthy");
	}
	
}
