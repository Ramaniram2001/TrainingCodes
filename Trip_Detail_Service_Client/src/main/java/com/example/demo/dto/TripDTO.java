package com.example.demo.dto;

import java.time.LocalDate;
import java.util.Set;

import com.example.demo.entity.CabDriver;
import com.example.demo.entity.TripDetail;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;


@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level=AccessLevel.PRIVATE)

public class TripDTO {

	
	private CabDriver driver;
	
	private Set<TripDetail> trips;
}