package com.testyantra.emp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.testyantra.emp.bean.EmployeeInfoBean;
import com.testyantra.emp.dao.EmployeeDAO;
import com.testyantra.emp.dao.EmployeeDAOFactory;
import com.testyantra.emp.dao.EmployeeDAOHibernateImplTwo;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			                                   throws ServletException, IOException {

		int id = Integer.parseInt(request.getParameter("id"));
		EmployeeDAO dao = EmployeeDAOFactory.getInstance();
		EmployeeInfoBean bean = dao.getEmployeeInfo(id);

		// String name=request.getParameter("name");
		String password = request.getParameter("password");

		// valid credentials; create a session
		if (bean != null && password.equals(bean.getPassword())) {

			HttpSession session = request.getSession(true);

			String url = "./welcome";
			request.setAttribute("bean", bean);
			RequestDispatcher dispatcher = request.getRequestDispatcher(url);
			dispatcher.forward(request, response);

		} else {
			PrintWriter out = response.getWriter();

			String path = "employeelogin.html";
			out.println("invalid id");
			/*
			 * RequestDispatcher dispatcher=request.getRequestDispatcher(path);
			 * dispatcher.include(request,response);
			 */
			response.sendRedirect(path);
		}

	}

}//End of servlet
