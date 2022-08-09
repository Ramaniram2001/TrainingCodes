package com.training;
import java.util.*;

import com.training.model.BankAccount;
import com.training.services.BankAccountService;
public class MyApplication{

	public static void main(String[] args) {
		BankAccountService service=new BankAccountService();
		BankAccount[] list= new BankAccount[1];
		Scanner sc=new Scanner(System.in);
		
		int idx=0;
		int choice=0;
		
		
		
		do {
		
					System.out.println("enter the account number " );
					int accountNumber = sc.nextInt();
					System.out.println("enter the account holder name ");
			        String accountHolderName = sc.next();
			        System.out.println("enter the balance ");
			        double balance=sc.nextDouble();
			        System.out.println("enter the accountType ");
			        String accountType=sc.next();
			        BankAccount account1=new BankAccount(accountNumber,accountHolderName,balance,accountType);
			        list[idx]=account1;
			        System.out.println("enter 0 to end and 1 to continue");
			        choice=sc.nextInt();
	    	}while(true);

			        
			      
}
}
		


