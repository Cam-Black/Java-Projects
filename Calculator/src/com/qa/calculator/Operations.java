package com.qa.calculator;

public class Operations {
    private int num1;
    private int num2;
    
    public Operations(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public void setMyNumbers(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public String addTwoNumbers() {
        int result = this.num1 + this.num2;
        return "The sum of " + this.num1 + " and " + this.num2 + " = " + result;
    }
}