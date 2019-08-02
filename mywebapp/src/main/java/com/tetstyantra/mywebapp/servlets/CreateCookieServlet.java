package com.tetstyantra.mywebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/createcookie")
public class CreateCookieServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		
		// create a cookie
		Cookie myNamecookie = new Cookie("myName", "nag");
		Cookie myAgeCookie=new Cookie("age","22");
		myNamecookie.setMaxAge(7*24*365);

		// send the above cookie to browser
		resp.addCookie(myNamecookie);
		resp.addCookie(myAgeCookie);

		PrintWriter out = resp.getWriter();
		out.print("cookie created");
		
	}// End of doGet
}// End of class
