<%@page import="com.testyantra.emp.bean.UserBean" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>

<% UserBean userBean=(UserBean) request.getAttribute("userbean"); %>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
   userId : <%=userBean.getUserId()%>
   <BR>
   password : <%=userBean.getPassword()%>
</body>
</html>