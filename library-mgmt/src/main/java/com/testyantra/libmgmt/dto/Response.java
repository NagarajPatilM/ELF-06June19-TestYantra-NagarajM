package com.testyantra.libmgmt.dto;

import java.util.List;

import lombok.Data;

@Data
public class Response {
	private String message;
	private int statusCode;
	private String description;
	private List<UserBean> beans;
	private List<Book> bookBeans;
	//private List<BookAllotment> allotments;
}
