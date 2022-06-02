package com.qa.jdbc.table;

public class Runner {

	public static void main(String[] args) {
		CustomerDAO customerDAO = new CustomerDAO("root", "root");
		Customer customer = new Customer();
		
//		customer.createCustomer(customer);
//		customerDAO.addCustomer(customer);
		
		System.out.println(customerDAO.readAll());
//		customerDAO.deleteCustomerByID();
		customerDAO.updateCustomer(customer);
		System.out.println(customerDAO.readAll());
	}
}