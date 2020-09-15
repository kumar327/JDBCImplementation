package com.jdbc.query;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.jdbc.util.JDBCConnect;

public class PreparedStatementInserting {

	public static void main(String[] args) {

		String query = "INSERT INTO registration VALUES (?,?,?,?);";
		try {
			Connection con = JDBCConnect.jdbcConnection();
			PreparedStatement ps = con.prepareStatement(query);
			ps.setInt(1, 6);
			ps.setString(2, "Kumar");
			ps.setDouble(3, 56.0);
			ps.setInt(4, 34);
			int count = ps.executeUpdate();
			System.out.println("Inserted the number of rows :; " + count);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
