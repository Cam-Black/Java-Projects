package com.qa.arrays;

public class Arrays {

    private int[] arr = new int[10];

    public void populateArr() {
        arr = new int[10];

        for (int i = 1; i < arr.length + 1; i++) {
            int j = 0;
            arr[j] = i;
            System.out.println(arr[j]);
            j++;
        }
    }

    public void multiplyElementsBy10() {
        for (int i = 1; i < arr.length + 1; i++) {
            int j = 0;
            arr[j] = i;
            System.out.println(arr[j] * 10);
            j++;
        }
    }
}