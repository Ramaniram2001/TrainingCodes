package com.training;

import com.training.ifaces.Conditional;
import com.training.services.StudentResultService;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentResultService service= new StudentResultService();
		System.out.println("is pass : " + service.test(90.00));
		System.out.println("is fail : "+service.negate(90.00));
		System.out.println(Conditional.getMessage());

	}

}
