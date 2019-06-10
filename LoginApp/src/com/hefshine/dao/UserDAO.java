package com.hefshine.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.hefshine.beans.User;

public class UserDAO {

	public boolean checkUser(User user) {

		boolean status = false;
		
		String query = "SELECT username FROM user WHERE username = ? AND password = ?";

		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hefshine", "root", "root");
			
			PreparedStatement pst = connection.prepareStatement(query);
			
			pst.setString(1, user.getUsername());
			pst.setString(2, user.getPassword());			
			
			ResultSet rs = pst.executeQuery();
			
			while(rs.next()) {
				status = true;
			}

		} catch (Exception e) {

		}

		return status;

	}
}









