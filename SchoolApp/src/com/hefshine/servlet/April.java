package com.hefshine.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class April extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public April() {

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String name = getServletConfig().getInitParameter("Teacher");

		String institute = getServletContext().getInitParameter("Name");

		System.out.println(name + " " + institute);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

}
