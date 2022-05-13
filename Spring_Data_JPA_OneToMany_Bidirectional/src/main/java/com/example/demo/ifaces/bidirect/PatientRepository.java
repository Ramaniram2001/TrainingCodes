package com.example.demo.ifaces.bidirect;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.bidirect.Patient;

public interface PatientRepository extends JpaRepository<Patient, Integer> {

}
