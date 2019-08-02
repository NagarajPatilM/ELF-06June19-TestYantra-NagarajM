package com.testyantra.emp.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.testyantra.emp.bean.EmployeeInfoBean;
import com.testyantra.emp.dao.EmployeeDAO;
import com.testyantra.emp.dao.EmployeeDAOFactory;

import lombok.extern.java.Log;

@Log
@Controller // this will take the requuset from the dispatchet servlet
@RequestMapping("/employee")
public class EmployeeControllerOld {

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
	public ModelAndView getMessage(ModelAndView modelAndView) { // spring implicitly creating ModelAndView object
		modelAndView.setViewName("../WEB-INF/views/messagepage.jsp");
		return modelAndView;
	}

	/*
	 * @InitBinder public void initBinder(WebDataBinder binder) { CustomDateEditor
	 * editor = new CustomDateEditor(new SimpleDateFormat("yyyy-mm--dd"), true);
	 * binder.registerCustomEditor(Date.class, editor); }
	 */
	@GetMapping("/getform")
	public String getEmployeeForm() {
		/*
		 * Date date = new Date(); log.info("" + date);
		 */
		return "createemployee";
	}

	@PostMapping("/create")
	public String createEmployee(EmployeeInfoBean bean) {
		EmployeeDAO dao = EmployeeDAOFactory.getInstance();
		boolean b = dao.createEmployeeInfo(bean);
		if (b) {
			return "created successfull";
		} else {
			return "not created";
		}

	}
}
