package com.testyantra.jdbcapp.javabean;

import java.util.Date;

import lombok.Data;

@Data
public class ExperienceInfoBean {

	int id;
	private String companyName;
	private String designation;
	private Date joiningDate;
	private Date leavingDate;

}
