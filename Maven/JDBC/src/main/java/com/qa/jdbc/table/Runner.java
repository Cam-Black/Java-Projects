package com.qa.jdbc.table;

public class Runner {

	public static void main(String[] args) {
		CustomerDAO customerDAO = new CustomerDAO("root", "root");
		Customer newCustomer = new Customer("Johnny", "Silver", "Madagascar");
		
		System.out.println(customerDAO.readCustomer(2));
		System.out.println(customerDAO.readAll());
		
//		customerDAO.addCustomer(newCustomer);
	}
}