package com.testyantra.emp.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;



import lombok.Data;

@Data
@Entity
@Table(name = "employee_otherinfo")
public class EmployeeOtherInfoBean implements Serializable {
	@Id
	@OneToOne
	@JoinColumn(name = "id")
//	@PrimaryKeyJoinColumn(name="id")
	private EmployeeInfoBean infoBean;
	@Column(name = "pan")
	private String pan;
	@Column(name = "is_married")
	private boolean isMarried;
	//@Column(name = "blood_group")
	//private String bloodGroup;
	@Column(name = "is_challenged")
	private boolean isChallenged;
	@Column(name = "emergency_contactno")
	private long emergencyCNM;
	@Column(name = "emergency_conname")
	private String emergencyCP;
	@Column(name = "nationality")
	private String nationality;
	@Column(name = "religion")
	private String religion;
	@Column(name = "father_name")
	private String fatherNM;
	@Column(name = "mother_name")
	private String motherNM;
	@Column(name = "spouse_name")
	private String spouseNM;
	@Column(name = "passport")
	private String passport;
	@Column(name = "aadhaar")
	private long adhar;

}
