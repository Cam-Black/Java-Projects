package com.qa.arraylists;

public class Runner {
    public static void main(String[] args) {
        ArrayLists dogBreeds = new ArrayLists();
        dogBreeds.addToArrayList("Springer Spaniel");
        dogBreeds.addToArrayList("Cocker Spaniel");
        dogBreeds.addToArrayList("German Shepherd");
        dogBreeds.displayMyStringArr();
        dogBreeds.getElement(1);
        dogBreeds.setElement(1, "Chihuahua");
        dogBreeds.removeElement(1);
        dogBreeds.displayMyStringArr();

        ArrayLists myNumbers = new ArrayLists();
        myNumbers.oneToTwenty();
        myNumbers.displayMyIntArr();
        myNumbers.squareAndCubeMyIntArr();
    }
}