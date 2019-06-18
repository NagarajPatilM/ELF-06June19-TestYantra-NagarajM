package com.testyantra.jvaapp.beanclass;

import java.io.Serializable;
import java.util.Date;

public class EmployeeBean implements Serializable{
	
	

	private int id;
	private String name;
	private String department;
	private double salary;
	private int age;
	private Date joindate;
	private String gender;

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

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Date getJoindate() {
		return joindate;
	}

	public void setJoindate(Date joindate) {
		this.joindate = joindate;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	@Override
	public String toString() {
		return "EmployeeBean [id=" + id + ", name=" + name + ", department=" + department + ", salary=" + salary
				+ ", age=" + age + ", joindate=" + joindate + ", gender=" + gender + "]";
	}

}
