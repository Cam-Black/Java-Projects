package com.qa.jdbc.table;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LearningJDBC {

	public static final Logger LOGGER = LogManager.getLogger(LearningJDBC.class);

	private String jdbcConnectionURL;
	private String username;
	private String password;
	int id;
	private String query = "SELECT * FROM customers";

	public LearningJDBC(String username, String password) {
		jdbcConnectionURL = "jdbc:mysql://localhost:3306/my_new_shop";
		this.username = username;
		this.password = password;
	}

	public LearningJDBC(String jdbcConnectionURL, String username, String password) {
		this.jdbcConnectionURL = jdbcConnectionURL;
		this.username = username;
		this.password = password;
	}

	public void readAll() {
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(jdbcConnectionURL, username, password);
			System.out.println("Connection Successful!");
		} catch (SQLException e) {
			LOGGER.debug(e.getStackTrace());
		} finally {
			try {
				if (conn != null) {
					conn.close();
					System.out.println("Connection Closed!");
				}
			} catch (SQLException se) {
				se.printStackTrace();
			}
		}
	}

	public Customer customerFromResultSet(ResultSet resultSet) throws SQLException {
		int customerID = resultSet.getInt("customer_id");
		String firstName = resultSet.getString("first_name");
		String lastName = resultSet.getString("surname");
		String homeAddress = resultSet.getString("home_address");
		return new Customer(customerID, firstName, lastName, homeAddress);
	}

	public Customer readCustomer(int id) {
		try (Connection conn = DriverManager.getConnection(jdbcConnectionURL, username, password);
				Statement statement = conn.createStatement();
				ResultSet resultSet = statement.executeQuery(query)) {

			resultSet.next();
			return customerFromResultSet(resultSet);
		} catch (SQLException e) {
			LOGGER.debug(e.getStackTrace());
		}
		return null;
	}

	public void customerData() {
		try {
			Connection con = DriverManager.getConnection(jdbcConnectionURL, username, password);
			Statement statement = con.createStatement();
			ResultSet result = statement.executeQuery(query);
			
			while (result.next()) {
				String myNewShopData = "";
				for (int i = 1; i <= 4; i++) {
					switch (i) {
					case 1:
						myNewShopData += "ID: " + result.getString(i) + ", ";
						break;
					case 2:
						myNewShopData += "First Name: " + result.getString(i) + ", ";
						break;
					case 3: 
						myNewShopData += "Surname: " + result.getString(i) + ", ";
						break;
					case 4:
						myNewShopData += "Home Address: " + result.getString(i) + ".";
					}
				}
				System.out.println(myNewShopData);
			}
		} catch (SQLException e) {
			LOGGER.debug(e.getStackTrace());
		}
	}
}