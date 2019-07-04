package com.testyantra.jdbcapp.javabean;

import lombok.Data;

@Data
public class EmployeeOtherInfoBean {
	private int id;
	private String pan;
	private Boolean ismarried;
	private String bloodGrp;
	private Boolean isChallenged;
	private long emergencContactNo;
	private String emergencyContactName;
	private String nationality;
	private String religion;
	private String fatherNm;
	private String motherNm;
	private String spouseNm;
	private String passport;
	private long aadhaar;

}
