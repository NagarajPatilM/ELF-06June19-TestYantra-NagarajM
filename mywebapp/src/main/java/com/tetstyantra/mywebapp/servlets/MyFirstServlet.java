package com.tetstyantra.mywebapp.servlets;

import java.io.IOException;

import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import lombok.extern.java.Log;
@Log
@WebServlet("/firstservlet")
public class MyFirstServlet extends HttpServlet{
	
	public MyFirstServlet()	{
	 log.info("Inside MyFirstServlet");
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
			                       throws ServletException, IOException {
		log.info("HTTP Method :"+req.getMethod());
		log.info("Protocol : "+req.getProtocol());
		log.info("Request URL :"+req.getRequestURL());
		
		
		String currentDate=new Date().toString();
		
		//Get Query String Information
		String fnameValue=req.getParameter("fname");
		String lnameValue=req.getParameter("lname");
		String htmlResponse="<!DOCTYPE html>"+
				"<html>"+
				"<head>"+
				"<meta charset=\"ISO-8859-1\">"+
				"<title>First HTML</title>"+
				"</head>"+
				"<body>"+
				"      <h1>Current date and time :"+
				"      <br>"+
				"      <span style=\"color:red\">"+currentDate+"</span>"+
				"		<br>"+
				"		First Name :"+fnameValue+
				"		<br>"+	
				"		Last Name :"+lnameValue+		
				"		</h1>"+
				"</body>"+
				"</html>";
		
		//send the Above HTML response to browser
		//resp.setContentType("text/html");
		//resp.setHeader("Refresh", "1");
		PrintWriter out=resp.getWriter();
		out.print(htmlResponse);
		out.println("<body>"+"<h1>gold");
	}//End of doGet
}//End of class
