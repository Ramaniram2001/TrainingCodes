package com.training.model;

public class LifeInsurance extends Insurance{
	
	//generating property
	private int age;

	//generating constructors from super class
	public LifeInsurance() {
		super();
	}
	
	//generating constructors from fields
    public LifeInsurance(int policyNumber, String policyHolderName, int age) {
		super(policyNumber, policyHolderName);
		this.age = age;
	}

	//generating getters and setters
    public int getAge() {
		return age;
	}
    public void setAge(int age) {
		this.age = age;
	}


	@Override
	public double calculatePremium() {
		double premium =10000;
		if(age < 50) {
			premium=5000;
		}
		return premium;
	}
	
}
