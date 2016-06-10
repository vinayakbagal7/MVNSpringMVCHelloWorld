package com.srccodes.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.srccodes.spring.exception.SpringException;
import com.srccodes.spring.model.Student;

/**
 * @author Abhijit Ghosh
 * @version 1.0
 */

@Controller
public class StudentController {

	@RequestMapping("/vinu")
	public String printHelloWorld(Model model) {
		model.addAttribute("message", "Hello World /vinu!");
		return "helloWorld";
	}
	
	@RequestMapping(value = "/redirect", method = RequestMethod.GET)
    public String redirect() {
		return "redirect:/staticpages/staticPage.html";
    }
	
	 @RequestMapping(value = "/student", method = RequestMethod.GET)
	 public ModelAndView student() {
	    return new ModelAndView("student", "command", new Student());
	 }
	   
	 @RequestMapping(value = "/addStudent", method = RequestMethod.POST)
	 public String addStudent(@ModelAttribute("SpringWeb")Student student, 
	   ModelMap model) {
		 if(student.getName().length() < 5 ){
	         throw new SpringException("Given name is too short");
	      }else{
	       model.addAttribute("name", student.getName());
	      }
	      
	      if( student.getAge() < 10 ){
	         throw new SpringException("Given age is too low");
	      }else{
	       model.addAttribute("age", student.getAge());
	      }
	      model.addAttribute("id", student.getId());
	      return "result";	      
	 }
}
