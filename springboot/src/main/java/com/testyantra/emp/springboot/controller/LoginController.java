package com.testyantra.emp.springboot.controller;

import java.util.Arrays;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.testyantra.emp.springboot.dto.EmployeeInfoBean;
import com.testyantra.emp.springboot.dto.EmployeeResponse;
import com.testyantra.emp.springboot.repository.EmployeeRepository;

@RestController

public class LoginController {
	@Autowired
	EmployeeRepository repository;

	@PostMapping(path="/authenticate", produces=MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse authenticate(int id, String password, HttpServletRequest request) {
		EmployeeInfoBean bean = repository.findById(id).get();
		EmployeeResponse response = new EmployeeResponse();
		if (bean != null && bean.getPassword().equals(password)) {
			response.setStatusCode(201);
			response.setDescription("successfull logged in");
			response.setMessage("successfull");
			response.setBean(Arrays.asList(bean));
		} else {
			response.setStatusCode(401);
			response.setMessage("invalid credentials");
			response.setDescription("please login again");
		}
		return response;
	}
	
	
}
