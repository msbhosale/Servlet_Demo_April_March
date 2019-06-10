package com.hefshine.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hefshine.beans.User;
import com.hefshine.dao.UserDAO;

public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public RegisterServlet() {

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String firstName = request.getParameter("firstname");
		String lastName = request.getParameter("lastname");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String birthdate = request.getParameter("birthdate");
		String city = request.getParameter("city");
		String pin = request.getParameter("pin");
		String contactNumber = request.getParameter("contact-number");

		UserDAO ud = new UserDAO();

		User user = new User(firstName, lastName, username, password, birthdate, city, pin, contactNumber);

		try {
			ud.save(user);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		response.sendRedirect("Success");

	}
}