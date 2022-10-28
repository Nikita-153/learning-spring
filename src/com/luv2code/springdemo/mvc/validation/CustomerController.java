/**
 * 
 */
package com.luv2code.springdemo.mvc.validation;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customer")
public class CustomerController {

	    // Adding initbinder to do some string preprocessing
		// This will trim any leading or trailing spaces of the form provide string
		// The value is set to true - which means it will if only space is a string input then it will be trimmed to null
		
/*		@InitBinder()
		public void initBinder(WebDataBinder dataBinder) {
    		StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
//			dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
			
//			dataBinder.registerCustomEditor(String.class, "firstName", stringTrimmerEditor);
//			dataBinder.registerCustomEditor(String.class, "lastName", stringTrimmerEditor);
		}
*/
	@RequestMapping("/showForm")
	public String showForm(Model theModel) {
		
		theModel.addAttribute("customer", new Customer());
		return "customer-form";
	}
	

	@RequestMapping("/processForm")
	public String processForm(@Valid @ModelAttribute("customer") Customer customer, BindingResult bindingResult) {
		
		System.out.println("Customer information: " + customer.getFirstName() + " "  + customer.getLastName());
		
		if(bindingResult.hasErrors()) {
			return "customer-form";		
		}else {
			return "customer-confirmation";			
		}
	}
}
