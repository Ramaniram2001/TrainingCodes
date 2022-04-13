package com.training.ifaces;

@FunctionalInterface
public interface Converter<T,R>{
	public R convert(T value);
    //public R change(T value);
	
	/*if the above line is executed then in Converter method won't be a functional Interface
	because convert should be the only abstract method if change comes two 
	abstract method would be there*/
	
	//T means  argument type and R means Return type
	
	//k means key
	//E means element
}
