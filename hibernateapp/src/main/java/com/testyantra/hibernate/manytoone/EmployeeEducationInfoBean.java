package com.testyantra.hibernate.manytoone;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;
@Data
@Entity
@Table(name="employee_educationinfo")
public class EmployeeEducationInfoBean implements Serializable {
	
	@EmbeddedId
	private EducationInfoPKBean educationInfoPK;
	
	@Column(name="college_nm")
	private String collegeName;
	@Column(name="university")
	private String university;
	@Column(name="location")
	private String location;
	@Column(name="branch")
	private String branch;
	@Column(name="degree_type")
	private String degreeType;
	@Column(name="percentage")
	private String percentage;
	@Column(name="yop")
	private int yop;
	
}
