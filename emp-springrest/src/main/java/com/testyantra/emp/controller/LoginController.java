package com.testyantra.emp.controller;

import static com.testyantra.emp.common.EMPConstants.DB_INTERACTION_TYPE;
import static com.testyantra.emp.common.EMPConstants.PROPERTY_FILENAME;
import static com.testyantra.emp.common.EMPConstants.VIEW_HOMEPAGE;
import static com.testyantra.emp.common.EMPConstants.VIEW_LOGINPAGE;

import java.util.Arrays;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.http.MediaType;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.testyantra.emp.dao.EmployeeDao;
import com.testyantra.emp.dto.EmployeeInfoBean;
import com.testyantra.emp.dto.EmployeeResponse;

import net.bytebuddy.asm.Advice.Return;

@RestController
@RequestMapping("/login")
@PropertySource(PROPERTY_FILENAME)
public class LoginController {

	@Autowired
	@Qualifier(DB_INTERACTION_TYPE)
	EmployeeDao dao;

	@PostMapping(value = "/authenticate", produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse login(int id, String password, HttpServletRequest request) {
		EmployeeInfoBean bean = dao.getEmployeeInfo(id);
		EmployeeResponse response = new EmployeeResponse();
		if (bean != null && bean.getPassword().equals(password)) {
			response.setStatusCode(201);
			response.setMessage("successfull");
			response.setBean(Arrays.asList(bean));
			request.getSession().setAttribute("bean", bean);
		} else {
			response.setStatusCode(501);
			response.setMessage("unsuccessfull");
			response.setDescription("login unsuccessfull");
		}
		return response;
	} // End of authenticate()

	@GetMapping(value = "/logout", produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse tologOut(HttpSession httpSession) {
		httpSession.invalidate();
		EmployeeResponse response = new EmployeeResponse();
		response.setStatusCode(201);
		response.setMessage("logout successfully");
		response.setDescription("logged out successfully");
		return response;

	} // End of logout( )

	@GetMapping(value = "/readCookie")
	public EmployeeResponse readCookie(@CookieValue(name = "JSESSIONID") String sessionId) {
		EmployeeResponse response = new EmployeeResponse();
		response.setStatusCode(201);
		response.setMessage("logged out successfully");
		response.setDescription("JSESSIONID" + sessionId);
		return response;
	 } // End of readCookie( )


} // End of controller
