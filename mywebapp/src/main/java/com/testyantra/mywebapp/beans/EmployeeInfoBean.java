package com.testyantra.mywebapp.beans;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Data
@Entity
@Table(name="employee_info")
public class EmployeeInfoBean implements Serializable{
	@Id
	@Column(name="ID")
	private int id;
	@Column(name="Name")
	private String empName;
	@Column(name="AGE")
	private int age;
	@Column(name="GENDER")
	private String gender;
	@Column(name="SALARY")
	private double salary;
	@Column(name="PHONE")
	private long phone;
	@Column(name="JOINING_DATE")
	private Date joiningDate;
	@Column(name="ACCOUNT_NUMBER")
	private long accountNumber;
	@Column(name="EMAIL_ID")
	private String email;
	@Column(name="DESGINATION")
	private String designation;
	@Column(name="DOB")
	private Date dob;
	@Column(name="DEPT_ID")
	private int departmentId;
	@Column(name="MNGR_ID")
	private int managerId;
	
}
