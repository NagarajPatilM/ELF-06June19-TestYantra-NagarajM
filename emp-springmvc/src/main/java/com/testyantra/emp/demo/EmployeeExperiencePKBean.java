package com.testyantra.emp.demo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;



import lombok.Data;


@SuppressWarnings("serial")
@Data
@Embeddable
public class EmployeeExperiencePKBean implements Serializable{

	@JoinColumn(name = "id")
	@ManyToOne
	private EmployeeInfoBeanold infoBean;
	@Column(name = "company_name")
	private String companyName;
}
