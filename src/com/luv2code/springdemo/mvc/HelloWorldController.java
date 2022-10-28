/**
 * 
 */
package com.luv2code.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("hello")
public class HelloWorldController {
	
//	a controller method to show the inital form
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}
	
//	a controller method to process the inital form
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}

	@RequestMapping("/processFormVersionTwo")
	public String letsShoutsDude(HttpServletRequest request, Model model) {
		
		String theName =  request.getParameter("studentName");
		
		String result = "Yo Yo! " + theName.toUpperCase();
		
		model.addAttribute("message", result);
		
		return "helloworld";
	}
	
	
	@RequestMapping("/processFormVersionThree")
	public String letsShoutsDude(@RequestParam("studentName") String theName, Model model) {
		
		//String theName =  request.getParameter("studentName");
		// when we use @RequestParam - this will take care of the above line
		
		String result = "Yo Yo! " + theName.toUpperCase();
		
		model.addAttribute("message", result);
		
		return "helloworld";
	}
	
}
