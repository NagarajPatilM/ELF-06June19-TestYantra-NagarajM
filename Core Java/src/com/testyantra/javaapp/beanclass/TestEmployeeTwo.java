package com.testyantra.javaapp.beanclass;

import java.util.logging.Logger;

public class TestEmployeeTwo {
	
	private static Logger logger = Logger.getLogger("INDIA");

	public static void main(String[] args) {

		// without Lombok
		EmployeeBean e1 = new EmployeeBean();
		logger.info("without lombok===>" + e1.toString());
		
         //with lombok
		EmployeeBeanTwo e2 = new EmployeeBeanTwo();
		logger.info("with lombok===>" + e2.toString());

	}

}
