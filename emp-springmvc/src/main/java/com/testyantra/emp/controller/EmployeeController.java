package com.testyantra.emp.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.testyantra.emp.dao.EmployeeDAO;
import com.testyantra.emp.dao.EmployeeDAOFactory;
import com.testyantra.empspringmvc.bean.EmployeeInfoBean;
import static com.testyantra.emp.common.EMPConstants.DB_INTERACTIONTYPE;

import lombok.extern.java.Log;

@Log
@Controller // this will take the requuset from the dispatchet servlet
@RequestMapping("/employee")
public class EmployeeController {
	

	@Autowired
	@Qualifier(DB_INTERACTIONTYPE)
	private EmployeeDAO dao;



	  @InitBinder public void initBinder(WebDataBinder binder) {
		  CustomDateEditor editor = new CustomDateEditor(new SimpleDateFormat("yyyy-mm--dd"), true);
	  binder.registerCustomEditor(Date.class, editor); 
	  }
	  
	 @GetMapping("/search")
	  public String searchEmployee(int q,ModelMap modelMap) {
		 List<EmployeeInfoBean> beans=dao.getEmployeeIds(q);
		 modelMap.addAttribute("empList", beans);
		 return "searchemployee";
		  
	  }
	

}
