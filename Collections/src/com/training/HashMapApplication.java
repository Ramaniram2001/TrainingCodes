package com.training;
import java.util.*;

import com.training.model.Student;
public class HashMapApplication {

	public static void main(String[] args) {
		
		Student ram=new Student(102,"ram",68);
		Student shyam=new Student(103,"shyam",78);
		Student mukesh=new Student(103,"mukesh",789);
		
		
		HashMap<Integer,Student> map=new HashMap<>();
		
		map.put(900,ram);
		map.put(902,shyam);
		
		System.out.println(map.get(902));
		
		System.out.println(map.put(900, ram));
		System.out.println(map.put(900, mukesh));
	

	}

}
