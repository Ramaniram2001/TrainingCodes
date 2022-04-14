package com.training;


import java.util.Scanner;

import com.training.customer.Customer;
import com.training.employee.Area;
import com.training.employee.Employee;

public class Application {

	public static void main(String[] args) {
		Customer customer1=new Customer(101,"Ram");
	System.out.println(customer1.getCustomerId());
	System.out.println(customer1.getCustomerName());	
		
	Employee employee1=new Employee();
	Scanner sc=new Scanner(System.in);
		System.out.println("enter the employeeId and name");
	int employeeId=sc.nextInt();		
		employee1.setEmployeeId(employeeId);
		String employeeName=sc.next();
		employee1.setEmployeeName(employeeName);
	System.out.println(employee1.getEmployeeId());
	System.out.println(employee1.getEmployeeName());
		
		
		Area a1=new Area();
		 int answer   =a1.res1(2,2);
		
		System.out.println(answer);
}
}
