package com.hefshine.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Feb extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Feb() {

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// For this servlet only
		String teacher = getServletConfig().getInitParameter("Teacher");

		// For All servlets
		String institute = getServletContext().getInitParameter("Name");

		System.out.println(teacher + " " + institute);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

}