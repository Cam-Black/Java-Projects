package com.qa.pennies;

public class Pennies {
    public static void main(String[] args) {
        CalculateChange myChange = new CalculateChange();
        System.out.println(myChange.returnChange(3.58, 10));
    }
}
