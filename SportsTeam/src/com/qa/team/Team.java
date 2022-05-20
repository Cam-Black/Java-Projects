package com.qa.team;

public class Team {
    private String fullName;
    private String position;
    private int playerNumber;
    
    public Team() {

    }

    public Team(String fullName, String position, int playerNumber) {
        this.fullName = fullName;
        this.position = position;
        this.playerNumber = playerNumber;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getPlayerNumber() {
        return playerNumber;
    }

    public void setPlayerNumber(int playerNumber) {
        this.playerNumber = playerNumber;
    }
}