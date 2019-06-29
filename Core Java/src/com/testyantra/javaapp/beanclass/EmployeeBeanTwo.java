package com.testyantra.javaapp.beanclass;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

@Data

public class EmployeeBeanTwo implements Serializable {

	private int id;
	private String name;
	private String department;
	private double salary;
	private int age;
	private Date joindate;
	private String gender;

}
