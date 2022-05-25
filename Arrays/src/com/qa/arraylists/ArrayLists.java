package com.qa.arraylists;
import java.util.ArrayList;
import java.util.List;

public class ArrayLists {

    private List<String> myStringArr = new ArrayList<>();
    private List<Integer> myIntArr = new ArrayList<>();
    
    public List<String> addToArrayList(String element) {
        myStringArr.add(element);
        return myStringArr;
    }

    public String getElement(int index) {
        return myStringArr.get(index);
    }

    public List<String> setElement(int index, String element) {
        myStringArr.set(index, element);
        return myStringArr;
    }

    public List<String> removeElement(int index) {
        myStringArr.remove(index);
        return myStringArr;
    }

    public List<Integer> oneToTwenty() {
        for (int i = 1; i <= 20; i++) {
            myIntArr.add(i);
        }
        return myIntArr;
    }
    public void displayMyStringArr() {
        System.out.println(myStringArr);
        int j = 0;
        for (String i : myStringArr) {
            
            System.out.println("index: " + j + " = " + i);
            j++;
        }
        System.out.println("Array size = " + myStringArr.size());
    }

    public void displayMyIntArr() {
        System.out.println(myIntArr);
        int j = 0;
        for (int i : myIntArr) {
            
            System.out.println("index: " + j + " = " + i);
            j++;
        }
        System.out.println("Array size = " + myIntArr.size());
    }

    private int squareMyIntArrOdd(int i) {
        {if (!isEven(i))
            System.out.println(i + " squared = " + Math.round(Math.pow(i, 2)));
        }
        return 0;
    }

    private int cubeMyIntArrEven(int i) {
        if (!isEven(i)){
            System.out.println(i + " cubed = " + Math.round(Math.pow(i, 3)));
        }    
        return 0;
    }
    
    private boolean isEven(int i) {
        int element = myIntArr.get(i);
        return element % 2 == 0;
    }
    
    public void squareAndCubeMyIntArr() {
        for (int i : myIntArr) {
            if (isEven(i - 1)) {
                cubeMyIntArrEven(i);
            }
            else {
                squareMyIntArrOdd(i);
            }
        }
    }
}