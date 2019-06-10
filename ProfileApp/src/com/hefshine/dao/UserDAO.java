package com.hefshine.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.hefshine.beans.User;

public class UserDAO {

	public void save(User user) throws ClassNotFoundException {
		
		final String query = "INSERT INTO user VALUES (?,?,?,?,?,?,?,?)";

		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/myapp", "root", "root");

			PreparedStatement pst = connection.prepareStatement(query);

			pst.setString(1, user.getFirstName());
			pst.setString(2, user.getLastName());
			pst.setString(3, user.getUsername());
			pst.setString(4, user.getPassword());

			pst.setDate(5, Date.valueOf(user.getBirthdate()));

			pst.setString(6, user.getCity());
			pst.setString(7, user.getPin());
			pst.setString(8, user.getContactNumber());

			pst.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public boolean isValidUser(User user) {

		return true;
	}
}