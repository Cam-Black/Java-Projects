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
	//Created a log4j logger
	public static final Logger LOGGER = LogManager.getLogger(CustomerDAO.class);
	
	//Attributes for connecting to the database
	private String jdbcConnectionURL;
	private String username;
	private String password;
	
	//Constructor asking for username and password, setting the URL at start
	public CustomerDAO(String username, String password) {
		jdbcConnectionURL = "jdbc:mysql://localhost:3306/my_new_shop";
		this.username = username;
		this.password = password;
	}
	
	//Constructor for setting username and password along with connection URL
	public CustomerDAO(String jdbcConnectionURL, String username, String password) {
		this.jdbcConnectionURL = jdbcConnectionURL;
		this.username = username;
		this.password = password;
	}
	
	//Method for unwrapping a customer from a result set
	private Customer customerFromResultSet(ResultSet resultSet) throws SQLException {
		int customerID = resultSet.getInt("customer_id");
		String firstName = resultSet.getString("first_name");
		String lastName = resultSet.getString("surname");
		String homeAddress = resultSet.getString("home_address");
		return new Customer(customerID, firstName, lastName, homeAddress);
	}
	
	//Method to read a single customer from database utilising the customerFromResultSet unwrap method
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
	
	//Method to read all customers from a database utilising an array list then using the customerFromResultSet
	//unwrap method
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
	
	//Method to add a new customer to the database with new fields, using a Customer object as the parameter
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
	
	//Method to delete a single row in customers where ID is matched by user input
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
	
	//Method to update all fields of a customer, where each field is given a value by the user from the command line
	//TO-DO: Allow editing of individual fields of a customer object
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