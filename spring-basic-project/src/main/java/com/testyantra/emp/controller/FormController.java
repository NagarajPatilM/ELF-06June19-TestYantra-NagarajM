package com.testyantra.emp.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.testyantra.emp.bean.UserBean;

@Controller
@RequestMapping("/forms")
public class FormController {

	@GetMapping("/getform")
	public String getForm() {
		return "myform";
	}

	@PostMapping("/formsubmit")
	public String submitForm(HttpServletRequest req) {        //generally we dont use
		int userId = Integer.parseInt(req.getParameter("userId"));
		String pwd = req.getParameter("password");

		req.setAttribute("userId", userId);
		req.setAttribute("password", pwd);

		return "formdisplay"; // name of jsp
	}

	@PostMapping("/formsubmit2")
	public String submitForm2(int userid, String password, ModelMap modelmap) { // userid,password names should be same
																				// as in name attribute of myform.jsp
		modelmap.addAttribute("userId", userid);
		modelmap.addAttribute("password", password);
		return "formdisplay";
	}

	@PostMapping("/formsubmit3")
	public String submitForm3(UserBean userBean, ModelMap map) {

		map.addAttribute("userbean", userBean);
		return "formdisplay2";
	}

	@PostMapping("/formsubmit4")
	public String submitform4(@RequestParam(name = "userId") int uid,
			             @RequestParam(name = "password") String pwd, ModelMap modelmap) {
		modelmap.addAttribute("userId", uid);
		modelmap.addAttribute("password", pwd);
		return "formdisplay";
	}

	@PostMapping("/formsubmit5")
	public String submitform5(@RequestParam(name = "userId") int uid,
			             @RequestParam(name = "password") String pwd, ModelMap modelmap) {
		modelmap.addAttribute("userId", uid);
		modelmap.addAttribute("password", pwd);
		return "formdisplayexplan";
	}
	

	@PostMapping("/formsubmit6")
	public String submitform6(UserBean userBean,  ModelMap modelmap) {
		
		modelmap.addAttribute("userBean", userBean);
		return "formdisplaybeanexplan";
	}
	
	

}
