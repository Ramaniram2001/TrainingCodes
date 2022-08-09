package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="hari_driver_2022")
@AllArgsConstructor
@NoArgsConstructor
public class Driver {
	@Id
	@Column(name="Driver_Id")
	private int driverId;
	@Column(name="Driver_Name")
	private String driverName;
	@Column(name="Mobile_Number")
	private long mobileNumber;
	@Column(name="Rating")
	private double rating;
}
