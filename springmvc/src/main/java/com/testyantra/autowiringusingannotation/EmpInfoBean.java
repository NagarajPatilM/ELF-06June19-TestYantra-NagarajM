package com.testyantra.autowiringusingannotation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class EmpInfoBean {
	
	private String name;
	private double salary;
	
	@Autowired
	@Qualifier("HR")
	private DepartmentBean departmentBean;
	
	@PostConstruct
	public void init() {
		System.out.println("init phase");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("destroy phase");
	}
}
