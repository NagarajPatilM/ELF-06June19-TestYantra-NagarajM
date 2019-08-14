package com.testyantra.emp.controller;

import static com.testyantra.emp.common.EMPConstants.DB_INTERACTION_TYPE;
import static com.testyantra.emp.common.EMPConstants.PROPERTY_FILENAME;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.context.annotation.PropertySource;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.testyantra.emp.dao.EmployeeDao;
import com.testyantra.emp.dto.EmployeeAddressInfoBean;
import com.testyantra.emp.dto.EmployeeEducationInfoBean;
import com.testyantra.emp.dto.EmployeeExperienceInfoBean;
import com.testyantra.emp.dto.EmployeeInfoBean;
import com.testyantra.emp.dto.EmployeeOtherInfoBean;
import com.testyantra.emp.dto.EmployeeResponse;

@RestController
@RequestMapping("/employee")
@PropertySource(PROPERTY_FILENAME)
public class EmployeeController {

	@Autowired
	@Qualifier(DB_INTERACTION_TYPE)
	EmployeeDao dao;

	EmployeeResponse response = new EmployeeResponse();

	@InitBinder
	public void initBinder(WebDataBinder binder) {
		CustomDateEditor editor = new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"), true);
		binder.registerCustomEditor(Date.class, editor);
	}

	/*
	 * @DeleteMapping("/removeEmployee") public @ResponseBody boolean
	 * deleteEmployee(@PathVariable("id") int id) { return
	 * dao.deleteEmployeeInfo(id); }
	 */

	@DeleteMapping(value = "/removeEmployee")
	public EmployeeResponse deleteEmployee(@RequestParam(name = "id") int id) {
		if (dao.deleteEmployeeInfo(id)) {
			response.setDescription("employee removed successfully");
			response.setMessage("successfull");
			response.setStatusCode(201);
		} else {
			response.setStatusCode(501);
			response.setMessage("employee not removed");
		}
		return response;
	}

	@GetMapping(value = "/getEmployee")
	public EmployeeResponse getEmployee(@RequestParam(name = "empId") int id, HttpServletRequest request) {

		if (request.getSession(false) != null) {
			EmployeeInfoBean bean = dao.getEmployeeInfo(id);
			EmployeeResponse response = new EmployeeResponse();
			if (bean != null) {
				response.setStatusCode(201);
				response.setMessage("successfull");
				response.setDescription("employee data found");
				response.setBean(Arrays.asList(bean));
			} else {
				response.setMessage("failure");
				response.setStatusCode(401);
				response.setDescription("Employee data not found");
			}
			return response;
		} else {
			response.setDescription(" invalid session");
			response.setMessage("please login first ");
			response.setStatusCode(401);
			return response;
		}
	}

	/*
	 * @GetMapping(path = "/getAllEmployee") public @ResponseBody
	 * List<EmployeeInfoBean> getAllEmployee1() { return dao.getAllEmployeeInfo(); }
	 */

	@GetMapping(path = "/getAllEmployee")
	public @ResponseBody EmployeeResponse getAllEmployee1() {
		List<EmployeeInfoBean> beans = dao.getAllEmployeeInfo();
		EmployeeResponse response = new EmployeeResponse();
		if (beans != null) {
			response.setMessage("success");
			response.setStatusCode(201);
			response.setBean(beans);

		} else {
			response.setStatusCode(501);
			response.setMessage("failure");
		}
		return response;
	}

	/*
	 * 
	 * @PostMapping("/createEmployee") public @ResponseBody boolean
	 * addEmployee(@RequestBody EmployeeInfoBean bean, ModelMap map) {
	 * 
	 * List<EmployeeEducationInfoBean> eduBeans = bean.getEducationInfoBeans(); for
	 * (EmployeeEducationInfoBean employeeEducationInfoBean : eduBeans) {
	 * employeeEducationInfoBean.getEducationPKBean().setInfoBean(bean); }
	 * List<EmployeeAddressInfoBean> addressBeans = bean.getAddressInfoBeans(); for
	 * (EmployeeAddressInfoBean employeeAddressInfoBean : addressBeans) {
	 * employeeAddressInfoBean.getAddressPKBean().setInfoBean(bean); }
	 * List<EmployeeExperienceInfoBean> expBeans = bean.getExperienceInfoBeans();
	 * for (EmployeeExperienceInfoBean employeeExperienceInfoBean : expBeans) {
	 * employeeExperienceInfoBean.getExperiencePKBean().setInfoBean(bean); }
	 * 
	 * EmployeeOtherInfoBean otherInfo = bean.getOtherInfo();
	 * otherInfo.setInfoBean(bean);
	 * 
	 * bean.setMngrId(dao.getEmployeeInfo(bean.getMngrId().getId())); boolean result
	 * = dao.createEmployeeInfo(bean); if (result) { map.addAttribute("msg",
	 * "Employee added Successfully!!!"); return true; } map.addAttribute("msg",
	 * "Employee insertion failed!!!"); return false;
	 * 
	 * }
	 */

	@PostMapping(path = "/createEmployee", produces = { MediaType.APPLICATION_JSON_VALUE })
	public EmployeeResponse addEmployee(@RequestBody EmployeeInfoBean bean, ModelMap map) {

		if (dao.createEmployeeInfo(bean)) {
			response.setStatusCode(201);
			response.setMessage("successfull");
			response.setDescription("employee data inserted successfully");
		} else {
			response.setStatusCode(501);
			response.setMessage("not successfull");
			response.setDescription("employee data not inserted successfully");
		}
		return response;
	}

	@PutMapping(path = "/updateEmployee")
	public @ResponseBody boolean updateEmployee(EmployeeInfoBean bean, int managerId, ModelMap map,
			HttpSession session) {

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

		bean.setMngrId(dao.getEmployeeInfo(managerId));
		boolean result = dao.updateEmployeeInfo(bean);
		if (result) {
			map.addAttribute("msg", "Employee updated Successfully!!!");
			session.setAttribute("bean", bean);
			return true;
		}
		map.addAttribute("msg", "Employee updation failed!!!");
		return false;
	}

}
