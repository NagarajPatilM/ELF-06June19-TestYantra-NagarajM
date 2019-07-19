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

@WebServlet("/logout")
public class LogoutServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
			                        throws ServletException, IOException {
		
		//Invalidate the session
		HttpSession session=req.getSession(false);
		if(session!=null) {
			session.invalidate();
		}
		PrintWriter out=resp.getWriter();
		out.print("<html><span style='color:green'>thanhs for visiting!!</span></html>");
		RequestDispatcher dispatcher=req.getRequestDispatcher("employeelogin.html");
		dispatcher.include(req, resp);
	}//End of doget( )

}//End of class
