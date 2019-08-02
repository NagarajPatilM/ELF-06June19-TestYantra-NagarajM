package com.testyantra.emp.dao;

public class EmployeeDAOFactoryOld { 
	
	
	private EmployeeDAOFactoryOld() {}
	
	public static EmployeeDAO getInstance(String dbInteractionType) {
		EmployeeDAO dao=null;
		if(dbInteractionType.equalsIgnoreCase("jdbc")) {
			 dao=new EmployeeDAOJDBCImpl();
		 }else if(dbInteractionType.equalsIgnoreCase("hibernate")) {
			 dao=new EmployeeDAOHibernateImplTwo();
		 }
		return dao;
	}
}
