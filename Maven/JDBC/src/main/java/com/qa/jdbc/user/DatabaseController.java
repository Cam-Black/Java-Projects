package com.qa.jdbc.user;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class DatabaseController {
	private String jdbcConnectionURL;
	private String username;
	private String password;
	Scanner s = new Scanner(System.in);
	
	public DatabaseController(String username, String password) {
		super();
		this.jdbcConnectionURL = "jdbc:mysql://localhost:3306/my_new_shop";
		this.username = username;
		this.password = password;
	}
	
	public DatabaseController(String jdbcConnectionURL, String username, String password) {
		super();
		this.jdbcConnectionURL = jdbcConnectionURL;
		this.username = username;
		this.password = password;
	}
	
	public void chooseTable() {
		try {
			Connection con = DriverManager.getConnection(jdbcConnectionURL);	
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}