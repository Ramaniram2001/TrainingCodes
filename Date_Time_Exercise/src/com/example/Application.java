package com.example;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Application {

	public static void main(String[] args) {
		
		Student ram = new Student (101,"Ramya",LocalDate.of(2001,4,29),LocalDateTime.of(2022,3,1,9,30));
		System.out.println(ram.getRollNumber());
		System.out.println(ram.getStudentName());
		System.out.println("year of birth for ram is " +ram.getDateOfBirth());
		System.out.println(ram.getDateOfJoining());
		System.out.println(ram);
		
		
		Student shyam= new Student(102,"Shayam",LocalDate.now(),LocalDateTime.now());
		System.out.println("year of birth for shyam is " +shyam.getDateOfBirth());
		
		System.out.println("Ramya\'s first birthday is " + ram.getDateOfBirth().plus(1,ChronoUnit.YEARS));
		System.out.println("Ramya\'s twenty first birthday is " + ram.getDateOfBirth().plus(21,ChronoUnit.YEARS));
		
	}

}
