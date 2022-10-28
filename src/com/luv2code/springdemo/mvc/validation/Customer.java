/**
 * 
 */
package com.luv2code.springdemo.mvc.validation;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;

public class Customer {
	
		
	private String firstName;
	
	@NonNull()
	@Size(min=1, message="is required")
	private String lastName;
	
	@Min(value=0, message="Must be greater than or equal to zero")
	@Max(value=10, message="Must be lesser than or equal to ten")
	private int freePasses;
	
	@Pattern(regexp="^[a-zA-Z0-9]{5}", message = "Only 5 Chars/Digits allowed")
	private String postalCode;
	
	
	// private int courseCode;
	
	
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
	public int getFreePasses() {
		return freePasses;
	}
	public void setFreePasses(int freePasses) {
		this.freePasses = freePasses;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	
	
	
}
