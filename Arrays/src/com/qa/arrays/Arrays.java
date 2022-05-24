package com.qa.arrays;

public class Arrays {

    private int[] arr = new int[10];

    public void populateArr() {
        arr = new int[10];

        for (int i = 1; i < arr.length + 1; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[j] = i;
            }
            System.out.println(arr[i-1]);
        }
    }

    public void multiplyElementsBy10() {
        for (int i : arr) {
            System.out.println(arr[i] * 10);
        }
    }
}