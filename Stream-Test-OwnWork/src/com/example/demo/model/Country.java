package com.example.demo.model;

public class Country {
	
	private String countryName;
	private String place;
	private long population;
	public Country() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Country(String countryName, String place, long population) {
		super();
		this.countryName = countryName;
		this.place = place;
		this.population = population;
	}
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public long getPopulation() {
		return population;
	}
	public void setPopulation(long population) {
		this.population = population;
	}
	@Override
	public String toString() {
		return "Country [countryName=" + countryName + ", place=" + place + ", population=" + population + "]";
	}
	

}
