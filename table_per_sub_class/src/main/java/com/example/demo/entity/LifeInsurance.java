package com.example.demo.entity;

import javax.persistence.DiscriminatorValue;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
@Entity
@DiscriminatorValue(value="LIFE")
public class LifeInsurance extends Insurance {
	private int age;
	private String profile;
	
	
	public LifeInsurance(int policyNumber, String policyHolderName, int age, String profile) {
		super(policyNumber, policyHolderName);
		this.age = age;
		this.profile = profile;
	}
	

}
