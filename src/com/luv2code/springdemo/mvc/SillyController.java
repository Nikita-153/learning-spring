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
public class SillyController {
	
//	a controller method to show the inital form
	@RequestMapping("/showForm")
	public String showSomeForm() {
		return "helloworld-form";
	}
}
