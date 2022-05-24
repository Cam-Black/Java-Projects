package com.qa.blackjack;

public class Blackjack {
    private int handOne;
    private int handTwo;

    public Blackjack(int firstHand, int secondHand) {
        this.handOne = firstHand;
        this.handTwo = secondHand;
    }
    
    //Check both hands hold valid values
    private boolean handOneIsValidHand() {
        return this.handOne <= 21 && this.handOne > 0;
    }

    private boolean handTwoIsValidHand() {
        return this.handTwo <= 21 && this.handTwo > 0;
    }

    private boolean checkValidHands() {
        if (!this.handOneIsValidHand() && !this.handTwoIsValidHand()) {
            return false;
        }
        return true;
    }

    //Compare both hands to see which hand is closer to 21
    private int compareHands() {
        if (21 - handOne < 21 - handTwo) {
            return handOne;
        }
        return handTwo;
    }

    //Check which hand is the winner and return the value of the winning hand
    public int checkWinner() {
        if(!checkValidHands()) {
            return 0;
        }
        else if (!handOneIsValidHand()) {
            return this.handTwo;
        }
        else if (!handTwoIsValidHand()) {
            return this.handOne;
        }
        else {
            return this.compareHands();
        }
    }
}