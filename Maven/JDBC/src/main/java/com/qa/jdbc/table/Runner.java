package com.qa.jdbc.table;

public class Runner {

	public static void main(String[] args) {
		CustomerDAO customerDAO = new CustomerDAO("root", "root");
		Customer newCustomer = new Customer();
		
//		newCustomer.createCustomer(newCustomer);

//		customerDAO.addCustomer(newCustomer);
		System.out.println(customerDAO.readAll());
		customerDAO.deleteCustomerByID();
		System.out.println(customerDAO.readAll());
	}
}