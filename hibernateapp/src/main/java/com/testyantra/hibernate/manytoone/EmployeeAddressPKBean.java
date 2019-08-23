package com.testyantra.hibernate.manytoone;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.testyantra.hibernateapp.onetoone.EmployeeInfoBean;

import lombok.Data;
@Data
@Embeddable
public class EmployeeAddressPKBean implements Serializable {
	
	@ManyToOne
	@JoinColumn(name="id")
	private EmployeeInfoBean infoBean;
	@Column(name="address_type")
	private String addressType;

}
