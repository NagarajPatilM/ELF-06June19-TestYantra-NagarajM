package com.testyantra.designpatterns.beans;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "emp_info")
public class EmployeeInfoBean {

	@Id
	@Column(name = "id")
	private int id;
	@Column(name = "name")
	private String name;
	@Column(name = "age")
	private int age;
	@Column(name = "gender")
	private String gender;
	@Column(name = "salary")
	private double salary;
	@Column(name = "phone")
	private long phoneNo;
	@Column(name = "account")
	private long accountNo;
	@Column(name = "dob")
	private Date dob;
	@Column(name = "designation")
	private String designation;
	@Column(name = "email")
	private String email;
	@Column(name = "hiredate")
	private Date hiredate;
	@Column(name = "dept_id")
	private int departmentId;
	@Column(name = "mngr_id")
	private int managerId;

}
