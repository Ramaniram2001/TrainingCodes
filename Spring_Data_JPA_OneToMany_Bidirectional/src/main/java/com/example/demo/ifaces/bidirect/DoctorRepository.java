package com.example.demo.ifaces.bidirect;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.bidirect.Doctor;

public interface DoctorRepository extends JpaRepository<Doctor, Integer> {

}
