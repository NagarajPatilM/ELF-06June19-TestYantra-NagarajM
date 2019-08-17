package com.testyantra.emp.springboot.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

import lombok.Data;

@Entity
@Table(name = "department_info")
//@XmlRootElement(name="department-info")
@JsonRootName(value = "department-info")
@XmlAccessorType(XmlAccessType.FIELD)
public class DepartmentInfoBean implements Serializable {

	@Id
	@Column(name = "dept_id")
	// @XmlElement(name="department-id")
	@JsonProperty(value = "department-id")
	private int departmentId;

	@Column(name = "dept_name")
//	@XmlElement(name="department-name")
	@JsonProperty(value = "department-name")
	private String departmentName;

	public int getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

}
