package com.hefshine.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ViewAll extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ViewAll() {

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		List<String> numbers = new ArrayList<String>();

		numbers.add("123456");
		numbers.add("415263");
		numbers.add("784512");
		numbers.add("852426");

		PrintWriter writer = response.getWriter();
		
		writer.write("<a href='add-contact.html'>Add Another Contact</a>");
		
		writer.write("<br><br>");

		for (String number : numbers) {

			writer.write(number + "<br><br>");

		}
		
		writer.close();

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}
}