package com.hefshine.servlet;

import java.io.IOException;
import java.io.PrintWriter;

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

		PrintWriter pw = response.getWriter();
		UserDAO ud = new UserDAO();
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");

		User user = new User(username, password);

		if (ud.checkUser(user)) {

			pw.write("Welcome, " + user.getUsername());

		} else {

			pw.write("Sorry !");

		}

	}
}
