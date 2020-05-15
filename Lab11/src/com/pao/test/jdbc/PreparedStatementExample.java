package com.pao.test.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PreparedStatementExample {

	static final String DB_URL = "jdbc:mysql://localhost/pao";

	static final String USER = "root";
	static final String PASS = "root";

	public static void main(String[] args) {
		try{

			System.out.println("Connecting to a selected database...");
			Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
			PreparedStatement preparedStatement = conn
					.prepareStatement("UPDATE student SET name=? WHERE id=?");
			preparedStatement.setString(1, "Vlad Alexandru");
			preparedStatement.setInt(2, 1);
			System.out.println("Connected database successfully...");

			int i = preparedStatement.executeUpdate();
			System.out.println(i + " records updated");

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
