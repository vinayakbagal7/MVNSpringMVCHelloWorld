package com.srccodes.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Abhijit Ghosh
 * @version 1.0
 */

@Controller
public class SpringMVCHelloController {

	@RequestMapping("/")
	public String printHelloWorld(Model model) {
		model.addAttribute("message", "Hello World default");
		return "helloWorld";
	}
	
	@RequestMapping("/hello")
	public String printHelloWorld1(Model model) {
		model.addAttribute("message", "Hello World /hello !");
		return "helloWorld";
	}
}
