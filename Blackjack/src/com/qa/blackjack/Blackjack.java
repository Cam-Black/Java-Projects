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
        return this.handOne <= 21 || this.handOne > 0;
    }

    private boolean handTwoIsValidHand() {
        return this.handTwo <= 21 || this.handTwo > 0;
    }

    private boolean checkValidHands() {
        return this.handOneIsValidHand() && this.handTwoIsValidHand();
    }

    private int compareHands() {
        if (21 - handOne < 21 - handTwo) {
            return handOne;
        }
        return handTwo;
    }
    private int checkWinner() {
        if (checkValidHands()) {
            return this.compareHands();
        }
        else if (!handOneIsValidHand()) {
            return this.handTwo;
        }
        else if (!handTwoIsValidHand()) {
            return this.handOne;
        }
        else {
            return 0;
        }
    }

    public int results() {
        return checkWinner(); 
    }
}
