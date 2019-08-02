package com.tetstyantra.mywebapp.servlets;

import java.io.IOException;
import java.io.PipedWriter;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class IncludeServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher dispatcher = null;
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("111111111111111111");

		dispatcher = request.getRequestDispatcher("index.html");
		dispatcher.include(request, response);

		out.println("2222222222222");

	}

}
