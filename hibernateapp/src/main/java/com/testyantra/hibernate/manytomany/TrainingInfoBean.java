package com.testyantra.hibernate.manytomany;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.testyantra.hibernateapp.dto.EmployeeInfoBean;

import lombok.Data;

@Data
@Entity
@Table(name = "training_info")
public class TrainingInfoBean implements Serializable {

	@Id
	@Column(name = "course_id")
	private int courseId;
	@Column(name = "course_nm")
	private String courseName;
	@Column(name = "duration")
	private int duration;
	@Column(name = "course_type")
	private String courseType;
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "emp_training", joinColumns = { @JoinColumn(name = "course_id") }, inverseJoinColumns = {
			@JoinColumn(name = "id") })
	List<EmployeeInfoBean> infoBeans;

}// End of TrainingInfoBean
