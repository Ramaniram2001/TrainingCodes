package com.training.demo.dummy;

import java.util.Arrays;

import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;


public class Dummy {
	
	public static void main(String[] args) {
		
		//Intermediate operations 
		//MAP Example
		List<Integer> num=Arrays.asList(2,3,4,5,6,6);
		List <Integer>square= num.stream().map(x->x*x).collect(toList());
		System.err.println("MAPPING");
		System.out.println(square);
		System.out.println("");
		
		//FILTER Example
		List<String> strings=Arrays.asList("Hari","Haripriya","Ramya","Ramesh","Ramani","Priya");
		List<String> stringNames=strings.stream().filter(x->x.startsWith("R")).collect(toList());
		System.err.println("FILTERING");
		System.out.println(stringNames);
		System.out.println("");
		
		//Sorted Example
		List<String> sorted=strings.stream().sorted().collect(toList());
		System.err.println("SORTING");
		System.out.println(sorted);
		System.out.println("");
		
		//DISTINCT Example
		Stream<String> distinct=strings.stream().distinct();
		System.err.println("DISTINCT");
		distinct.forEach(name->System.out.println(name));
		System.out.println("");
		
		
		//Terminal Operations
		//COLLECT Example
		List<Integer> number=Arrays.asList(2,3,4,5,6,6);//map won't allow duplicate values
		Set<Integer>squares= number.stream().map(x->x*x).collect(toSet());
		System.err.println("COLLECTING");
		System.out.println(squares);
		System.out.println("");
		
		//FOREACH Example
		System.err.println("FOREACH");
		squares.forEach(each->System.out.println(each));
		System.out.println("");
		
		//REDUCE
		 int all =number.stream().reduce(0,(ans,i)-> ans+i);//26
		 int even=number.stream().filter(x->x%2==0).reduce(0,(ans,i)->ans+i);//18
		 System.err.println("REDUCE");
		 System.out.println(all);
		 System.out.println(even);
		 System.out.println("");
	}
	

}
