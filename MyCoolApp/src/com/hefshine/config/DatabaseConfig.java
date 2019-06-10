package com.hefshine.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConfig {

	public static Connection getJdbcConnection() throws SQLException {

		Connection connection = null;

		try {
			connection = DriverManager.getConnection("", "", "");
		} catch (Exception e) {

		} finally {

		}

		return connection;

	}

}