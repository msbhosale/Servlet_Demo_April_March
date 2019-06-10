package com.hefshine.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hefshine.beans.User;
import com.hefshine.dao.UserDAO;

public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public LoginServlet() {

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String view = null;

		String username = request.getParameter("username");
		String password = request.getParameter("password");

		UserDAO ud = new UserDAO();
		User user = new User();

		user.setUsername(username);
		user.setPassword(password);

		if (ud.isValidUser(user)) {

			request.getSession().setAttribute("username", username);
			
			view = "Welcome";

		} else {

			view = "login.html";

		}

		response.sendRedirect(view);

	}
}