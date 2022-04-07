package com.training.model;

public class SavingsAccount extends BankAccount {

	private String nominee;

	
	public SavingsAccount(String nominee) {
		super();
		this.nominee = nominee;
	}

	public String getNominee() {
		return nominee;
	}

	public void setNominee(String nominee) {
		this.nominee = nominee;
	}

	public SavingsAccount(int accountNumber, String accountHolderName, double balance, String accountType,
			String nominee) {
		super(accountNumber, accountHolderName, balance, accountType);
		this.nominee=nominee;
		
	}

	public SavingsAccount() {
		// TODO Auto-generated constructor stub
	}

	
	
	
}
	
	
