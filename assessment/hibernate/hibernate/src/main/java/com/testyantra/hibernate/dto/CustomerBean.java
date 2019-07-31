package com.testyantra.hibernate.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Data
@Entity
@Table(name = "customer")
public class CustomerBean implements Serializable{
	
	@Id
	@Column(name = "id")
	private int id;
	@Id
	@Column(name = "contactNumber")
	private long contactNo;
	private String firstName;
	private String lastName;

	private String city;
	private String state;
	private String address;

}
