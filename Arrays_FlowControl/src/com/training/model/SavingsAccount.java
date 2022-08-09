package com.training.model;

public class SavingsAccount extends BankAccount {
	
	private String nominee;
	//4 properties from superclass "bankaccount" 
	//and 1 property from subclass "savingsaccount"
//	
	public SavingsAccount() {
		super();
		System.out.println("constructor of sub class called");
	}
	
//	public SavingsAccount() {
//	super(1020,"ram",5000,"fixed");
//	System.out.println("constructor of sub class called");
//}



	public SavingsAccount(int accountNumber, String accountHolderName, double balance, String accountType,
			String nominee) {
		super(accountNumber, accountHolderName, balance, accountType);
		this.nominee = nominee;
	}

	public String getNominee() {
		return nominee;
	}

	public void setNominee(String nominee) {
		this.nominee = nominee;
	}
	


	
	
	
	
}
