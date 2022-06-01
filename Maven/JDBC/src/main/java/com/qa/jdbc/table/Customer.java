package com.qa.jdbc.table;

public class Customer {
	int customerID;
	String firstName;
	String lastName;
	String homeAddress;
	
	public Customer() {}
	
	public Customer(int customerID, String firstName, String lastName, String homeAddress) {
		this.customerID = customerID;
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
}