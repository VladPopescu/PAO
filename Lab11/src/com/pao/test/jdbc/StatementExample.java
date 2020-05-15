package com.pao.test.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StatementExample {

	static final String DB_URL = "jdbc:mysql://localhost/pao";

	static final String USER = "root";
	static final String PASS = "root";

	public static void main(String[] args) {
		try {

			System.out.println("Connecting to a selected database...");
			Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
			Statement stmt = conn.createStatement();
			System.out.println("Connected database successfully...");


			String sql = "SELECT * FROM student";
			ResultSet rs = stmt.executeQuery(sql);
			int size = 0;
			while (rs.next()){
				size++;
			}
			System.out.println("Count of students: " + size);

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
