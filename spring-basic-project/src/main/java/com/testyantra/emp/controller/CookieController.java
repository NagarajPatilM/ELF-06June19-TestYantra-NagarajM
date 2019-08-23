package com.testyantra.emp.controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/cookie")

public class CookieController {

	@GetMapping("/getCookie")
	public String getCookie() {
		return "cookiepage";
	}

	@GetMapping("/createcookie")
	public String createCookie(HttpServletResponse response, ModelMap map) {
		Cookie cookie=new Cookie("myCookie", "nag"); 
		response.addCookie(cookie);
		map.addAttribute("msg", "cookie created");
		return "cookiepage";
	}
	
	@GetMapping("/readcookie")
	public String readCookie(@CookieValue(name="myCookie")String name, ModelMap map) {
		map.addAttribute("msg",name );
		return "cookiepage";
	}

} // End of CookieController
