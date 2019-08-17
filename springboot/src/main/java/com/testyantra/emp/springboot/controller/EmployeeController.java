package com.testyantra.emp.springboot.controller;

import java.util.Arrays;
import java.util.List;

import javax.xml.ws.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.testyantra.emp.springboot.dto.EmployeeAddressInfoBean;
import com.testyantra.emp.springboot.dto.EmployeeEducationInfoBean;
import com.testyantra.emp.springboot.dto.EmployeeExperienceInfoBean;
import com.testyantra.emp.springboot.dto.EmployeeInfoBean;
import com.testyantra.emp.springboot.dto.EmployeeOtherInfoBean;
import com.testyantra.emp.springboot.dto.EmployeeResponse;
import com.testyantra.emp.springboot.repository.EmployeeRepository;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeRepository repository;

	@GetMapping(path = "/", produces = MediaType.TEXT_PLAIN_VALUE)
	public String helloWorld() {
		return "Hello world";
	}

	/*
	 * @PostMapping(path = "/create", produces = MediaType.APPLICATION_JSON_VALUE,
	 * consumes = MediaType.APPLICATION_JSON_VALUE) public EmployeeResponse
	 * createEmployee(@RequestBody EmployeeInfoBean bean) {
	 * bean.getOtherInfo().setInfoBean(bean); for (EmployeeAddressInfoBean
	 * addressInfoBean : bean.getAddressInfoBeans()) {
	 * addressInfoBean.getAddressPKBean().setInfoBean(bean); } for
	 * (EmployeeEducationInfoBean educationInfoBean : bean.getEducationInfoBeans())
	 * { educationInfoBean.getEducationPKBean().setInfoBean(bean); } for
	 * (EmployeeExperienceInfoBean experienceInfoBean :
	 * bean.getExperienceInfoBeans()) {
	 * experienceInfoBean.getExperiencePKBean().setInfoBean(bean); }
	 * EmployeeInfoBean manager = bean.getMngrId(); manager =
	 * repository.findById(manager.getId()).get(); bean.setMngrId(manager);
	 * 
	 * EmployeeResponse response = new EmployeeResponse(); if
	 * (!repository.existsById(bean.getId())) { repository.save(bean);
	 * response.setStatusCode(201); response.setMessage("successfull");
	 * response.setDescription("Employee data added successfully"); } else {
	 * response.setStatusCode(401); response.setMessage("Failed");
	 * response.setDescription("Employee data not added successfully"); } return
	 * response; }
	 */
	
	@PostMapping(path = "/create", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse createEmployee(@RequestBody EmployeeInfoBean bean) {

		EmployeeResponse response = new EmployeeResponse();
		if (!repository.existsById(bean.getId())) {
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

			bean.setMngrId(repository.findById(bean.getMngrId().getId()).get());

			repository.save(bean);
			response.setStatusCode(201);
			response.setMessage("Successfull");
			response.setDescription("Employee data inserted successfully");
		} else {
			response.setStatusCode(401);
			response.setMessage("Failed");
			response.setDescription("Employee already exists");

		}
		return response;
	}

	@GetMapping(path = "/get", produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse getEmployee(@RequestParam int id) {
		EmployeeResponse response = new EmployeeResponse();
		try {
			EmployeeInfoBean bean = repository.findById(id).get();
			if (bean != null) {
				response.setStatusCode(201);
				response.setMessage("successfull");
				response.setDescription("employee datea found successfull");
				response.setBean(Arrays.asList(bean));

			}
			/*
			 * else { response.setDescription("Employee data not found");
			 * response.setStatusCode(401); response.setMessage("Failed"); } return
			 * response;
			 */

		} catch (Exception e) {
			response.setMessage("no such employee");
		}
		return response;
	}

	@DeleteMapping(path = "/delete", produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse deleteEmployee(@RequestParam(name = "id") int id) {
		EmployeeResponse response = new EmployeeResponse();
		if (!repository.existsById(id)) {
			response.setStatusCode(401);
			response.setMessage("Failed");
			response.setDescription("Employee does not exists");
			return response;
		}
		repository.delete(repository.findById(id).get());
		response.setStatusCode(201);
		response.setMessage("Successfull");
		response.setDescription("Employee data deleted successfully");

		return response;
	}

	@PutMapping(path = "/update", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse updateEmployee(@RequestBody EmployeeInfoBean bean) {
		EmployeeResponse response = new EmployeeResponse();
		if (!repository.existsById(bean.getId())) {
			response.setStatusCode(401);
			response.setMessage("Failed");
			response.setDescription("Employee does not exists");
			return response;
		}
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
		EmployeeInfoBean mngrId = repository.findById(bean.getMngrId().getId()).get();
		bean.setMngrId(mngrId);
		repository.save(bean);
		response.setStatusCode(201);
		response.setMessage("Successfull");
		response.setDescription("Employee data inserted successfully");

		return response;
	}

}
