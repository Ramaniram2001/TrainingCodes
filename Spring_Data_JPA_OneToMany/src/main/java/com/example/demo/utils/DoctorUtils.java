package com.example.demo.utils;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.entity.Doctor;
import com.example.demo.entity.Patient;
import com.example.demo.ifaces.DoctorRepository;

@Component
public class DoctorUtils {
	
	
	@Autowired
	List<Patient> patientList;
	
	
	@Autowired
	Doctor doc;
	
	@Autowired
	DoctorRepository repo;
	
	public void create() {
		doc.setPatientList(patientList);
	    Doctor added=repo.save(doc);
        if(added!=null) {
		System.out.println("One record added");
	}
	}
//	public void findAll() {
//		List<Doctor> doctors=repo.findAll();
//		for(Doctor eachDoctor:doctors) {
//			System.out.println("Doctor name: "+ eachDoctor.getDoctorName());
//			System.out.println("Doctor department " +eachDoctor.getDepartment());
//			List<Patient>patients=eachDoctor.getPatientList();
//			for(Patient eachPatient:patients) {
//				System.out.println("patient name "+ eachPatient.getPatientName());
//				System.out.println("patient mobile number: "+eachPatient.getMobileNumber());
//			}
//		}
//		}

}

	
	
	
