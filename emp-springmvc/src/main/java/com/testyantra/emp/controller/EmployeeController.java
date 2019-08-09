package com.testyantra.emp.controller;

import static com.testyantra.emp.common.EMPConstants.DB_INTERACTIONTYPE;
import static com.testyantra.emp.common.EMPConstants.VIEW_CREATEEMPLOYEE;

import java.text.SimpleDateFormat;
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

import com.testyantra.emp.dao.EmployeeDAO;
import com.testyantra.empspringmvc.bean.EmployeeAddressInfoBean;
import com.testyantra.empspringmvc.bean.EmployeeEducationInfoBean;
import com.testyantra.empspringmvc.bean.EmployeeExperienceInfoBean;
import com.testyantra.empspringmvc.bean.EmployeeInfoBean;
import com.testyantra.empspringmvc.bean.EmployeeOtherInfoBean;

import lombok.extern.java.Log;

@Log
@Controller // this will take the requuset from the dispatchet servlet
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	@Qualifier(DB_INTERACTIONTYPE)
	private EmployeeDAO dao;
	
  @GetMapping("/createemployee")
	public String createEmployee() {
	return VIEW_CREATEEMPLOYEE;
		
	}

	  @InitBinder 
	  public void initBinder(WebDataBinder binder) {
		  CustomDateEditor editor = new CustomDateEditor(new SimpleDateFormat("yyyy-mm--dd"), true);
	  binder.registerCustomEditor(Date.class, editor); 
	  }
	  
	  @PostMapping("/createEmployee")
		public String addEmployee(EmployeeInfoBean bean, ModelMap map) {
		
		List<EmployeeEducationInfoBean> eduBeans = bean.getEducationInfoBeans();
		for (EmployeeEducationInfoBean employeeEducationInfoBean : eduBeans) {
			employeeEducationInfoBean.getEducationPKBean().setInfoBean(bean);
		}
		List<EmployeeAddressInfoBean> addressBeans = bean.getAddressInfoBeans();
		for (EmployeeAddressInfoBean employeeAddressInfoBean : addressBeans) {
			employeeAddressInfoBean.getAddressPKBean().setInfoBean(bean);
		}
		List<EmployeeExperienceInfoBean> expBeans = bean.getExperienceInfoBeans();
		for (EmployeeExperienceInfoBean employeeExperienceInfoBean : expBeans) {
			employeeExperienceInfoBean.getExperiencePKBean().setInfoBean(bean);
		}
		
		EmployeeOtherInfoBean otherInfo = bean.getEmployeeOtherInfoBean();
		otherInfo.setInfoBean(bean);
		
		boolean result = dao.createEmployeeInfo(bean);
		if (result) {
			map.addAttribute("msg", "Employee added Successfully!!!");
		} else {
			map.addAttribute("msg", "Employee insertion failed!!!");
		}
		return "loginPage";
	}
	  
	  @GetMapping("/updateemployee")
	  public String getUpdateEmployee() {
		  return "updateEmployee";
	  }
	 
	  
	  @PostMapping("/updateemployee")
	  public String updateEmployee(EmployeeInfoBean infoBean, int mngId) {
		  EmployeeInfoBean mngBean=dao.getEmployeeInfo(mngId);
		  infoBean.setMngrId(mngBean);
		  dao.updateEmployeeInfo(infoBean);
		  return "home";	  	  
	  }
	  
	/*
	 * @GetMapping("/search") public String searchEmployee(int q,ModelMap modelMap)
	 * { List<EmployeeInfoBeanold> beans=dao.getEmployeeIds(q);
	 * modelMap.addAttribute("empList", beans); return "searchemployee";
	 * 
	 * }
	 */

}
