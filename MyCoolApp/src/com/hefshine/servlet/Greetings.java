package com.hefshine.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Greetings extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Greetings() {

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

//		System.out.println("Called");

		PrintWriter pw = response.getWriter();

		pw.write("<a href='Maths?number1=25&number2=56'>Maths</a>");

		pw.close();

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

}
