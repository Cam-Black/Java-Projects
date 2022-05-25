package com.qa.constructors;

public class Runner { 
    public static void main(String[] args) {
        
        Warship myShip = new Warship();
        myShip.setName("The Beast");
        System.out.println(myShip);

        Warship myBetterShip = new Warship("HMS Infinity");
        System.out.println(myBetterShip);

        Warship myBestShip = new Warship("HMS Indominable", 8, true, 12, "Tomahawk Missile", "4.45\" Mark 8");
        System.out.println(myBestShip);
    }
}