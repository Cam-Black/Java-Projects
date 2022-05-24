package com.qa.iterators;

public class Flowchart {
    public boolean whileALessThan200() {
        int a = 100;

        while (a <= 200) {
            System.out.println(a);
            a++;
        }
        return true;
    }

    public boolean whileAIsLessThanEqualTo200() {
        int a = 100;
        
        while (a <= 200) {
            if(a % 2 == 0) {
                System.out.println("-");
            }
            else {
                System.out.println("*");
            }
            a++;
        }
        return false;
    }
}
