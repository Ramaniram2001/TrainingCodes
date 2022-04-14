package com.training.customer;

public class Customer {
	private int customerId;
	private String customerName;
	
	
	//zero argumental constructor to call the parent class
	public Customer() {
		super();
		
	}

	
	//argumental constructor to initialize the values
	public Customer(int customerId, String customerName) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
	}
	
	
	//getters and setters implementation for achieving encapsulation
    public int getCustomerId() {
		return customerId;
	}


	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}


	public String getCustomerName() {
		return customerName;
	}


	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	
	
	
	
	
	

}
