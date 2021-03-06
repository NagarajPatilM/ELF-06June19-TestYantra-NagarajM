package com.tetstyantra.mywebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.testyantra.mywebapp.beans.EmployeeInfoBean;
import com.testyantra.mywebapp.dao.EmployeeDAO;
import com.testyantra.mywebapp.dao.EmployeeDAOFactory;

@WebServlet("/empsearch")
public class EmployeeSearchServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String idVal = req.getParameter("id");
		// Interact with DB and get the employee info
		EmployeeDAO dao = EmployeeDAOFactory.getInstance();
		EmployeeInfoBean bean = dao.getEmployeeInfo(idVal);

		// Send response to browser
		PrintWriter out = resp.getWriter();
		if (bean == null) {
			out.print("<html>");
			out.print("<body>");
			out.print("<h1> <span style=\"color:red\">Employee Not Found</span></h1>");
			out.print("</body>");
			out.print("</html>");
		} else {
			out.print("<html>");
			out.print("<body>");
			out.print("<h1> <span style=\"color:green\">Employee Found</span></h1>");
			out.print("<br>");
			out.print("<br> ID   ======>" + bean.getId());
			out.print("<br> Name  ====>" + bean.getEmpName());
			out.print("<br> Age  ====>" + bean.getAge());
			out.print("<br> Phone  ====>" + bean.getPhone());
			out.print("<br> Gender  ====>" + bean.getGender());
			out.print("<br> Salary  ====>" + bean.getSalary());
			out.print("<br> Joining Date  ====>" + bean.getJoiningDate());
			out.print("<br> Account number  ====>" + bean.getAccountNumber());
			out.print("<br>Email  ====>" + bean.getEmail());
			out.print("<br> Designation  ====>" + bean.getDesignation());
			out.print("<br> DOB  ====>" + bean.getDob());
			out.print("<br> DEPT_NO  ====>" + bean.getDepartmentId());
			out.print("<br> MNGR ID  ====>" + bean.getManagerId());

			out.print("</body>");
			out.print("</html>");
		}
	}
}
