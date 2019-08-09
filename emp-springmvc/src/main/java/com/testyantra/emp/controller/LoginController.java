package com.testyantra.emp.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import static com.testyantra.emp.common.EMPConstants.PROP_FILENAME;
import static com.testyantra.emp.common.EMPConstants.VIEW_HOMEPAGE;
import static com.testyantra.emp.common.EMPConstants.VIEW_LOGINPAGE;
import static com.testyantra.emp.common.EMPConstants.DB_INTERACTIONTYPE;

import com.testyantra.emp.dao.EmployeeDAO;
import com.testyantra.empspringmvc.bean.EmployeeInfoBean;

@Controller
@RequestMapping("/login")
@PropertySource(PROP_FILENAME)
public class LoginController {

	@Autowired
	@Qualifier(DB_INTERACTIONTYPE)
	EmployeeDAO dao;

	@GetMapping("/loginpage")
	public String getLoginPage() {
		return VIEW_LOGINPAGE;
	}  //End of login( )

	@PostMapping("/authenticate")
	public String getHomePage(int id, String password, HttpServletRequest request, 
			                                       @Value("${fail}") String errMsg,
			                                       @Value("${dbInteractionType}") String dbInteractionType) {
		
		//EmployeeInfoBean bean = EmployeeDAOFactoryOld.getInstance(dbInteractionType).getEmployeeInfo(id); 
	// old way of creating factory object without Spring 
		
          EmployeeInfoBean bean=dao.getEmployeeInfo(id); //Spring way
		if (bean != null && bean.getPassword().equals(password)) {
			HttpSession httpSession = request.getSession(true);
			httpSession.setAttribute("bean", bean);
			return VIEW_HOMEPAGE;

		} else {
			request.setAttribute("msg", errMsg);
			return VIEW_LOGINPAGE;
		}
	} //End of homepage( )
	
	@GetMapping("/logout")
	public String tologOut(HttpSession httpSession, ModelMap modelMap, @ Value ("${logout}") String msg) {
			httpSession.invalidate();
			modelMap.addAttribute("msg", msg);
			return VIEW_LOGINPAGE;
		
	} //End of logout( )
	
} // End of controller
