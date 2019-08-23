package com.testyantra.spring.dto;

import com.testyantra.spring.dao.EmployeeInfoBean;

public class EmployeeLogics {

	public static String getName() {
		return new EmployeeInfoBean().getEmpName();
	}
}
