package com.testyantra.emp.dao;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class EmployeeDAOFactory {
	
	@Bean(name="hibernate")
	public EmployeeDAO getObject() {
		return new EmployeeDAOHibernateImplTwo();
	}

	@Bean(name="jdbc")
	public EmployeeDAO getObject1() {
		return new EmployeeDAOJDBCImpl();
	}

}
