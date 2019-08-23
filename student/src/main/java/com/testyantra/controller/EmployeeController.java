package com.testyantra.controller;


import static com.testyantra.constants.EMPConstants.PROPERTY_FILENAME;
import static com.testyantra.constants.EMPConstants.DB_INTERACTION_TYPE;
import static com.testyantra.constants.EMPConstants.VIEW_HOMEPAGE;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.testyantra.beans.EmployeeAddressInfoBean;
import com.testyantra.beans.EmployeeEducationInfoBean;
import com.testyantra.beans.EmployeeExperienceInfoBean;
import com.testyantra.beans.EmployeeInfoBean;
import com.testyantra.beans.EmployeeOtherInfoBean;
import com.testyantra.dao.EmployeeDao;


@Controller
@RequestMapping("/employee")
@PropertySource(PROPERTY_FILENAME)
public class EmployeeController {

	@Autowired
	@Qualifier(DB_INTERACTION_TYPE)
	EmployeeDao dao;

	@InitBinder
	public void initBinder(WebDataBinder binder) {
		CustomDateEditor editor = new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"), true);
		binder.registerCustomEditor(Date.class, editor);
	}

	@GetMapping("/search")
	public String searchEmployee(int q, ModelMap map) {
		List<EmployeeInfoBean> beans = dao.getAllEmployeeInfoWithRestrictions(q);
		map.addAttribute("emplist", beans);
		return "searchemployee";
	}
	
	@GetMapping("/getEmployee")
	public String getEmployee(int id, ModelMap map) {
		EmployeeInfoBean bean = dao.getEmployeeInfo(id);
		map.addAttribute("bean", bean);
		return VIEW_HOMEPAGE;
	}
	
	@GetMapping("/createEmployeePage")
	public String createEmployee() {
		return "createemployee2";
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
		
		EmployeeOtherInfoBean otherInfo = bean.getOtherInfo();
		otherInfo.setInfoBean(bean);
		
		boolean result = dao.createEmployeeInfo(bean);
		if (result) {
			map.addAttribute("msg", "Employee added Successfully!!!");
		} else {
			map.addAttribute("msg", "Employee insertion failed!!!");
		}
		return "loginPage";
	}
}
