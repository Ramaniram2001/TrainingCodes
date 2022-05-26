package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

import com.example.demo.entity.Student;
import com.example.demo.entity.Teacher;

@SpringBootApplication
public class SelfPractice1Application {

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(SelfPractice1Application.class, args);
		Student student=ctx.getBean(Student.class);
		Teacher teacher=ctx.getBean(Teacher.class);
		// method 1 to print the object or bean
		System.out.println(ctx.getBean("ramya"));
		System.out.println(ctx.getBean("haripriya"));
		//method 2 to print the bean
	    System.out.println(teacher);
	    //the below one is for casting as two different beans are there
	    Teacher harish=(Teacher)ctx.getBean("harish");
	    System.out.println(harish);
	    //method 1 casting
	    Teacher hari=(Teacher)ctx.getBean("hari");
	    System.out.println(hari);
	    //method 2 casting
	    Student stella=(Student)ctx.getBean("ramya",Student.class);
	    System.out.println(stella);
	    //or
	    Student rajesh=ctx.getBean("ramya",Student.class);
	    System.out.println(rajesh);
	    //performing all the casting methods
	    Student ramesh=(Student)ctx.getBean("ramesh");
	    System.out.println(ramesh);
	    Student ramesh1=(Student)ctx.getBean("ramesh",Student.class);
	    System.out.println(ramesh1);
	    
	    
	    
	
	   
	}
	
	@Bean
	public Student ramya() {
		return new Student(101,"Ramya","O");
	}
	
	@Bean
	public Teacher haripriya() {
		return new Teacher(501,"Haripriya","Science");
	}
	@Bean
	@Primary
	public Student ramesh() {
		return new Student (102,"Ramesh","A");
	}

	@Bean
	@Primary
	public Teacher hari() {
		return new Teacher(502,"Hari","Maths");
	}
	@Bean
	public Teacher harish() {
		return new Teacher(503,"Harish","Maths");
	}
}
	

