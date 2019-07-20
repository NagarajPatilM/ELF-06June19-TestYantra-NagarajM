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
		
		//check cookies are disabled or not
		if(request.getCookies()==null) {
			request.getRequestDispatcher("cookiesdisabled.html").include(request, response);
			return;
		}

		int id = Integer.parseInt(request.getParameter("id"));
		EmployeeDAO dao = EmployeeDAOFactory.getInstance();
		EmployeeInfoBean bean = dao.getEmployeeInfo(id);

		String password = request.getParameter("password");

		// valid credentials; create a session
		if (bean != null && password.equals(bean.getPassword())) {

			HttpSession session = request.getSession(true);
			session.setAttribute("data", bean);

			String url = "./welcome";
			request.setAttribute("bean", bean);
			RequestDispatcher dispatcher = request.getRequestDispatcher(url);
			dispatcher.forward(request, response);

		} else {
			PrintWriter out = response.getWriter();
			String path = "employeelogin.html";
			out.println("<html><span style='color:red'><h1>invalid credentials!!</h1><span></html>");
			response.setContentType("text/html");

			RequestDispatcher dispatcher = request.getRequestDispatcher(path);
			dispatcher.include(request, response);

		}

	}

}// End of servlet
