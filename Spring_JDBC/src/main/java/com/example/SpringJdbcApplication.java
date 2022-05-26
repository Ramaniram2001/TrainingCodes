package com.example;


import org.springframework.boot.SpringApplication;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

import com.example.demo.repos.ProductRepository;
import com.example.entity.Product;

@SpringBootApplication
public class SpringJdbcApplication {

	public static void main(String[] args) {
		ApplicationContext ctx =SpringApplication.run(SpringJdbcApplication.class, args);
		ProductRepository repo=ctx.getBean(ProductRepository.class);
		//Product lipstick=ctx.getBean(Product.class);
	
		//System.out.println("Row Added : = "+repo.add(lipstick));
	
		repo.findAll().forEach(System.out::println);
		//repo.findById(12);
		
	//System.out.println(repo.findById(56));
	
	
	//Product t=ctx.getBean(Product.class);
	//System.out.println("one row updated: "+ repo.update(t));

	
	
	

	//System.out.println("One row deleted with product_id as : = "+repo.remove(85));
	
	}		
	@Bean
	public Product lipstick()
	{
		return new Product(2,"lipstick",456);
	}
	@Bean
	@Primary
	public Product t() {
		return new Product(14,"fridge",888);
	}
	
	
	
	
}


