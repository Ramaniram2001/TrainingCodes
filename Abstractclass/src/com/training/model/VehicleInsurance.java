package com.training.model;

public class VehicleInsurance extends Insurance {
	
	//properties which meant only for the subclass VehicleInsurance
	private String vehicleModel;
	private int yearOfManufacture;
	
	//generate constructor for the sub class
	public VehicleInsurance() {
		super();
	
	}

    //generate two argument constructors
	public VehicleInsurance(int policyNumber, String policyHolderName) {
		super(policyNumber, policyHolderName);
	}
	
	//generate five argument constructors
    public VehicleInsurance(int policyNumber, String policyHolderName, String vehicleModel,
			int yearOfManufacture) {
		super(policyNumber, policyHolderName);
		this.vehicleModel = vehicleModel;
		this.yearOfManufacture = yearOfManufacture;
	}

    @Override
	public double calculatePremium() {
		
		double premium=1000;
		if(yearOfManufacture<2020 && vehicleModel.equals("car")) {
			premium=2000;
		}
		
		return premium;
	}

}
