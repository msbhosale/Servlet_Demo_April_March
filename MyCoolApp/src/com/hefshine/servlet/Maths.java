package com.hefshine.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Maths extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Maths() {

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

//		String number1 = request.getParameter("number1");
//		String number2 = request.getParameter("number2");
//
//		PrintWriter pw = response.getWriter();
//
//		pw.write("<h1>" + number1 + "</h1>");
//		pw.write("<h1>" + number2 + "</h1>");
//		
//		pw.close();
		PrintWriter pw = response.getWriter();

		String PI = getServletConfig().getInitParameter("PI");

		pw.print("Value of PI : " + PI);

		pw.close();

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

}
