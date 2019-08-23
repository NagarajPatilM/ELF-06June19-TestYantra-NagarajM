package com.testyantra.libmgmt.dto;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

import lombok.Data;

@SuppressWarnings("serial")
@Data
@Entity
@Table(name="user_details")
@JsonRootName(value="users")
public class UserBean implements Serializable{
	@Id
	//@GeneratedValue(strategy=GenerationType.AUTO)
	@JsonProperty(value="user-id")
	@Column(name="user_id")
	private int userId;
	private String password;
	@Column(name="first_name")
	private String firstName;
	@Column(name="last_name")
	private String lastName;
	@Column(name="email",unique=true)
	private String email;
	@Column(name="phone_no")
	private long phoneNo;
	@Column(name="address")
	private String address;		
	@Column(name="user_type")
	private String userType;
	@Column(name="user_image")
	private String userImage;
	@Column(name="user_status")
	private String userStatus;
	//@OneToMany(cascade=CascadeType.ALL,mappedBy="userId")
	//private List<BookAllotment> bookAllotment;
	
	
}
