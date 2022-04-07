package com.training.model;
import com.training.model.SavingsAccount;

public class BankAccount {
	
	//4 properties
	private int accountNumber;
	private String accountHolderName;
	private double balance;
	private String accountType;
	
	//zero argument constructor
	public BankAccount() {
		super();
		System.out.println("zero arg constructor of super called");
		
	}
	
	//three argument constructor
	public BankAccount(int accountNumber, String accountHolderName, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.balance = balance;
		System.out.println("three arg constructor of super class called");
	}



	//four argument constructor
	public BankAccount(int accountNumber, String accountHolderName, double balance,String accountType) {
		super();
		System.out.println("four arg constructor of super class called");
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.balance = balance;
		this.accountType=accountType;

	}
	
	
	
	
	//setters and getters
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	
	
	@Override
	public String toString() {
	// TODO Auto-generated method stub
	return this.accountNumber +","+this.accountHolderName +","+this.balance +","+this.accountType ;
	
	}
	
	

	
	

}
