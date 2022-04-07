package com.training;
import com.training.model.SavingsAccount;
import com.training.model.BankAccount;
import com.training.model.BankAccountService;

public class Application {
	public static void main(String[] args) {
		SavingsAccount account= new SavingsAccount("ramesh");
		//System.out.println(account.getNominee());
	    SavingsAccount account2 =new SavingsAccount(789,"ram",2342,"fixed","gsdf");
	   // System.out.println(account2.getNominee());
	    System.out.println(account2.toString());
}
}

