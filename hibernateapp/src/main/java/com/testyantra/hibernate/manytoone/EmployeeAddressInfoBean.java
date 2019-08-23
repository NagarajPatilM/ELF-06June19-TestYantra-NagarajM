package com.testyantra.hibernate.manytoone;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
@Entity
@Table(name="employee_addressinfo")
public class EmployeeAddressInfoBean implements Serializable{
	/*
	 * @ManyToOne
	 * 
	 * @JoinColumn(name="id") private EmployeeInfoBean infoBean;
	 */
	@EmbeddedId
	private EmployeeAddressPKBean addtessPK;
	
	@Column(name="address1")
	private String address1;
	@Column(name="address2")
	private String address2;
	@Column(name="landmark")
	private String landmark;
	@Column(name="city")
	private String city;
	@Column(name="district")
	private String district;
	@Column(name="state")
	private String state;
	@Column(name="country")
	private String country;
	@Column(name="pincode")
	private String pincode;
}
