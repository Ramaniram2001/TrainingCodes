package com.example;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class App {

	public static void main(String[] args) {
		
		String dateOfBirth ="2022-04-29";
		
		Student ramani=new Student();
		
		ramani.setRollNumber(200);
		ramani.setStudentName("Hari");
		ramani.setDateOfBirth(LocalDate.parse(dateOfBirth));
		ramani.setDateOfJoining(LocalDateTime.now());
		
		
		
	System.out.println(ramani.getDateOfBirth());
		System.out.println(ramani.getDateOfJoining());
		System.out.println("*******************************************************");
		
		System.out.println(ramani.getDateOfBirth().getDayOfMonth());
		System.out.println(ramani.getDateOfBirth().getMonthValue());
		System.out.println(ramani.getDateOfBirth().getYear());
		System.out.println("******************************************************");
		
		
		System.out.println(ramani.getDateOfBirth().getMonth());
		
		
		LocalTime startTime =LocalTime.of(9,30);
		LocalTime endTime=startTime.plus(8, ChronoUnit.HOURS);
		System.out.println("Start time is " + startTime);
		System.out.println("End time is " + endTime);
		
	
	

	}

}
