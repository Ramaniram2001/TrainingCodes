package com.example.demo.entity;

import javax.persistence.DiscriminatorValue;

import javax.persistence.Entity;


import lombok.AllArgsConstructor;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString

@Entity
@DiscriminatorValue(value="HEALTH")

public class HealthInsurance extends Insurance {
	
	
	private int age;
	private String status;
	public HealthInsurance(int policyNumber, String policyHolderName, int age, String status) {
		super(policyNumber, policyHolderName);
		this.age = age;
		this.status = status;
	}
	
}
