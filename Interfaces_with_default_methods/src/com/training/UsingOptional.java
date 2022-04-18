package com.training;

import java.util.Optional;



public class UsingOptional { 
	public static Optional<String> getValue(int key){
		Optional<String> response = Optional.empty();
		if(key==1) {
			response = Optional.of("Hi");
			
		}
		return response;
	}
	
		
	public static Object getString(int key) {
		switch (key) {
		case 1:
			return new String("chocobar");
		case 2:
			return new StringBuffer("casatta");

		default:
			return null;
		}
		
	}
	public static void main(String[] args) {
		
		//will throw null pointer exception for values 3 and above
		//System.out.println(getString(2).toString());
		/* the above code will print casatta */
		
		//to avoid nullpointer exception and return a default value
		//new features of Java 8 optional is used
		
		Optional<Object> optional = Optional.ofNullable(getString(3));
		System.out.println(optional.orElse("Vannila").toString());
		
		Optional<Object> opt2=Optional.ofNullable(getString(2));
		if(opt2.isPresent()) {
			System.out.println("value is present " + opt2.get());
			
		}else {
			System.out.println("value is not present");
		}
		
		//using the lambda expression with optional
//		Optional<Object> opt3=Optional.ofNullable(getString(3));
//		opt3.orElseThrow(
//				()->new RuntimeException("no object for value 3"));
//				
	
	//call the getValue Method by passing 1 as argument
	//call the same method again by passing 2 as argument
	//print the results

	Optional<String> resp= getValue(2);
	if(resp.isPresent()) {
		System.out.println(resp.get().toString());
		
	}else {
		System.out.println("invalid choice enter 1");
	}
}
}
		
		
		
	

