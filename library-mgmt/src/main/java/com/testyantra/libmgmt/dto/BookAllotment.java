package com.testyantra.libmgmt.dto;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonRootName;

import lombok.Data;

@SuppressWarnings("serial")
@Data
@Entity
@JsonRootName(value="book-allotment")
@Table(name="book_allotment")
public class BookAllotment implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="book_allotment_id")
	private int bookAllotmentId;
	@ManyToOne
	@JoinColumn(name="user_id")
	private UserBean userId;
	@ManyToOne
	@JoinColumn(name="book_id")
	private Book bookId;
	@Column(name="issue_date")
	private Date issueDate;
	@Column(name="return_date")
	private Date returnDate;
	private String status;
}
