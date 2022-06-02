package com.qa.jdbc.table;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
		} catch (SQLException e) {
			LOGGER.debug(e.getStackTrace());
		}
		return customers;
	}

	public Customer addCustomer(Customer customer) {
		String addCustomer = "INSERT INTO customers (first_name, surname, home_address) VALUES (?, ?, ?)";
		try {
			Connection con = DriverManager.getConnection(jdbcConnectionURL, username, password);
			PreparedStatement ps = con.prepareStatement(addCustomer);
			ps.setString(1, customer.getFirstName());
			ps.setString(2, customer.getLastName());
			ps.setString(3, customer.getHomeAddress());

			ps.executeUpdate();
		} catch (SQLException e) {
			LOGGER.debug(e.getStackTrace());
		}
		return customer;
	}

	public void deleteCustomerByID() {
		Scanner s = new Scanner(System.in);
		int customer_id;
		String deleteQuery = "DELETE FROM customers WHERE customer_id = ?";
		try {
			Connection con = DriverManager.getConnection(jdbcConnectionURL, username, password);
			PreparedStatement ps = con.prepareStatement(deleteQuery);
			
			System.out.println("Enter Customer ID of customer to delete:");
			customer_id = s.nextInt();
			ps.setInt(1, customer_id);
			int rows = ps.executeUpdate();
			System.out.println("Rows affected: " + rows);
		} catch (SQLException e) {
			LOGGER.debug(e.getStackTrace());
		} finally {
			s.close();
		}
	}
	
	public Customer updateCustomer(Customer customer) {
		Scanner s = new Scanner (System.in);
		int customerID;
		String updateQuery = "UPDATE customers SET first_name = ?, surname = ?, home_address = ? WHERE customer_id = ?";
		
		try {
			Connection con = DriverManager.getConnection(jdbcConnectionURL, username, password);
			PreparedStatement ps = con.prepareStatement(updateQuery);
			
			System.out.println("New First Name = ");
			customer.setFirstName(s.nextLine());
			ps.setString(1, customer.getFirstName());
			
			System.out.println("New Last Name = ");
			customer.setLastName(s.nextLine());
			ps.setString(2, customer.getLastName());
			
			System.out.println("New Home Address = ");
			customer.setHomeAddress(s.nextLine());
			ps.setString(3, customer.getHomeAddress());
			
			System.out.println("Customer ID to change = ");
			customerID = s.nextInt();
			ps.setInt(4,  customerID);
			
			ps.executeUpdate();
			
		} catch (SQLException e) {
			LOGGER.debug(e.getStackTrace());
		} finally {
			s.close();
		}
		return customer;
	}
}