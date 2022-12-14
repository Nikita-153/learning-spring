/**
 * 
 */
package com.luv2code.springdemo.mvc.tags;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {

	@RequestMapping("/showForm")
	public String showForm(Model theModel) {
		
		// Create a student object
		Student theStudent = new Student();
		
		// Add student object to the model
		theModel.addAttribute("student", theStudent);
		
		return "student-form";
	}
	

	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute("student") Student student) {
		
		System.out.println("Student information: " + student.getFirstName() + " "  + student.getLastName());
		
		return "student-confirmation";
	}
}
