package com.testyantra.libmgmt.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.testyantra.libmgmt.dto.Response;
import com.testyantra.libmgmt.service.LibraryServiceImpl;

@RestController
@CrossOrigin("http://localhost:3001")
public class LoginController {
	
	@Autowired
	LibraryServiceImpl libraryService;
	
	@GetMapping("/hello")
	public String hello() {
		return "india";
	}
	
	/*
	 * @PostMapping(path="/authenticate",produces=MediaType.APPLICATION_JSON_VALUE)
	 * public Response userLogin(@RequestParam int userId,@RequestParam String
	 * password,HttpServletRequest request) { //return
	 * libraryService.userLogin(email, password,request); return
	 * libraryService.userLogin(userId, password,request); }
	 */
	
	@PostMapping(path="/authenticate",produces=MediaType.APPLICATION_JSON_VALUE)
	public Response userLogin(@RequestParam int userId,@RequestParam String password,HttpServletRequest request) {
		//return libraryService.userLogin(email, password,request);
		return libraryService.userLogin(userId, password,request);
	}
	@GetMapping(path="/logout",produces=MediaType.APPLICATION_JSON_VALUE)
	public Response userLogout(HttpSession session) {
		return libraryService.userLogout(session);
	}
	
	
}
