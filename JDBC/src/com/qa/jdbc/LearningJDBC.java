package com.qa.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class LearningJDBC {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/movielens";
		String uname = "root";
		String pword = "root";
		String queryID = "SELECT id, title FROM movies";

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		try {
			Connection con = DriverManager.getConnection(url, uname, pword);
			Statement stmnt = con.createStatement();
			ResultSet result = stmnt.executeQuery(queryID);

			while (result.next()) {
				String movie = "";
				for (int i = 1; i < 3; i++) {
					if (i % 2 != 0) {
					movie += "ID: " + result.getString(i) + ": ";
					}
					else {
						movie += "Title: " + result.getString(i);
					}
				}
				System.out.println(movie);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}