package com.testyantra.emp.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.testyantra.emp.bean.EmployeeInfoBean;
import com.testyantra.emp.bean.EmployeeOtherInfoBean;
import com.testyantra.emp.dao.EmployeeDAO;
import com.testyantra.emp.dao.EmployeeDAOFactory;

@WebServlet("/create")
public class CreateServlet extends HttpServlet{
	
	@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
		                         throws ServletException, IOException {
		PrintWriter out=resp.getWriter();
		
		EmployeeInfoBean bean=new EmployeeInfoBean();
		SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");
		
		bean.setId(Integer.parseInt(req.getParameter("id")));
		bean.setEmpName(req.getParameter("name"));
	System.out.println(bean.getAge());
		bean.setAge(Integer.parseInt(req.getParameter("age")));
		bean.setAccountNumber(Long.parseLong(req.getParameter("accountno")));
		bean.setGender(req.getParameter("gender"));
		bean.setSalary(Double.parseDouble(req.getParameter("salary")));
		try {
			bean.setDob(dateFormat.parse(req.getParameter("dob")));
			bean.setJoiningDate(dateFormat.parse(req.getParameter("joiningdate")));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		bean.setDesignation(req.getParameter("designation"));
		bean.setEmail(req.getParameter("email"));
		bean.setPhone(Long.parseLong(req.getParameter("phoneno")));
		bean.setDepartmentId(Integer.parseInt(req.getParameter("deptid")));
		bean.setManagerId(Integer.parseInt(req.getParameter("mngrid")));
		bean.setPassword(req.getParameter("password"));
		
		//getting and setting values for EmployeeOtherInfoBean
		EmployeeOtherInfoBean otherInfoBean=new EmployeeOtherInfoBean();
		otherInfoBean.setAadhaar(Long.parseLong(req.getParameter("aadhaar")));
		otherInfoBean.setBloodGrp(req.getParameter("bloodgp"));
		otherInfoBean.setEmergencContactNo(Long.parseLong(req.getParameter("emgconname")));
		
		
		EmployeeDAO dao=EmployeeDAOFactory.getInstance();
		 out=resp.getWriter();
		if(dao.createEmployeeInfo(bean)) {
			out.print("<html>");
			out.print("<body>");
			out.print("<h1> <span style=\"color:green\">Employee created successfully</span></h1>");
			out.print("</body>");
			out.print("</html>");
		}else {
			out.print("<html>");
			out.print("<body>");
			out.print("<h1> <span style=\"color:red\">Employee Not created</span></h1>");
			out.print("</body>");
			out.print("</html>");
		}
	}
}
