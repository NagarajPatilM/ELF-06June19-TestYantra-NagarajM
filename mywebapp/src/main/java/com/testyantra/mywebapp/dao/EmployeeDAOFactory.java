package com.testyantra.mywebapp.dao;

public class EmployeeDAOFactory { 
	
	private static String dbInteractionType="hibernate";
	
	private EmployeeDAOFactory() {}
	
	public static EmployeeDAO getInstance() {
		EmployeeDAO dao=null;
		if(dbInteractionType.equalsIgnoreCase("jdbc")) {
			 dao=new EmployeeDAOJDBCImpl();
		 }else if(dbInteractionType.equalsIgnoreCase("hibernate")) {
			 dao=new EmployeeDAOHibernateImplTwo();
		 }
		return dao;
	}
}
