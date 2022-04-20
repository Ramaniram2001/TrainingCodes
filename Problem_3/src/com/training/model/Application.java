package com.training.model;

import java.util.*;

public class Application {

	public static void main(String[] args) {
	
	Fruit set1=new Fruit("apple");
	Fruit set2=new Fruit("orange");
	Fruit set3=new Fruit("apple");
	Fruit set4=new Fruit("pineapple");
	Fruit set5=new Fruit("orange");
	Fruit set6=new Fruit("banana");
	
	
	TreeSet<Fruit> elements=new TreeSet<>();
	
	
	elements.add(set1);
	elements.add(set2);
	elements.add(set3);
	elements.add(set4);
	elements.add(set5);
	elements.add(set6);

	for(Fruit eachFruit : elements) {
		System.out.println(eachFruit.getFruits());
		
	}

	
	
	}

}

