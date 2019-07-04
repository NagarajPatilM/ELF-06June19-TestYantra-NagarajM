package com.testyantra.jdbcapp.javabean;

import java.util.Date;

import lombok.Data;
@Data
public class EmployeeInfoBean {
	private int id;
	private String name;
	private int age;
	private String gender;
	private double salary;
	private long phoneNo;
	private long accountNo;
	private Date dob;
	private String designation;
	private String email;
	private Date hiredate;
	private int deptId;
	private int mngrId;

}
