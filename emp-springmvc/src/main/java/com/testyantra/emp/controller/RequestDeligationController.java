package com.testyantra.emp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/deligate")
public class RequestDeligationController {

	@GetMapping("/getHomePage")
	public String getHomePage() {
		return "Homepage";
		
	}// End of getHomePage( )
	@GetMapping("/forwardReq")
	public String forwardReq() {
		return "forward:/forms/getform"; //Spring doesn't treat this as a View page
	}
	
	@GetMapping("/redirectReq")
	public String redirectReq() {
		return "redirect:https://www.yahoo.com";  //Spring doesn't treat this as a View page
	}

}// End of controller
