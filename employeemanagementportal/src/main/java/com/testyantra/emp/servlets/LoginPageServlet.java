/*
 * This page shows the property of GMAIL web application
     use case:- After  successfull login to the GMAIL and exit without Logout
             and after closing the Browser
             and opening the Browser after some days
             we will get the Home response
*/ 
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
	
         // validate the session
		HttpSession session = req.getSession(false);
		if (session == null) {
			PrintWriter out=resp.getWriter();
			out.println("<html><body><h1>invlaid session!!</h1></body></html>");
			//Invalid session. generate login page
			RequestDispatcher dispatcher = req.getRequestDispatcher("employeelogin.html");
			dispatcher.include(req, resp);

		} else {
			//valid session,generate proper response
			String path = "/login";
			RequestDispatcher dispatcher = req.getRequestDispatcher(path);
			dispatcher.forward(req, resp);

		}

	}// End of do get()

}// End of class
