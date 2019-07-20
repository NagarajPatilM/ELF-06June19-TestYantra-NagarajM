package com.testyantra.emp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/loginpage")
public class LoginPageServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			                        throws ServletException, IOException {
		
		Cookie dummyCookie=new Cookie("dummyCookie","checkCookiesEnabled");
		resp.addCookie(dummyCookie);
	
		
		PrintWriter out=resp.getWriter();
		out.print("hi");
		
         // validate the session
		HttpSession session = req.getSession(true);
		if (session == null) {
			//Invalid session. generate login page
			RequestDispatcher dispatcher = req.getRequestDispatcher("employeelogin.html");
			dispatcher.include(req, resp);

		} else {
			//valid session,generate proper response
			String path = "./welcome";
			RequestDispatcher dispatcher = req.getRequestDispatcher(path);
			dispatcher.forward(req, resp);

		}

	}// End of do get()

}// End of class
