package com.qa.interfacesegregation;

public class Dodo implements EggLayingBird, ExtinctBird {
	
	private String currentLocation;
    private int numberOfEggs;

    public Dodo() {}
    
    public Dodo(int eggCount) {
    	this.numberOfEggs = eggCount;
    }

    public void layEggs() {
        this.numberOfEggs++;
    }

    public void goExtinct() {
        this.setCurrentLocation("in a museum");
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