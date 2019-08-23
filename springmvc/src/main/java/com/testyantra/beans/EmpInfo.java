package com.testyantra.beans;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class EmpInfo {
	private String name;
	private double salary;
	private DepartmentBean departmentBean;
	
	
	public void init() {
		System.out.println("init phase");
	}
	
	public void destroy() {
		System.out.println("destroy phase");
	}
}
