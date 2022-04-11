package com.training;
import com.training.model.Student;
import java.util.*;

public class HashSetApplication {

	public static void main(String[] args) {
		Student ram= new Student(101,"ram",78);
		Student shyam=new Student(102,"shyam",990);
		Student magesh=new Student(103,"magesh",879);
		//in order to check the duplicate 
		//we set the arguments of mag as 
		//same as magesh
		Student mag=new Student(103,"magesh",879);
		
		Set<Student> set=new HashSet<>();
		
		set.add(mag);
		set.add(magesh);
		set.add(ram);
		set.add(shyam);
		System.out.println(set);
		System.out.println(set.size());
		

	}

}
