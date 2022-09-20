package com.qa.cloudacademy.sectionseven.bankaccount;

public class BankAccount {
	private String owner;
	private int balance;
	
	public BankAccount() {
		super();
		this.balance = 0;
	}
	
	public BankAccount(String owner) {
		this();
		this.owner = owner;
	}
	
	public BankAccount(String owner, int balance) {
		this(owner);
		if (balance <= 0) {
			System.err.println("Invalid amount, balance not set!");
		} else {
			this.balance = balance;
			System.out.println("Balance Set!");
			System.out.println();
		}
	}
	
	public void deposit(int amount) {
		if (amount < 0){
			System.err.println("Can not add 0 or less to bank account, try again!");
			System.out.println();
		} else {
			this.balance += amount;
			System.out.println(this.getOwner() + "'s balance is now: $" + this.getBalance());
			System.out.println();
		}
	}
	
	public void withdraw(int amount) {
		if (amount > this.balance) {
			System.err.println("Funds unavailable.");
			System.err.println("Current funds: $" + this.balance);
			System.out.println();
		} else {
			this.balance -= amount;
		}
	}
	
	public String getOwner() {
		return this.owner;
	}
	
	public int getBalance() {
		return this.balance;
	}
	
	@Override
	public String toString() {
		return "Account[Owner: " + this.getOwner() + ", Balance = $" + this.getBalance();
	}
}
