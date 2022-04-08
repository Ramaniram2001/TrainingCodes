package com.training.exception;

public class RangeCheckedException extends Exception {
	
	private String message;

	//one argument constructor
	public RangeCheckedException(String message) {
		super();
		this.message = message;
	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return this.message;
	}
	
	

}
