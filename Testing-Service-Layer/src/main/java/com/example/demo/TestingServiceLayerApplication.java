package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class TestingServiceLayerApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx =	SpringApplication.run(TestingServiceLayerApplication.class, args);
	            ctx.close();
	}

}
