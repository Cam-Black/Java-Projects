package com.qa.constructors;

public class Warship {
    //Attributes
    private String name = "";
    private int numOfEngines = 0;
    private boolean isNuclear = false;
    private int numOfGuns = 0;
    private String mainGunArmament = "";
    private String secondaryGunArmament = "";
    
    //Constructors
    public Warship() {}

    public Warship(String name, int numOfEngines, boolean isNuclear, int numOfGuns, String mainGunArmament,
            String secondaryGunArmament) {
        this.name = name;
        this.numOfEngines = numOfEngines;
        this.isNuclear = isNuclear;
        this.numOfGuns = numOfGuns;
        this.mainGunArmament = mainGunArmament;
        this.secondaryGunArmament = secondaryGunArmament;
    }

    public Warship(String name) {
        this.name = name;
    }

    public Warship(int numOfGuns, String mainGunArmament, String secondaryGunArmament) {
        this.numOfGuns = numOfGuns;
        this.mainGunArmament = mainGunArmament;
        this.secondaryGunArmament = secondaryGunArmament;
    }

    public Warship(int numOfEngines, boolean isNuclear) {
        this.numOfEngines = numOfEngines;
        this.isNuclear = isNuclear;
    }

    //Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumOfEngines() {
        return numOfEngines;
    }

    public void setNumOfEngines(int numOfEngines) {
        this.numOfEngines = numOfEngines;
    }

    public boolean isNuclear() {
        return isNuclear;
    }

    public void setNuclear(boolean isNuclear) {
        this.isNuclear = isNuclear;
    }

    public int getNumOfGuns() {
        return numOfGuns;
    }

    public void setNumOfGuns(int numOfGuns) {
        this.numOfGuns = numOfGuns;
    }

    public String getMainGunArmament() {
        return mainGunArmament;
    }

    public void setMainGunArmament(String mainGunArmament) {
        this.mainGunArmament = mainGunArmament;
    }

    public String getSecondaryGunArmament() {
        return secondaryGunArmament;
    }

    public void setSecondaryGunArmament(String secondaryGunArmament) {
        this.secondaryGunArmament = secondaryGunArmament;
    };

    @Override
    public String toString() {
        return "Warship: [Name: " + this.name + ", Engines: " + this.numOfEngines + ", Is Nuclear Powered: " + 
        this.isNuclear + ", Number of Guns: " + this.numOfGuns + ", Main Armament: " + this.mainGunArmament + 
        ", Secondary Armament: " + this.secondaryGunArmament + "]";
    }
    
}