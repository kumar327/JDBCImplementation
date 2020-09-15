package com.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;

import com.jdbc.constants.JDBCConstants;

public class JDBCConnect {

	public static Connection jdbcConnection() throws Exception {
		Connection connection = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");

			connection = DriverManager.getConnection(JDBCConstants.url, JDBCConstants.userName, JDBCConstants.password);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return connection;
	}
}
