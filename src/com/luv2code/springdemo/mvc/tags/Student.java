/**
 * 
 */
package com.luv2code.springdemo.mvc.tags;

import java.util.LinkedHashMap;

public class Student {
	
	private String firstName;
	private String lastName;
	private String country;
	
	private LinkedHashMap<String, String> countryOptions;
	
	Student(){
		countryOptions = new LinkedHashMap<String, String>();
		countryOptions.put("BZ", "Brazil");
		countryOptions.put("IT", "Italy");
		countryOptions.put("IN", "India");
		countryOptions.put("US", "America");
	}
	
	
	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}


	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	
	
}
