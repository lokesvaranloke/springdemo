package com.samples.s08Springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.samples.s08Springmvc.domain.Employee;

@Controller
public class ObjectController {

	@RequestMapping("/readobject")
	public ModelAndView sendObject() {
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("displayobject");
		
		Employee emp = new Employee();
		emp.setId(1234);
		emp.setName("Harish");
		emp.setSalary(2000);
		
		modelAndView.addObject("employee",emp);
		return modelAndView;
	}
}
