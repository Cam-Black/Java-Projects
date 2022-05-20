package com.qa.spaceship;

public class Spaceship {
    private String name;
    private int engines;
    private boolean warpDrive;
    
    public Spaceship() {
    }

    public Spaceship(String name, int engines, boolean warpDrive) {
        this.name = name;
        this.engines = engines;
        this.warpDrive = warpDrive;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEngines() {
        return engines;
    }

    public void setEngines(int engines) {
        this.engines = engines;
    }

    public boolean isWarpDrive() {
        return warpDrive;
    }

    public void setWarpDrive(boolean warpDrive) {
        this.warpDrive = warpDrive;
    }

    
}
