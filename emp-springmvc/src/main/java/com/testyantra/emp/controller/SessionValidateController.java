package com.testyantra.emp.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import static com.testyantra.emp.common.EMPConstants.VIEW_LOGINPAGE;

@Controller
@RequestMapping("/validator")
public class SessionValidateController {

	@GetMapping("/validate")
	public String validate(HttpSession httpSession, @Value("${invalidSession})") String msg, 
			                                             ModelMap modelMap,
			                                             @PathVariable("url1") String url1, 
			                                             @PathVariable("url2") String url2){
		if (httpSession == null) {
			modelMap.addAttribute("msg", msg);
			return VIEW_LOGINPAGE;
		}
		return "forward:"+url1+"/"+url2;
	}

	@PostMapping("/validate/{url1}/{url2}")
	public String validateForPost(HttpSession httpSession, @Value("${invalidSession})") String msg, ModelMap modelMap, @PathVariable("url1") String url1, @PathVariable("url2") String url2 ) {
		/*
		 * if (httpSession == null) { modelMap.addAttribute("msg", msg); return
		 * VIEW_LOGINPAGE; } return null;
		 */
		return validate(httpSession,msg,modelMap,url1,url2);
	}

} //End of Controller
