package com.testyantra.emp.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

import lombok.Data;


@SuppressWarnings("serial")
@Embeddable
//@XmlRootElement(name = "employee-experience-pk")
@JsonRootName(value = "employee-experience-pk")
@XmlAccessorType(XmlAccessType.FIELD)
public class EmployeeExperiencePKBean implements Serializable{

	@JoinColumn(name = "id")
	@ManyToOne
	//@XmlTransient
	@JsonIgnore
	private EmployeeInfoBean infoBean;
	
	@Column(name = "company_name")
	//@XmlElement(name="company-name")
	@JsonProperty(value = "company-name")
	private String companyName;
	
	public EmployeeInfoBean getInfoBean() {
		return infoBean;
	}
	public void setInfoBean(EmployeeInfoBean infoBean) {
		this.infoBean = infoBean;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	
}
