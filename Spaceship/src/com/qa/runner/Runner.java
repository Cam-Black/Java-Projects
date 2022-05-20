package com.qa.runner;
import com.qa.spaceship.Spaceship;

public class Runner {
    public static void main(String[] args) throws Exception {
        Spaceship enterprise = new Spaceship("USS Enterprise", 4, true);
        System.out.println(enterprise.getName());
        Spaceship milleniumFalcon = new Spaceship();
        milleniumFalcon.setName("Millenium Falcon");
        System.out.println(milleniumFalcon.getName());
    }
}
