package com.testyantra.autowiringusingannotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import lombok.extern.java.Log;
@Log
public class EmployeeBeanTest {
	
	public static void main(String[] args) {
		ApplicationContext applicationContext=new AnnotationConfigApplicationContext(EmpConfig.class);
		EmpInfoBean empInfo=applicationContext.getBean(EmpInfoBean.class);
		
		log.info("Employee name : "+empInfo.getName());
		log.info("Employee salary : "+empInfo.getSalary());
		
		DepartmentBean deptBean=empInfo.getDepartmentBean();
		
		//DepartmentBean deptBean=applicationContext.getBean(DepartmentBean.class);
		
		log.info("Dept Id : "+deptBean.getDeptId());
		log.info("Dept Name : "+deptBean.getDeptName());
	}

}
