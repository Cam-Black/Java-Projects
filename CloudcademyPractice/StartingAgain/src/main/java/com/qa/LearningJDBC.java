package com.qa;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class LearningJDBC {
	private String dbUrl = "jdbc:mysql://localhost:3306/user_accounts";
	private String dbUser = "root";
	private String dbPassword = "root";
	private final Utils utils;
	
	public LearningJDBC() {
		super();
		this.utils = new Utils();
	}
	
	public Connection getConnection() throws SQLException {
		return DriverManager.getConnection(dbUrl, dbUser, dbPassword);
	}
	
	public void createUser() throws SQLException {
		try {
			System.out.println("Connecting to database...");
			Connection conn = DriverManager.getConnection(dbUrl, dbUser, dbPassword);
			System.out.println("Connected to database!");
			PreparedStatement stmnt = conn.prepareStatement("INSERT INTO users(username, password) VALUES (?, ?)");
			
			System.out.println("Enter username");
			stmnt.setString(1, utils.getString());
			System.out.println("Enter password");
			stmnt.setString(2, utils.getString());
			
			stmnt.executeUpdate();
			System.out.println("User created");
		} catch (SQLException e) {
			System.err.println(e);
		}
	}
}
