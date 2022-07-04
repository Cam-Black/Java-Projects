package com.qa.machine;

import com.qa.machine.drink.Drinks;

public class CoffeeMachine {
    private double credit = 0;
    private java.util.ArrayList<Drinks> drinks;

    public CoffeeMachine(){}
    public CoffeeMachine(int startCredit) {
        this.credit = startCredit;
    }

    public String orderDrink(Drinks drink) {
        if (drink.getTotalPrice() <= credit) {
            this.credit -= drink.getTotalPrice();
            return drink.getName() + ": " + drink.getTotalPrice() +"\nCredit remaining: " + this.credit;
        } else {
            return "Credit: " + this.getCredit() + "\nDrink cost: " + drink.getTotalPrice()
                    + "\nAdd More " + "Credit!";
        }
    }
    public double addCredit(double creditToAdd) {
        return this.credit += creditToAdd;
    }

    public double getCredit() {
        return this.credit;
    }
}