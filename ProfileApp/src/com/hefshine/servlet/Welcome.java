package com.hefshine.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Welcome extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Welcome() {

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String username = request.getSession().getAttribute("username").toString();

		PrintWriter writer = response.getWriter();
		response.setContentType("text/html");

		writer.write("<h1>Welcome, " + username + "</h1>");
		writer.write("<br>");
		writer.write("<a href='Profile'>View Profile</a>");

		writer.close();

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}
}