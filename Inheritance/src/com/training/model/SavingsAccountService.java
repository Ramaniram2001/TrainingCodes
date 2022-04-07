package com.training.model;
import com.training.model.*;

public class SavingsAccountService extends SavingsAccount {
	public SavingsAccountService(int accountNumber, String accountHolderName, double balance, String accountType,
			String nominee) {
		super(accountNumber, accountHolderName, balance, accountType, nominee);
		// TODO Auto-generated constructor stub
	}

	public String getCustomerInfo(SavingsAccount account) {
		return account.getAccountHolderName();
	}
	

}
