package com.testyantra.libmgmt.service;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Service;

import com.testyantra.libmgmt.dto.Book;
import com.testyantra.libmgmt.dto.Response;
import com.testyantra.libmgmt.dto.UserBean;

@Service
public interface LibraryService {
	public Response userLogin(int id,String password,HttpServletRequest request);
	public Response createUser(UserBean user,HttpServletRequest request);
	public Response updateUser(UserBean user,HttpServletRequest request);
	public Response deActivateUser(int id,HttpServletRequest request);
	public Response getAllUser(HttpServletRequest request);
	public Response addBookDetails(Book book,HttpServletRequest request);
	public Response getBookDetails(int id,HttpServletRequest request);
}
