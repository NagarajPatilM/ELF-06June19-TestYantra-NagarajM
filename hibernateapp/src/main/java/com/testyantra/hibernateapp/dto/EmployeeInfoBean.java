package com.testyantra.hibernateapp.dto;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="emp_info")
public class EmployeeInfoBean implements Serializable{

@Id
@Column(name="id")
private int id;
@Column(name="name")
private String name;
@Column(name="age")
private int age;
@Column(name="gender")
private String gender;
@Column(name="salary")
private double salary;
@Column(name="phone")
private long phoneNo;
@Column(name="account")
private long accountNo;
@Column(name="dob")
private Date dob;
@Column(name="designation")
private String designation;
@Column(name="email")
private String email;
@Column(name="hiredate")
private Date hiredate;
@Column(name="dept_id")
private int deptId;
@Column(name="mngr_id")
private int mngrId;


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public long getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}
	public long getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(long accountNo) {
		this.accountNo = accountNo;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getHiredate() {
		return hiredate;
	}
	public void setHiredate(Date hiredate) {
		this.hiredate = hiredate;
	}
	public int getDeptId() {
		return deptId;
	}
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	public int getMngrId() {
		return mngrId;
	}
	public void setMngrId(int mngrId) {
		this.mngrId = mngrId;
	}
	

}
