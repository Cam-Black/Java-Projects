package com.qa.jdbc.table;

public class Runner {

	public static void main(String[] args) {
		CustomerDAO customer = new CustomerDAO("root", "root");
		
		System.out.println(customer.readCustomer(2));
		System.out.println(customer.readAll());
	}
}