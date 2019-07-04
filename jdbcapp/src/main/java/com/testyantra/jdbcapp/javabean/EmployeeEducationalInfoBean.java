package com.testyantra.jdbcapp.javabean;

import java.util.Date;

import lombok.Data;

@Data
public class EmployeeEducationalInfoBean {
	int id;
	String educationType;
	String degreeType;
	String branch;
	String collegeName;
	String university;
	Date yop;
	String percentage;
	String location;

}
