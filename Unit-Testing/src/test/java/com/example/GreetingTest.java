package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import static org.junit.jupiter.api.Assertions.assertNotNull;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/*
 * 
 */
public class GreetingTest {
	
	/**
	 * 
	 */
	@Test
	@DisplayName(value="Test the Get Message return a string of length 7 characters")
	void testMaxLength() {
		Greeting grtObj =new Greeting();
		int actual=grtObj.getMessage().length();
		int expected=7;
		
		assertEquals(expected, actual);
		
	}
	/**
	 * 
	 */
	@Test
	@DisplayName(value="Test the Birthday wish method does not return null")
	void testBirthDayWish() {
		Greeting grtObj=new Greeting();
		String actual=grtObj.birthdayWish("ram");
		assertNotNull(actual);
	}
	/**
	 * 
	 */
	
	@Test
	@DisplayName("Test Birthday wish method should return happy birthday with user name suffixed")
	void testBirthDayWishName() {
		Greeting grtObj=new Greeting();
		String name="Ramya";
		String actual=grtObj.birthdayWishName(name);
		String expected="Happy birthday "+name;
		assertEquals(expected, actual);

		
	}
}
