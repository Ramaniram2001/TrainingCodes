package com.training;
import java.util.*;

import com.training.model.Student;

public class HashMapApp2 {

	public static void main(String[] args) {
		Student ram=new Student(102,"ram",68);
		Student shyam=new Student(103,"shyam",78);
		Student mukesh=new Student(105,"mukesh",789);
		
		HashMap<Integer,Student> map=new HashMap<>();
		
		map.put(900, ram);
		map.put(901, shyam);
		map.put(902, mukesh);
		
		System.out.println(map.get(900));
		System.out.println(map.get(901));
		System.out.println(map.get(902));
		System.out.println("***********************************");
		
		//map.keySet() to get all the keys instead of each and every get 
		Set<Integer> keys=map.keySet();
		System.out.println(keys);
		System.out.println("****************************************");
		
		for(Integer key:keys) {
			System.out.println(map.get(key));
		}
		System.out.println("********************************************");
		
		//in order to get the values instead of keys
		Collection<Student> List=map.values();
		for(Student eachStudent:List) {
			System.out.println(eachStudent);
			
		}
		System.out.println("********************************************");
		
		//in order to get both keys and values 
		//map is converted into set
		//which can be seen in below first line as Set ,,,,,,,,,,,,, map.entrySet
		Set<Map.Entry<Integer,Student>> list2=map.entrySet();
		for(Map.Entry<Integer,Student> eachEntry:list2) {
			System.out.println(eachEntry.getKey());
			System.out.println(eachEntry.getValue());
	
		}		
		System.out.println("****************************************");

	}

}
