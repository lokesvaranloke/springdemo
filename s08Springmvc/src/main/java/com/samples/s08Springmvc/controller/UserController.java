package com.samples.s08Springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.samples.s08Springmvc.domain.User;

@Controller
public class UserController {
	
//	@RequestMapping("/register")
//	public ModelAndView showRegistrationPage() {
//		ModelAndView mv = new ModelAndView();
//		mv.setViewName("userreg");
//		return mv;
//	}
	
//	showRegistrationPage in simpler way
//	here we dont have the usage of modelandview so simply we are writing like this
	
	@RequestMapping("/register")
	public String showRegistrationPage() {
		return "userreg";
	}
	
	
	
//	@RequestMapping(value="/registeruser", method=RequestMethod.POST)
//	public ModelAndView registerUser(@ModelAttribute("user") User user) {
//		System.out.println("User object retrieved from UI = "+user);
//		
//		ModelAndView mv = new ModelAndView();
//		mv.addObject("userfromcontroller",user);
//		mv.setViewName("userregresult");
//		return mv;
//	}
	
//	we can also simplify this from modelandview to simple string
	
	@RequestMapping(value="/registeruser", method=RequestMethod.GET)
	public String registerUser(@ModelAttribute("user") User user, ModelMap model) {
		System.out.println("User object retrieved from UI = "+user);
		
		model.addAttribute("userfromcontroller",user);
		return "userregresult";
		
	}
	
}
