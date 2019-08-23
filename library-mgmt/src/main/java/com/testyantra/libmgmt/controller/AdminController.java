package com.testyantra.libmgmt.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.testyantra.libmgmt.dto.Response;
import com.testyantra.libmgmt.dto.UserBean;
import com.testyantra.libmgmt.service.LibraryServiceImpl;


@RestController
@CrossOrigin("http://localhost:3001")
public class AdminController {
	
	@Autowired
	LibraryServiceImpl libraryService;
	
	@PostMapping(path = "/addUser", produces = MediaType.APPLICATION_JSON_VALUE)
	public Response createUser( UserBean user, HttpServletRequest request) {
		return libraryService.createUser(user, request);
	}
	
	@PostMapping(path="/updateUser",produces=MediaType.APPLICATION_JSON_VALUE)
	public Response updateUser(UserBean user, HttpServletRequest request) {
		return libraryService.updateUser(user, request);
	}
	
	@PostMapping(path="/deactivateUser",produces=MediaType.APPLICATION_JSON_VALUE)
	public Response deActivateUser(@RequestParam int userId, HttpServletRequest request) {
		return libraryService.deActivateUser(userId, request);
	}

}
