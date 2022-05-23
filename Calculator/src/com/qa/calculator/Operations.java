package com.qa.calculator;

public class Operations {
    private int num1;
    private int num2;
    
    public Operations(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public String addTwoNumbers() {
        int result = this.num1 + this.num2;
        return this.num1 + " + " + this.num2 + " = " + result;
    }

    public String multiplyTwoNumbers() {
        int result = this.num1 * this.num2;
        return this.num1 + " * " + this.num2 + " = " + result;
    }
    
    public String subtractTwoNumbers() {
        int result = this.num1 - this.num2;
        return this.num1 + " - " + this.num2 + " = " + result;
    }
    public String divideTwoNumbers() {
        double num1 = this.num1;
        double num2 = this.num2;
        
        if (num1 < num2) {
            return "Cannot divide " + num1 + " by " + num2;
        }
        else { 
            return num1 + " / " + num2 + " = " + num1 / num2;
        }
    }
}