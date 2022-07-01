package com.qa.machine.drink;

public class Drinks {
    private String name = "";
    private double price = 0;
    private int quantity = 1;

    public Drinks() {
    }

    public Drinks(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public double getPrice() {
        return this.price;
    }

    public double getTotalPrice() {
        return this.price * this.quantity;
    }

    public String getName() {
        return this.name;
    }

    public int getQuantity() {
        return this.quantity;
    }
    @Override
    public String toString() {
        return "Drink [Name: " + this.name + ", Cost: " + this.price + ", Quantity: " + quantity + "]";
    }
}
