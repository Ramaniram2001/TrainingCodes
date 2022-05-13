package com.example.demo.utils.bidirect;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.entity.bidirect.Doctor;
import com.example.demo.entity.bidirect.Patient;
import com.example.demo.ifaces.bidirect.DoctorRepository;
import com.example.demo.ifaces.bidirect.PatientRepository;


@Component
public class Utility {
	
	@Autowired
	List<Patient> patientList;
	
	
	@Autowired
	Doctor doc;
	
	@Autowired
	DoctorRepository repo;
	
	@Autowired
	PatientRepository patientRepo;
	
	public void create() {
		Doctor added=repo.save(doc);
		for(Patient eachPatient:patientList) {
			eachPatient.setDoctor(doc);
			patientRepo.save(eachPatient);
			
		}
	
	   
        if(added!=null) {
		System.out.println("One record added");
	}
	}
public void findAll() {
		List<Doctor> doctors=repo.findAll();
		for(Doctor eachDoctor:doctors) {
			System.out.println("Doctor name: "+ eachDoctor.getDoctorName());
			System.out.println("Doctor department " +eachDoctor.getDepartment());
		List<Patient>patients=eachDoctor.getPatientList();
			for(Patient eachPatient:patients) {
				System.out.println("patient name "+ eachPatient.getPatientName());
				System.out.println("patient mobile number: "+eachPatient.getMobileNumber());
			}
		}
		}
	
	public void findDoctorFrmPatient() {
		Patient entity=patientRepo.findById(202).get();
		
		System.out.println(entity.getPatientName());
		System.out.println(entity.getDoctor());
	}

}