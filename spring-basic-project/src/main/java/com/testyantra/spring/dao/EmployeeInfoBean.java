package com.testyantra.spring.dao;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Data
public class EmployeeInfoBean implements Serializable{
	/*
	 * @OneToOne(cascade=CascadeType.ALL)
	 * 
	 * @PrimaryKeyJoinColumn private EmployeeOtherInfoBean otherInfo;
	 */
	
	private int id;
	private String empName;
	private int age;
	private String gender;
	private double salary;
	private long phone;
	private Date joiningDate;
	private long accountNumber;
	private String email;
	private String designation;
	private Date dob;
	private int departmentId;
	private int managerId;
	private String password;
	
}
