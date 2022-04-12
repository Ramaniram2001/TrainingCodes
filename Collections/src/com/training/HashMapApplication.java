package com.training;
import java.util.*;

import com.training.model.Student;
public class HashMapApplication {

	public static void main(String[] args) {
		
		Student ram=new Student(102,"ram",68);
		Student shyam=new Student(103,"shyam",78);
		Student mukesh=new Student(105,"mukesh",789);
		
		
		HashMap<Integer,Student> map=new HashMap<>();
	
	System.out.println(map.put(901, ram));
	 System.out.println(map.put(902, mukesh));
//		Student added=map.put(902, mukesh);
//		if(added!=null) {
//			map.put(904, added);
//		}
	   
        System.out.println(map.put(902, shyam));
        System.out.println("87877"+map.get(902));
       // System.out.println(map.get(904));


	}

}
