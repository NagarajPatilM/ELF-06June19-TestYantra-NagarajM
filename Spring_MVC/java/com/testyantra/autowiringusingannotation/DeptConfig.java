package com.testyantra.autowiringusingannotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class DeptConfig {

	@Bean(name="HR")
	public DepartmentBean getDepartmentBeanHR() {
		DepartmentBean departmentBean = new DepartmentBean();
		departmentBean.setDeptId(101);
		departmentBean.setDeptName("HR");
		return departmentBean;
	}
	
	@Bean(name="DEV")
	public DepartmentBean getDepartmentBeanDEV() {
		DepartmentBean departmentBean = new DepartmentBean();
		departmentBean.setDeptId(102);
		departmentBean.setDeptName("DEV");
		return departmentBean;
	}
	
	@Bean(name="RESEARCH")
	public DepartmentBean getDepartmentBean() {
		DepartmentBean departmentBean = new DepartmentBean();
		departmentBean.setDeptId(103);
		departmentBean.setDeptName("research");
		return departmentBean;
	}

}
