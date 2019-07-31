package com.testyantra.hibernate.dto;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="student_info")
public class StudentsInfoBean implements Serializable{
	
	@OneToOne(cascade=CascadeType.ALL)
	@PrimaryKeyJoinColumn
	private StudentsOtherInfoBean studentOtherInfo;
	
	@Id
	@Column(name="rollNum")
	private int rollNo;
	private String name;
	private String gender;
	private int age;
	private long mobileNo;
	private String emailId;
	

}
