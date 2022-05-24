package com.qa.blackjack;

public class Blackjack {
    
    //Check both hands hold valid values
    private boolean handOneIsValidHand(int a) {
        return a <= 21 && a > 0;
    }

    private boolean handTwoIsValidHand(int b) {
        return b <= 21 && b > 0;
    }

    private boolean checkValidHands(int a, int b) {
        if (!this.handOneIsValidHand(a) && !this.handTwoIsValidHand(b)) {
            return false;
        }
        return true;
    }

    //Compare both hands to see which hand is closer to 21
    private int compareHands(int a, int b) {
        if (21 - a < 21 - b) {
            return a;
        }
        return b;
    }

    //Check which hand is the winner and return the value of the winning hand
    public int play(int a, int b) {
        if(!checkValidHands(a, b)) {
            return 0;
        }
        else if (!handOneIsValidHand(a)) {
            return b;
        }
        else if (!handTwoIsValidHand(b)) {
            return a;
        }
        else {
            return this.compareHands(a, b);
        }
    }
}