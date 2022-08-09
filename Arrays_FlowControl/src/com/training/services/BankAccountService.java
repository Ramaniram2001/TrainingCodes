package com.training.services;

import com.training.model.BankAccount;

public class BankAccountService {
	public double calculateInterest(BankAccount account) {
		double simpleInterest=0.05;
		if(account.getAccountNumber()<=5000) {
			simpleInterest=0.06;
		}
		return account.getBalance()*1*simpleInterest;
	}
	//Overloaded method 
	
	public void calculateInterest(BankAccount[] accounts) {
		for(BankAccount eachAccount : accounts) {
			System.out.println(calculateInterest(eachAccount));
		}
	}
	
	public double[] findInterest(BankAccount[] accounts) {
		
        double[] values=new double[2];
        int i=0;
		for(BankAccount eachAccount:accounts) {
			values[i]=calculateInterest(eachAccount);
			i++;
		
			
			
		}
		return values;
			
		}
	
}