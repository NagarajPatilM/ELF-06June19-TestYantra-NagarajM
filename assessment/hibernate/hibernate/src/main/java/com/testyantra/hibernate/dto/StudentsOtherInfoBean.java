package com.testyantra.hibernate.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Data
@Entity
@Table(name="student_otherinfo")
public class StudentsOtherInfoBean implements Serializable{
	
	@Id
	@Column(name="rollNum")
	private int rollNum;
	private String fatherName;
	private String motherName;
	private String religion;
	private String nationality;
	
}
