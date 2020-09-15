package com.jdbc.query;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import com.jdbc.util.JDBCConnect;

public class InsertingData {

	public static void main(String[] args) {
		try {
			String query = "INSERT INTO registration VALUES (5,'Rames',87,23);";
			Connection con = JDBCConnect.jdbcConnection();
			Statement st = con.createStatement();
			int count = st.executeUpdate(query);
			System.out.println("Number of rows inserted :: " + count);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
