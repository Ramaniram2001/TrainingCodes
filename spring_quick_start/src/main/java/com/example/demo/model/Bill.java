package com.example.demo.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.FieldDefaults;

@Getter
@ToString
@Component
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)


//this class is as same as class Invoice 
public class Bill {
	Customer customer;
	Product product;
	
	@Autowired
	public void setCustomer(@Qualifier("magesh")Customer customer) {
		System.out.println("Set Customer called ===============");
		this.customer=customer;
	}
	
	@Autowired
	public void setProduct(Product product) {
		System.out.println("Set Product called ====================");
		this.product=product;
	}
	

}
