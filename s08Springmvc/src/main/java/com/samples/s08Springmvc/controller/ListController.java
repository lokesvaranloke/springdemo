package com.samples.s08Springmvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.samples.s08Springmvc.domain.Employee;

@Controller
public class ListController {

	@RequestMapping("/readlist")
	public ModelAndView sendList() {
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("displaylist");
		
		List<Employee> employees = new ArrayList<>();
		
		Employee emp = new Employee();
		emp.setId(1234);
		emp.setName("Harish");
		emp.setSalary(2000);
		employees.add(emp);
		
		emp = new Employee();
		emp.setId(3333);
		emp.setName("Vikram");
		emp.setSalary(5000);
		employees.add(emp);
		
		emp = new Employee();
		emp.setId(4444);
		emp.setName("Raju");
		emp.setSalary(1500);
		employees.add(emp);
		
		modelAndView.addObject("employees",employees);
		
		return modelAndView;
	}
}
