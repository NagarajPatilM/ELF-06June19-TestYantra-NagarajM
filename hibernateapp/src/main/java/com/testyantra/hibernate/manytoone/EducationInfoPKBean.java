package com.testyantra.hibernate.manytoone;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.testyantra.hibernateapp.onetoone.EmployeeInfoBean;

import lombok.Data;
@Embeddable
@Data
public class EducationInfoPKBean implements Serializable{
	
	@ManyToOne
	@JoinColumn(name="id")
	private EmployeeInfoBean infoBean;
	@Column(name="education_type")
	private String education_type;
	
}
