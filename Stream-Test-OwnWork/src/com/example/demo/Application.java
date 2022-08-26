package com.example.demo;

import java.util.ArrayList;

import java.util.List;
import java.util.stream.Collectors;

import com.example.demo.model.Country;
import com.example.demo.services.CountryService;

public class Application {

	public static void main(String[] args) {
		
		List<Country> countryList=new ArrayList<Country> ();
		Country country1=new Country("USA","Kansas City",10000000);
		Country country2=new Country("India","Chennai",200000000);
		Country country3=new Country("USA","Los Angeles",300000000);
		Country country4=new Country("Nepal","Kathmandu",400000000);
		Country country5=new Country("India","Kolkata",500000000);
		Country country6=new Country("USA","Denver",600000000);
		
		countryList.add(country1);
		countryList.add(country2);
		countryList.add(country3);
		countryList.add(country4);
		countryList.add(country5);
		countryList.add(country6);
		
		//output 1: Printing all the items
		countryList.forEach(names->System.out.println(names));//the below is also same 
		countryList.forEach(System.err::println);
		
		
		//output 2: Printing the items using filtering method
		List<Country> findByCountryName=countryList
				.stream()
				.filter(e->e.getCountryName()
						.equalsIgnoreCase("usa")).collect(Collectors.toList());
		System.out.println("");
		findByCountryName.forEach(details->System.err.println(details));
	
		//output 3: Getting the count of the countries
		int findCount=(int) countryList
				.stream().filter(e->e.getCountryName().equalsIgnoreCase("india")).count();
		System.out.println("");
		System.out.println("The total count of the country is "+findCount);
		
		//output 4: Getting place from country using service class
		System.out.println("");
		CountryService.findCountry(countryList,"USA");
		
		//output 5: Getting population from country
		System.out.println("");
		CountryService.findPopulation(countryList, "India");
			
		//output 6: Getting count of a country with its place
		System.out.println("");
		CountryService.findCount(countryList,"Nepal");
		

		
		
		
				
		
		
	}

}
