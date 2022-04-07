package com.training.model;

public class HealthInsurance extends Insurance {
	
	//generate property
	private String[] preExistingDiseases;
	
	//generate constructors
	public HealthInsurance() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//generate argument constructors
	public HealthInsurance(int policyNumber, String policyHolderName, String[] preExistingDiseases) {
		super(policyNumber, policyHolderName);
		this.preExistingDiseases = preExistingDiseases;
	}
	
	//generate getters and setters

	public String[] getPreExistingDiseases() {
		return preExistingDiseases;
	}

	public void setPreExistingDiseases(String[] preExistingDiseases) {
		this.preExistingDiseases = preExistingDiseases;
	}

	@Override
	public double calculatePremium() {
		double premium =10000;
		for(String eachItem : preExistingDiseases) {
			if(eachItem.equalsIgnoreCase("bp")|| eachItem.equalsIgnoreCase("sugar")) {
				premium=15000;
			}
		}
		return premium;
	}

}
