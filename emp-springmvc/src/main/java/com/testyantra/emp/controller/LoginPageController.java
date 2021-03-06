package com.testyantra.emp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.testyantra.emp.bean.EmployeeInfoBean;
import com.testyantra.emp.dao.EmployeeDAO;
import com.testyantra.emp.dao.EmployeeDAOFactory;

@Controller
@RequestMapping("/login")
public class LoginPageController {

	@GetMapping("/getlogin")
	public String getPage() {
		return "Login";
	}

	@PostMapping("/submitlogin1")
	public String submitLogin(int id, String password, ModelMap modelmap) {
		EmployeeDAO dao = EmployeeDAOFactory.getInstance();
		EmployeeInfoBean empInfo = dao.getEmployeeInfo(id);
		
		if (empInfo != null && empInfo.getPassword().equals (password) ){
			modelmap.addAttribute("bean", empInfo);
			return "Home";
		} else {
			modelmap.addAttribute("msg","Invalid Username and Password!!!");
			return "Login";
			//return "Login?msg=Invalid!!";
		}

	}

}
