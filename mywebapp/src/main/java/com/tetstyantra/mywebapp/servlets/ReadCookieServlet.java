package com.tetstyantra.mywebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/readcookie")
public class ReadCookieServlet extends HttpServlet{
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp)
		                          throws ServletException, IOException {
	//Get the cookies fronm the request
	Cookie[] receivedCookies=req.getCookies();
	
	PrintWriter out=resp.getWriter();
	
	if(receivedCookies ==null) {
		out.print("cookies are not present!!");
		
	}else {
		out.print("cookies are present...");
		
		for(Cookie recCookies: receivedCookies) {
			out.print("cookie name "+recCookies.getName());
			out.print("cookie value "+recCookies.getValue());
		}
	}
}
}
