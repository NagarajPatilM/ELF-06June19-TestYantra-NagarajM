package com.testyantra.emp.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data

@Entity
@Table(name = "employee_otherinfo")
public class EmployeeOtherInfoBean implements Serializable {
	@Id
	@Column(name = "id")
	private int id;
	@Column(name = "pan")
	private String pan;
	@Column(name = "is_married")
	
	private Boolean ismarried;
	@Column(name = "blood_group")
	private String bloodGrp;
	@Column(name = "is_challenged")
	private Boolean isChallenged;
	@Column(name = "emergency_contno")
	private long emergencContactNo;
	@Column(name = "emergency_conname")
	private String emergencyContactName;
	@Column(name = "nationality")
	private String nationality;
	@Column(name = "religion")
	private String religion;
	@Column(name = "father_name")
	private String fatherNm;
	@Column(name = "mother_name")
	private String motherNm;
	@Column(name = "spouse_name")
	private String spouseNm;
	@Column(name = "passport")
	private String passport;
	@Column(name = "aadhaar")
	private long aadhaar;
	

}
