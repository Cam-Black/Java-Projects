package com.qa.jdbc.table;

public class Runner {

	public static void main(String[] args) {
		LearningJDBC openConnection = new LearningJDBC("root", "root");
		openConnection.readAll();
		openConnection.customerData();
	}
}