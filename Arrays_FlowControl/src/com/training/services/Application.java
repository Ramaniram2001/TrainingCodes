package com.training.services;
import com.training.model.BankAccount;

public class Application {

	public static void main(String[] args) {

		BankAccountService service= new BankAccountService();
		
		BankAccount ram=new BankAccount(1200,"ramesh",5000,"FIXED");
		double simpleInterest=service.calculateInterest(ram);
		System.out.println("simple interest is  "+simpleInterest);
		
		BankAccount ramya=new BankAccount(6200,"rajesh",5000,"FIXED");
		double simpleInterest2=service.calculateInterest(ramya);
		System.out.println("simple interest is "+simpleInterest2);
	
//		BankAccount[] accounts = new BankAccount[2];
//    accounts[0]=ram;
//    accounts[1]=ramya;    
//    service.calculateInterest(accounts);
    
		BankAccount[] accounts= {ram,ramya};
		service.calculateInterest(accounts);
		double[] values=service.findInterest(accounts);
		for(double eachValue:values) {
			System.out.println(eachValue);
		}
		BankAccount[] accountList= { new BankAccount(800,"hari",5000,"savings"),
		                             new BankAccount(801,"charu",6000,"fixed"),
		                             new BankAccount(802,"sri",7000,"recurring")
		
		};
		double[] interestValues=service.findInterest(accountList);
		for(double eachValue :interestValues) {
			System.out.println(eachValue);
		}
		
		
}
}

