package com.qa.interfacesegregation;

public class Falcon implements FlyingBird, EggLayingBird{
	
	private String currentLocation;
    private int numberOfEggs;
    
    public Falcon() {}
    
    public Falcon(int eggCount) {
        this.numberOfEggs = eggCount;
    }

    public void fly() {
        this.setCurrentLocation("soaring above the clouds");
    }

    public void layEggs() {
        this.numberOfEggs++;
    }

    public String getCurrentLocation() {
        return currentLocation;
    }

    public void setCurrentLocation(String currentLocation) {
    this.currentLocation = currentLocation;
    }

    public int getNumberOfEggs() {
        return numberOfEggs;
    }

    public void setNumberOfEggs(int numberOfEggs) {
        this.numberOfEggs = numberOfEggs;
    }
}
