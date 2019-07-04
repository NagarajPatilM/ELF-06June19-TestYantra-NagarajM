package com.testyantra.hibernateapp.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data

@Entity
@Table(name="employee_training")
public class EmployeeTrainingBean {
	@ Id
	@Column(name="id")
	private int id;
	@ Id
	@Column(name="course_id")
	private int courseId;

}
