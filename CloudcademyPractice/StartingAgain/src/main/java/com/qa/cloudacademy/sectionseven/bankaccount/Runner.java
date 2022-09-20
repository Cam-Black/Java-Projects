package com.qa.cloudacademy.sectionseven.bankaccount;

public class Runner {
	public static void main(String[] args) {
		BankAccount myAccount = new BankAccount("Cameron", 2000);
		myAccount.withdraw(500);
		myAccount.deposit(100);
		BankAccount yourAccount = new BankAccount("Joe", 500);
		
		System.out.println(myAccount);
		System.out.println(yourAccount);
	}
}
