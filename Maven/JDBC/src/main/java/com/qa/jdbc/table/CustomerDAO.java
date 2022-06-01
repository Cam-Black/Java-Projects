package com.qa.jdbc.table;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CustomerDAO {

	public static final Logger LOGGER = LogManager.getLogger(CustomerDAO.class);

	private String jdbcConnectionURL;
	private String username;
	private String password;

	public CustomerDAO(String username, String password) {
		jdbcConnectionURL = "jdbc:mysql://localhost:3306/my_new_shop";
		this.username = username;
		this.password = password;
	}

	public CustomerDAO(String jdbcConnectionURL, String username, String password) {
		this.jdbcConnectionURL = jdbcConnectionURL;
		this.username = username;
		this.password = password;
	}

	public Customer customerFromResultSet(ResultSet resultSet) throws SQLException {
		int customerID = resultSet.getInt("customer_id");
		String firstName = resultSet.getString("first_name");
		String lastName = resultSet.getString("surname");
		String homeAddress = resultSet.getString("home_address");
		return new Customer(customerID, firstName, lastName, homeAddress);
	}

	public Customer readCustomer(int id) {
		String query = "SELECT * FROM customers WHERE customer_id = " + id;
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

	public List<Customer> readAll() {
		List<Customer> customers = new ArrayList<>();
		try {
			Connection con = DriverManager.getConnection(jdbcConnectionURL, username, password);
			Statement statement = con.createStatement();
			ResultSet result = statement.executeQuery("SELECT * FROM customers");
			
			while (result.next()) {
				Customer customer = this.customerFromResultSet(result);
				customers.add(customer);
			}
		} 
		
		catch (SQLException e) {
			LOGGER.debug(e.getStackTrace());
		} 
		return customers;
	}
	
//	public Customer addCustomer() {
//		
//	}
}