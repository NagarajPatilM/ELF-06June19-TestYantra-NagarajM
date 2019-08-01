package com.testyantra.emp.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.testyantra.emp.bean.EmployeeInfoBean;
import com.testyantra.emp.dao.EmployeeDAO;
import com.testyantra.emp.dao.EmployeeDAOHibernateImplTwo;

@WebServlet("/search")
public class SearchServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			                         throws ServletException, IOException {
		PrintWriter out=resp.getWriter();
		
		//validate the session
		HttpSession session=req.getSession(false);
		if(session==null) {
			//Invalid session; Generate login page with error info
			out.print("<h1><span style='color:red'>Invalid session,please login</h1>");
			out.print("<BR><BR>");
			RequestDispatcher dispatcher=req.getRequestDispatcher("employeelogin.html");
			dispatcher.include(req, resp);
		}else {
			//valid session; Generate proper response

			int id = Integer.parseInt(req.getParameter("id"));
			EmployeeDAO dao = new EmployeeDAOHibernateImplTwo();
			ArrayList<EmployeeInfoBean> arrId = dao.getEmployeeIds(id);
			
			for (EmployeeInfoBean employeeInfoBean : arrId) {
				
			}
			if(arrId==null) {
				out.print("<html>");
				out.print("<body>");
				out.print("<h1> <span style=\"color:red\">Employee Not Found</span></h1>");
				out.print("</body>");
				out.print("</html>");
			}else {
				out.print("<!DOCTYPE html>                                                                        ") ;
				out.print("<html>                                                                                 ") ;
				out.print("<head>                                                                                 ") ;
				out.print("<meta charset=\"ISO-8859-1\">                                                            ") ;
				out.print("<title>Insert title here</title>                                                       ") ;
				out.print("<link rel=\"stylesheet\"                                                                 ") ;
				out.print("	href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\"       ") ;
				out.print("	integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\"   ") ;
				out.print("	crossorigin=\"anonymous\">                                                              ") ;
				out.print("<script                                                                                ") ;
				out.print("	src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\" ") ;
				out.print("	></script>                                                     ") ;
				out.print("</head>                                                                                ") ;
				out.print("<body>                                                                                 ") ;
				out.print("<nav class=\"navbar navbar-expand-lg navbar-light bg-light\">                            ") ;
				out.print("  <a class=\"navbar-brand\" href=\"#\">EMP</a>                                             ") ;
				out.print("  <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navrSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">");
				out.print("    <span class=\"navbar-toggler-icon\"></span>                                          ") ;
				out.print("  </button>                                                                            ") ;
				out.print("                                                                                       ") ;
				out.print("                                                                                       ") ;
				out.print("    <form class=\"form-inline my-2 my-lg-0\" >                                            ") ;
				out.print("      <input class=\"form-control mr-sm-2\" type=\"search\" placeholder=\"Search\" name=\"id\" aria-labelSearch\">");
				out.print("      <button class=\"btn btn-outline-success my-2 my-sm-0\" type=\"submit\">Search</button") ;
				out.print("    </form>                                                                            ") ;
				
				out.print("    <div><a class=\"ml-auto\" href=\"logout\">Logout</a>   </div>                                          ") ;
				out.print("</nav>                                                                                 ") ;
				out.print("                                                                                       ") ;
				out.print("<table class=\"table table-borderless\">  ");
				out.print("  <thead>                               ");
				out.print("    <tr>                                ");
				out.print("      <th >Employee Id</th>  ");
				out.print("      <th >Name</th>         ");
				out.print("    </tr>                               ");
				out.print("  </thead>                              ");
				out.print("  <tbody>                               ");
				
				for (EmployeeInfoBean employeeInfoBean : arrId) {
				out.print("    <tr>                                ");
				out.print("      <td>"+employeeInfoBean.getId()+"</td>                     ");
				out.print("      <td>"+employeeInfoBean.getEmpName()+"</td>                     ");
				out.print("    </tr>                               ");
				}
				
				out.print("  </tbody>                              ");
				out.print("</table>                                ");
				
				out.print("</body>                                                                                ") ;
				out.print("</html>                                                                                ") ;
			}
			
		}
		
	}
} //End of servlet