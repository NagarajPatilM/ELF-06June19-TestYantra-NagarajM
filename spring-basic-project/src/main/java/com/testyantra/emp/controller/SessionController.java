package com.testyantra.emp.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.testyantra.emp.bean.EmployeeInfoBean;
import com.testyantra.emp.dao.EmployeeDAO;
import com.testyantra.emp.dao.EmployeeDAOFactory;

@Controller
@RequestMapping("/session")
@PropertySource("classpath:msg.properties")
public class SessionController {

	@GetMapping("/loginform")
	public String loginForm() {
		return "Login";
	}// End of login( )

	@PostMapping("/login")
	public String authenticate(int id, String password, HttpServletRequest request, ModelMap map) {
		EmployeeDAO dao = EmployeeDAOFactory.getInstance();
		EmployeeInfoBean bean = dao.getEmployeeInfo(id);
		if (bean != null && bean.getPassword().equals(password)) {
			HttpSession session = request.getSession(true);
			map.addAttribute("bean", bean);
			return "home";
		} else {
			map.addAttribute("bean", "invalid credentials!!");
			return "Login";
		}

	}

	@GetMapping("/logout")
	public String logout(HttpSession session, ModelMap map) {
		if (session != null) {
			session.invalidate();
			map.addAttribute("bean", "thanks for visiting");
			return "Login";
		}
		return "Login";
	}

	@GetMapping("/validate1")
	public String validateSession1(HttpSession session, ModelMap map, @RequestParam String url, @Value("${msg}") String msg) {
		if (session.isNew()) {
			map.addAttribute("msg", msg);
			session.invalidate();
			return "Login";
		}
		return url; //This will not go to the controller,it will go to the view jsp
		//return "forward:/session/"+url; //this will go to the controller
	}

	@GetMapping("/validate2")
	public String validateSession2(HttpServletRequest request, ModelMap map, @RequestParam String url, @Value("${msg}") String msg) {
		if (request.getSession(false) == null) {
			map.addAttribute("msg", msg);
			return "Login";
		}
		return url;
	}

	@GetMapping("/validate3/{url}")
	public String validateSession3(HttpServletRequest request, ModelMap map, @RequestParam String url, @Value("${msg}") String msg) {
		if (request.getSession(false) == null) {
			map.addAttribute("msg", msg);
			return "Login";
		}
		return "forward:/session/"+url;
	}

	@PostMapping("/validate1")
	public String validateSession4Post(HttpSession session, ModelMap map, @RequestParam String url, @Value("${msg}") String msg) {
		return validateSession1(session, map, url,msg);

	}

} // End of controller
