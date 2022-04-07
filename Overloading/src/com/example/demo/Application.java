package com.example.demo;
import java.util.*;
public class Application {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name");
		String name=sc.next();
		System.out.println("Enter the temperature");
		double farenTemp=sc.nextDouble();
	    Converter convObj=new Converter();
	     System.out.println(convObj.convert(name));
	     System.out.println("celsius Temp:="+convObj.convert(farenTemp));
	     System.out.println("enter the amount");
	     double amount=sc.nextDouble();
	     System.out.println("enter the current to convert");
	     int frm=sc.nextInt();
	     System.out.println(convObj.convert(amount,frm));
	     sc.close();
		
	     
		
		
		
		

	}

}
