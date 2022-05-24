package com.qa.runner;
import com.qa.spaceship.Spaceship;

public class Runner {
    public static void main(String[] args) throws Exception {
        Spaceship enterprise = new Spaceship("USS Enterprise", 4, true);
        Spaceship milleniumFalcon = new Spaceship("Millenium Falcon", 2, true);
        Spaceship nostromo = new Spaceship("Nostromo", 4, false);

        Spaceship listOfShips[] = new Spaceship[3];
        listOfShips[0] = enterprise;
        listOfShips[1] = milleniumFalcon;
        listOfShips[2] = nostromo;

        for (int i = 0; i < listOfShips.length; i++) {
            System.out.println(listOfShips[i]);
        }
    }
}