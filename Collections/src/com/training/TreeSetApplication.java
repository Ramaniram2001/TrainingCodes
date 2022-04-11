package com.training;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import com.training.model.Student;

public class TreeSetApplication {

	public static void main(String[] args) {
		Student ram= new Student(101,"anand",78);
		Student shyam=new Student(102,"barath",990);
		Student magesh=new Student(103,"magesh",879);
		//in order to check the duplicate 
		//we set the arguments of mag as 
		//same as magesh
		Student mag=new Student(103,"magesh",879);
		
		Set<Student> set=new TreeSet<>();
		
		set.add(mag);
		set.add(magesh);
		set.add(ram);
		set.add(shyam);
		
		for(Student eachStudent:set){
			System.out.println(eachStudent.getFirstName());
		}
		

	}

}
