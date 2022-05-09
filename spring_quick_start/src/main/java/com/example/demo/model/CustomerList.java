package com.example.demo.model;


import java.util.List;

import org.springframework.stereotype.Component;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

@AllArgsConstructor
@Component
@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)

public class CustomerList {
	
	List<Customer> custList;

}
