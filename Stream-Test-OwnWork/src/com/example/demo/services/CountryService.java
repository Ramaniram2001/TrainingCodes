package com.example.demo.services;

import java.util.List;
import java.util.stream.Collectors;

import com.example.demo.model.Country;
public class CountryService {

	public static void findCountry(List<Country>list,String country) {
		List<String> place=list.stream()
				.filter(e -> e.getCountryName().equals(country))
				.map(e -> e.getPlace()).collect(Collectors.toList());
		place.forEach(System.err::println);
	}
	
	public static void findPopulation(List<Country> list,String country) {
		Long population=list.stream()
				.filter(e->e.getCountryName().equalsIgnoreCase(country))
				.mapToLong(e->e.getPopulation()).sum();
		System.out.println("The total population of the country is "+population);
	}
	
	public static void findCount(List<Country> list,String country) {
		Long count=list.stream().filter(e->e.getCountryName().equalsIgnoreCase(country))
				.map(e->e.getPlace()).count();
		System.err.println("The total count of the country with its place is "+count);
	}
}
