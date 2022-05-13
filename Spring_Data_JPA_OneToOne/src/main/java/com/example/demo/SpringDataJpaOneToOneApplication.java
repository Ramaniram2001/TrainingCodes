package com.example.demo;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.example.demo.entity.Seminar;
import com.example.demo.entity.Speaker;
import com.example.demo.utils.SeminarUtils;


@SpringBootApplication
public class SpringDataJpaOneToOneApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx=SpringApplication.run(SpringDataJpaOneToOneApplication.class, args);
		
		SeminarUtils obj=ctx.getBean(SeminarUtils.class);
		//obj.create();
		obj.findAll();
		
		ctx.close();
	}
	
	@Bean
	public Speaker ramani(){
		
		return new Speaker(202,"Ramani","B.sc");
	}
	
	@Bean
	public Seminar english() {
		Seminar sem=new Seminar();
		sem.setId(102);
		sem.setDuration(2);
		sem.setName("English");
		return sem;
	}
		
	
		

}
