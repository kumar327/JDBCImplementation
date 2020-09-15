package com.jdbc.query;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.jdbc.constants.JDBCConstants;

public class JDBCConnection {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("JDBC Driver class loadded successfully");
		Connection con = DriverManager.getConnection(JDBCConstants.url, JDBCConstants.userName, JDBCConstants.password);
		System.out.println("Connection Established successfully");
	}

}
