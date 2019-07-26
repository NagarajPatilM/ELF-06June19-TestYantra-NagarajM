package com.testyantra.emp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller // this will take the requuset from the dispatchet servlet
@RequestMapping("/employee")
public class EmployeeController {

	/*
	 * We are explicitly creating ModelAndView object
	 */
	
	@RequestMapping(path = "/getmessage", method = RequestMethod.GET)
	public ModelAndView getMessage() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("WEB-INF/views/messagepage.jsp");
		return modelAndView;
	}

	/*
	 * spring container will implicitly create ModelAndView object
	 */
	// @RequestMapping(path="/getmessage", method=RequestMethod.GET)
	
	@GetMapping("/seeMessage")
	public ModelAndView getMessage(ModelAndView modelAndView) { //spring implicitly creating ModelAndView object
		modelAndView.setViewName("../WEB-INF/views/messagepage.jsp");
		return modelAndView;
	}

}
