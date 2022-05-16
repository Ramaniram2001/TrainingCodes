package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.example.demo.entity.Address;
import com.example.demo.entity.City;
import com.example.demo.entity.User;
import com.example.demo.repos.AddressRepository;
import com.example.demo.services.AddressService;

@SpringBootApplication
public class JpaEntityGraphApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx=SpringApplication.run(JpaEntityGraphApplication.class, args);
		AddressService service=ctx.getBean(AddressService.class);
		service.task4();
	
		ctx.close();
	}
	
	
	@Bean
	public CommandLineRunner runner() {//in order to register all the beans with six times
//		//so in order to reduce the code CommandLineRunner is used
		return new CommandLineRunner() {
			
			@Autowired
			AddressRepository repo;
			@Override
			public void run(String... args) throws Exception {
				City channel=new City(900,"Channel");
				City madurai=new City(901,"Madurai");
				User ram=new User(700,"Ramesh",12342);
				User suresh=new User(701,"Suresh",56536);
				Address address1=new Address(100,"Mr.",madurai,suresh);
				Address address2=new Address(101,"Dr.",channel,ram);
				
				this.repo.save(address1);
				this.repo.save(address2);
				
				
			}
		};
	}
	

}
