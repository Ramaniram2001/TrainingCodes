package com.example.demo.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import com.example.demo.entity.Seminar;
import com.example.demo.entity.Speaker;
import com.example.demo.ifaces.SeminarRepository;

@Component
public class SeminarUtils {
	
	@Autowired
	private Speaker speaker;
	
	@Autowired
	Seminar sem;
	
	@Autowired
	SeminarRepository repo;
	
//	public void create() {
//		sem.setSpeaker(speaker);
//	    Seminar added=repo.save(sem);
//        if(added!=null) {
//		System.out.println("One record added");
//	}
//	}
	
	public void findAll() {
		System.out.println(repo.findAll());
	}

}
	
