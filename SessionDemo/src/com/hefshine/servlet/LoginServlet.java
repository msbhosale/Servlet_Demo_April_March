package com.hefshine.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public LoginServlet() {

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String username = request.getParameter("username");
		
//		RequestDispatcher rd = request.getRequestDispatcher("Welcome");
//		rd.forward(request, response);
		
		HttpSession session = request.getSession();
		
		session.setMaxInactiveInterval(30);
		session.setAttribute("username", username);
		
		response.sendRedirect("Welcome");
		
	}

}