package com.training.services;

public class ExceptionHandling {
	
	public void usingArrayIndexException(String[] args) {
		try {
			System.out.println(args[2]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("method requires three values to be passed [a,b,c]");
			
		}
	}
	
	public void usingNumberFormatException(String value) {
		
		int age=666;
		try {
			age=Integer.parseInt(value);
			//System.out.println(age);
		} catch (NumberFormatException e) {
			System.out.println("enter the correct value");

		}
		System.out.println(age);
	}
//  public void usingFinallyBlock() {
//	  int denominator=0;
//	  try {
//		  System.out.println(4/denominator);
//	  }catch(ArithmeticException e) {
//		  System.err.println("denominator should not be zero");
//	  }
//	  finally {
//		  System.out.println("finally ====");
//	  }
//	  System.out.println("thanks,bye,bye");
//  }
  
  
  public String underStandFinallyBlock() throws Exception{
	  int denominator=4;
	  try {
		  System.out.println(4/denominator);
	  }catch(ArithmeticException e) {
		  System.err.println("denominator should not be zero");
		  //return "welcome";
		  throw new Exception();
	  }
	  finally {
		  System.out.println("finally ====");
	  }
	  System.out.println("bye,bye");
	  return "thanks";
  }
}
