package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.core.env.PropertySource.StubPropertySource;

import com.example.demo.entity.Student;
import com.example.demo.repos.StudentRepository;

@SpringBootApplication
public class SpringJdbcSelfPractice2Application {

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(SpringJdbcSelfPractice2Application.class, args);
		StudentRepository repo=ctx.getBean(StudentRepository.class);
		//to add a particular row in both console and oracle database
//		Student kumu=(Student)ctx.getBean("kumu");
//		System.out.println(kumu);
//		System.out.println("The above row has been added : " + repo.add(kumu));
		repo.findAll().forEach(System.out::println);
		//System.err.println(repo.findById(99));
		System.err.println(repo.findByRank("C"));
		Student t=(Student)ctx.getBean("up");
		System.out.println("rows updataed : "+repo.update(t));
		System.out.println("rows deleted:"+ repo.remove(5));
		
		
	}
	
	@Bean
	public Student kumu() {
		return new Student(7,"Kumutha",45,"C");
	}
	@Bean
	public Student up() {
		return new Student(5,"Ramesh",88,"A");
	}

}
