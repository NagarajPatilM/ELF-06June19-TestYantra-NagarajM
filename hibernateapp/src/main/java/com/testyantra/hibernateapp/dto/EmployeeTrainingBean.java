package com.testyantra.hibernateapp.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data

@Entity
@Table(name="employee_training")
public class EmployeeTrainingBean implements Serializable{
	@ Id
	@Column(name="id")
	private int id;
	@ Id
	@Column(name="course_id")
	private int courseId;

}
