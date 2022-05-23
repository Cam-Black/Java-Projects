package com.qa.calculator;

public class Calculator {
    
    public static void main(String[] args) throws Exception {
        Operations myNumbers = new Operations(2, 5);
        Operations myNumbers2 = new Operations(12, 34);
        Operations myNumbers3 = new Operations(10, 2);

        System.out.println(myNumbers.addTwoNumbers());
        System.out.println(myNumbers2.addTwoNumbers());
        
        System.out.println(myNumbers.multiplyTwoNumbers());
        System.out.println(myNumbers.subtractTwoNumbers());
        System.out.println(myNumbers.divideTwoNumbers());

        System.out.println(myNumbers3.divideTwoNumbers());
    }
}
