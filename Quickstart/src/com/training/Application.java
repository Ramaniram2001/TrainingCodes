package com.training;

public class Application {

	public static void main(String[] args) {
		Greeting grtObj=new Greeting();
		// System s=new.System();(will get error as system is already default and is constructor private//
		System.out.println(grtObj.getMessage());
		System.out.println(Greeting.getInfo());

		// TODO Auto-generated method stub

	}

}
