package com.example;

import java.util.*;
import java.sql.*;
import java.time.*;


public class WorkingWithDifferentClasses {
	
	
	public static void main(String[] args) {
		
		//as date is both in java.util and also in java.sql
		//we are declaring here too;
		java.util.Date date1= new java.util.Date();
		
		System.out.println(date1);
		
		//there is no zero argumental constructor in 
		//java.sql.Date only one argumental constructor is there
		//hence we are passing date1.getTime()
		System.out.println(date1.getTime());//returns the number of milliseconds
		java.sql.Date date2 =new java.sql.Date(date1.getTime());
		System.out.println(date2);
		
		//sql date to local date
		LocalDate localDate=date2.toLocalDate();
		System.out.println("local date is" +localDate);
		
		//local date to sql date
		java.sql.Date sqlDate2=java.sql.Date.valueOf(localDate);//local date to sql date
		System.out.println("SQL Date 2:="+sqlDate2);
		
		
		
		
	
		
		
		

	}

}
