package com.example;
import com.example.model.Student;

public class Application {

	public static void main(String[] args) {
		Student ram =new Student();
		//unable to access because the method is 
		//private in student class
		ram.setRollNumber(7653);
	
		//default method is unable to access
		 //because student class is in com.example.model.package
		 //and application is in com.example package
		ram.setMarkScored(77.0);
	
		//unable to access because application is not a 
		//subclass of student
		
	
		ram.setBranch("ECE");
		System.out.println("roll number is "+ram.getRollNumber());
		System.out.println("marks scored is "+ram.getMarkScored());
		System.out.println("first name is " +ram.getFirstName());
		System.out.println("branch is "+ram.getBranch());
		Student shyam = new Student(490,"shyam",77,"mech");
		System.out.println("roll number is " +shyam.getRollNumber());
		Student magesh = new Student(77, "ram", "ece");
		System.out.println("Student Name : "+magesh.getMarkScored());

	}

}
