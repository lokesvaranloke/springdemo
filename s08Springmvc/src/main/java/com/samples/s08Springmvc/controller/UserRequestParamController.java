package com.samples.s08Springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserRequestParamController {

	@RequestMapping(value="/showdata")
	public ModelAndView showData(@RequestParam("id")  int id, @RequestParam("name") String name, @RequestParam("salary") int salary) {
		
		System.out.println("Id : "+id);
		System.out.println("Name : "+name);
		System.out.println("Salary : "+salary);
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("id",id);
		mv.addObject("name",name);
		mv.addObject("salary",salary);
		mv.setViewName("hello");
		return mv;
	}
}
