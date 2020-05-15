package com.pao.test.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CallableStatementTest {

	static final String DB_URL = "jdbc:mysql://localhost/pao";

	static final String USER = "root";
	static final String PASS = "root";

	public static void main(String[] args) {
		try {

			System.out.println("Connecting to a selected database...");
			Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
			System.out.println("Connected database successfully...");

			CallableStatement callableStatement = conn
					.prepareCall("{call insert_student(?,?,?,?)}");
			callableStatement.setInt(1, 8);
			callableStatement.setString(2, "Popa Marius");
			callableStatement.setInt(3, 23);
			callableStatement.setDouble(4, 8.70);

			ResultSet resultSet = callableStatement.executeQuery();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
