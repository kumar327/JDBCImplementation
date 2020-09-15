package com.jdbc.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.jdbc.constants.JDBCConstants;

public class JDBCImplementation {

	public static void main(String[] args) {
		try {

			String query = "SELECT * FROM registration;";
			Class.forName("com.mysql.jdbc.Driver");

			Connection con = DriverManager.getConnection(JDBCConstants.url, JDBCConstants.userName,
					JDBCConstants.password);

			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(query);

			while (rs.next()) {
				System.out.println("Id :: " + rs.getInt("eId") + " Name :: " + rs.getString("eName"));

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
