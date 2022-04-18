package com.training.model;

public abstract class Insurance {
	
	//properties in abstract class
	private int policyNumber;
	private String policyHolderName;

	
	//generate constructors from super class
	public Insurance() {
		super();
	}
	
	//generate two argument constructors from fields
	public Insurance(int policyNumber, String policyHolderName) {
		super();
		this.policyNumber = policyNumber;
		this.policyHolderName = policyHolderName;
	}
	
	//generate getters and setters for all the fields
	public int getPolicyNumber() {
		return policyNumber;
	}
	public void setPolicyNumber(int policyNumber) {
		this.policyNumber = policyNumber;
	}
	public String getPolicyHolderName() {
		return policyHolderName;
	}
	public void setPolicyHolderName(String policyHolderName) {
		this.policyHolderName = policyHolderName;
	}
	
	//calculatePremium is a abstract method which is to be
	//applicable and implemented in all the subclasses
	public abstract double calculatePremium();
	
	
	

}
