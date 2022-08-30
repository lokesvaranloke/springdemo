package com.samples.s08Springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

	@RequestMapping("/hello")
	public ModelAndView hello() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("hello");
		
		modelAndView.addObject("id", 100);
		modelAndView.addObject("name", "John");
		modelAndView.addObject("salary", 60000);
		
		return modelAndView;
	}
}
