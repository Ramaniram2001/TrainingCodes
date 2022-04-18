package com.training.services;


import com.training.ifaces.Conditional;

public class StudentResultService implements Conditional<Double>  {

	@Override
	public boolean test(Double t) {
		// TODO Auto-generated method stub
		return t>80;
	}

	

}
