package com.example.demo.ifaces;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;


import com.example.demo.entity.Seminar;
import com.example.demo.entity.Speaker;

public interface SeminarRepository extends JpaRepository<Seminar,Integer> {

	

}
