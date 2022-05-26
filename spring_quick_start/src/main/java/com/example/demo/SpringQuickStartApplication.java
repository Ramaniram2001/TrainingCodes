package com.example.demo;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Primary;
import org.training.model.Author;
import org.training.model.Book;

import com.example.demo.model.Bill;
import com.example.demo.model.CustomerList;
import com.example.demo.model.Invoice;
import com.example.demo.model.Student;
import com.example.demo.model.Teacher;

@SpringBootApplication
@ComponentScan(basePackages= {"org.training","com.example"})
public class SpringQuickStartApplication {
public static void trail() {
	//ApplicationContext is one of the interface in an IOC container
			//Instead of ApplicationContext BeanFactory can be used as 
			//BeanFactory is a parent interface of ApplicationContext
		//ApplicationContext ctx=SpringApplication.run(SpringQuickStartApplication.class, args);
		
		//System.out.println(ctx.getBean("ram"));
		//System.out.println("*****************************************");
		//System.out.println(ctx.getBean("teacher"));
		//System.out.println("*******************************************");
//		Teacher stella=ctx.getBean(Teacher.class);
//		stella.setId(494);
//		stella.setName("Stella Sundari");
//		stella.setSubject("Fluid Mech");
//		System.out.println(stella);
//		System.out.println("************************************");
		//Teacher harish=(Teacher) ctx.getBean("harish",Teacher.class);
		//System.out.println(harish);
		
		//when using Id need to cast to specify bean since
		//return type of getBean method is object
		//Student ram=(Student)ctx.getBean(Student.class);
		//System.out.println(ram);
		
		//casting not required , but there should be only one bean of that type
		//will throw exception
		//Student shyam=ctx.getBean("stella",Student.class);
		//System.out.println(shyam);
	
}
	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(SpringQuickStartApplication.class, args);
		Book book=ctx.getBean(Book.class);
		System.out.println(book);
		
		Invoice inv=ctx.getBean(Invoice.class);
		System.out.println(inv);
		
		
		Bill bill=ctx.getBean(Bill.class);
	    System.out.println("Customer is : "+bill.getCustomer());
		System.out.println("Product is : "+bill.getProduct());
		
		CustomerList list=ctx.getBean(CustomerList.class);
		list.getCustList().forEach(System.out::println);
		System.out.println("Author : "+ctx.getBean(Author.class));
		//method 1 to get the output of bean of same method
		System.out.println("Author : "+ctx.getBean("haripriya",Author.class));//using getBean(".....",....)to get the bean of same type
		
	
	}
	@Bean
	public Author haripriya() {
		return new Author(101,"HariPriya");
		
	}
	@Bean
	@Primary
	//method 2 to get  the output of bean of same method
	//using @primary to get the bean of same type 
	public Author hari() {
		return new Author(102,"Hari");
		
	}
	

}
