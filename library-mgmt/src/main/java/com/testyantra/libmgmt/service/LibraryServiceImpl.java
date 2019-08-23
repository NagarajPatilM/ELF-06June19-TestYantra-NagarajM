package com.testyantra.libmgmt.service;

import java.util.Arrays;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import com.testyantra.libmgmt.dto.Book;
import com.testyantra.libmgmt.dto.Response;
import com.testyantra.libmgmt.dto.UserBean;
import com.testyantra.libmgmt.repository.BookRepository;
import com.testyantra.libmgmt.repository.UserRepository;

@Service
public class LibraryServiceImpl implements LibraryService {

	@Autowired
	UserRepository userRepository;
	@Autowired
	BookRepository bookRepository;

	/*
	 * @Override public Response userLogin(String email, String password,
	 * HttpServletRequest request) { UserBean userBean =
	 * userRepository.findByEmail(email); Response response = new Response(); if
	 * (userBean != null && userBean.getPassword().equals(password)) {
	 * response.setMessage("success"); response.setStatusCode(201);
	 * response.setBeans(Arrays.asList(userBean));
	 * response.setDescription("Login Successfull");
	 * request.getSession().setAttribute("userBean", userBean); } else {
	 * response.setMessage("failure"); response.setStatusCode(501);
	 * response.setDescription("Login Failed"); } return response; }
	 */

	@Override
	public Response userLogin(int id, String password, HttpServletRequest request) {
		Response response = new Response();
		try {
			UserBean userBean = userRepository.findById(id).get();

			if (userBean != null && userBean.getPassword().equals(password)) {
				HttpSession httpSession = request.getSession(true);
				response.setMessage("success");
				response.setStatusCode(201);
				response.setBeans(Arrays.asList(userBean));
				response.setDescription("Login Successfull");
				request.getSession().setAttribute("userBean", userBean);
			} else {
				response.setMessage("failure");
				response.setStatusCode(401);
				response.setDescription("Invalid Credentials!!");
			}
		} catch (Exception e) {
			response.setMessage("id doesn't exist");
			response.setStatusCode(401);
		}
		return response;
	}

	// Admin functionality
	@Override
	public Response createUser(UserBean user, HttpServletRequest request) {
		Response response = new Response();
		user.setPassword(user.getFirstName().substring(0, 3) + (int) (Math.random() * 99999));
		user.setUserStatus("active");
		// if (request.getSession(false) != null) {
		userRepository.save(user);
		response.setMessage("success");
		response.setStatusCode(201);
		response.setBeans(Arrays.asList(user));
		response.setDescription("User Added Successfully");
		// } else {
		/*
		 * response.setMessage("failure"); response.setStatusCode(501);
		 * response.setDescription("Login First");
		 */
		// }
		return response;
	}

	@Override
	public Response updateUser(UserBean user, HttpServletRequest request) {
		Response response = new Response();

		if (request.getSession(false) != null) {
			if (!userRepository.existsById(user.getUserId())) {
				UserBean userBean = userRepository.save(user);
				response.setMessage("success");
				response.setStatusCode(201);
				response.setBeans(Arrays.asList(userBean));
				response.setDescription("User Updated Successfully");
			} else {
				response.setMessage("failure");
				response.setStatusCode(501);
				response.setDescription("User not exist");
			}
			return response;
		} else {
			response.setMessage("failure");
			response.setStatusCode(501);
			response.setDescription("Login First");
		}
		return response;
	}

	@Override
	public Response deActivateUser(int id, HttpServletRequest request) {
		Response response = new Response();
		try {
			UserBean user = userRepository.findById(id).get();
			user.setUserStatus("deactive");
			// if (request.getSession(false) != null) {
			if (user != null) {
				userRepository.delete(user);
				response.setMessage("success");
				response.setStatusCode(201);
				response.setBeans(Arrays.asList(user));
				response.setDescription("User deleted Successfully");
			} else {
				response.setMessage("failure");
				response.setStatusCode(501);
				response.setDescription("cant able to delete");
			}

		} catch (Exception e) {
			response.setMessage("id doesn't exists");
		}
		return response;
	}

	@Override
	public Response getAllUser(HttpServletRequest request) {
		Response response = new Response();
		if (request.getSession(false) != null) {
			List<UserBean> userList = (List<UserBean>) userRepository.findAll();
			if (userList != null) {
				response.setMessage("success");
				response.setStatusCode(201);
				response.setBeans(userList);
				response.setDescription("Got all users Successfully");
			} else {
				response.setMessage("failure");
				response.setStatusCode(501);
				response.setDescription("No user Found");
			}
			return response;
		} else {
			response.setMessage("failure");
			response.setStatusCode(501);
			response.setDescription("Login First");
		}
		return response;
	}

	// Librarian Functionality

	@Override
	public Response addBookDetails(Book book, HttpServletRequest request) {
		Response response = new Response();
		if (request.getSession(false) != null) {
			// Book book1 = BookRepository.save(book);
			response.setMessage("success");
			response.setStatusCode(201);
			// response.setBookBeans(Arrays.asList(book1));
			response.setDescription("Book Added Successfully");
		} else {
			response.setMessage("failure");
			response.setStatusCode(501);
			response.setDescription("Login First");
		}
		return response;
	}

	@Override
	public Response getBookDetails(int id, HttpServletRequest request) {
		Response response = new Response();

		if (request.getSession(false) != null) {
			Book book = bookRepository.findById(id).get();
			if (book != null) {
				response.setMessage("success");
				response.setStatusCode(201);
				response.setBookBeans(Arrays.asList(book));
				response.setDescription("Got Book details Successfully");
			} else {
				response.setMessage("failure");
				response.setStatusCode(501);
				response.setDescription("No book available");
			}
			return response;
		} else {
			response.setMessage("failure");
			response.setStatusCode(501);
			response.setDescription("Login First");
		}
		return response;
	}

	public Response userLogout(HttpSession session) {
		Response response = new Response();
		session.invalidate();
		response.setMessage("success");
		response.setStatusCode(201);
		response.setDescription("Logout Successfull");
		return response;
	}

}
