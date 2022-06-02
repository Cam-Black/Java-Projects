package com.qa.jdbc.table;

import java.util.Scanner;

public class Customer {
	int customerID;
	String firstName;
	String lastName;
	String homeAddress;
	
	public Customer() {}
	
	public Customer(int customerID, String firstName, String lastName, String homeAddress) {
		super();
		this.customerID = customerID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.homeAddress = homeAddress;
	}

	public Customer(String firstName, String lastName, String homeAddress) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.homeAddress = homeAddress;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getHomeAddress() {
		return homeAddress;
	}

	public void setHomeAddress(String homeAddress) {
		this.homeAddress = homeAddress;
	}
	
	public int getCustomerID() {
		return this.customerID;
	}
	
	public Customer createCustomer(Customer customer) {
		
		Scanner s = new Scanner(System.in);
		try {
			System.out.println("Enter Customer First Name:");
			customer.setFirstName(s.nextLine());
			System.out.println("Enter Customer Last Name:");
			customer.setLastName(s.nextLine());
			System.out.println("Enter Customer Home Address:");
			customer.setHomeAddress(s.nextLine());
			return customer;
		} finally {
			s.close();
		}
	}
	@Override
	public String toString() {
		return "Customers [customerID: " + customerID + ", firstName: " + firstName + ", lastName: " + lastName
				+ ", homeAddress: " + homeAddress + "]";
	}
	
}