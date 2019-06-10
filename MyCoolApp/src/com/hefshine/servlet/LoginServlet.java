package com.hefshine.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hefshine.service.UserService;

public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public LoginServlet() {

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

//		System.out.println("LoginServlet called");
		PrintWriter pw = response.getWriter();
		RequestDispatcher rd = null;

		String username = request.getParameter("username");

		UserService us = new UserService();

		if (us.checkUsername(username)) {

//			rd = request.getRequestDispatcher("Welcome");
//			rd.forward(request, response);
			
			response.sendRedirect("Welcome");

		} else {

			pw.write("Invalid username or password");

			rd = request.getRequestDispatcher("/login.html");
			rd.include(request, response);

		}

		pw.close();

	}

}