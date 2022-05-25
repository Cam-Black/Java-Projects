package com.qa.pennies;

public class CalculateChange {
    

    private double roundToTwoDecimalPlaces(double num) {
        return Math.floor(num * 100) / 100;
    }

    private double difference(double cost, double given) {
        double changeToBeGiven = given - cost;
        return roundToTwoDecimalPlaces(changeToBeGiven);
    }

    public String changeInCoins(double cost, double given) {
        double changeToBeGivenInPennies = difference(cost, given) * 100;
        
        int count50 = 0;
        int count20 = 0;
        int count10 = 0;
        int count5 = 0;
        int count2 = 0;
        int count1 = 0;
        int count50p = 0;
        int count20p = 0;
        int count10p = 0;
        int count5p = 0;
        int count2p = 0;
        int count1p = 0;

        while (changeToBeGivenInPennies != 0) {
            if (changeToBeGivenInPennies >= 5000) {
                changeToBeGivenInPennies -= 5000;
                count50++;
            }
            else if (changeToBeGivenInPennies >= 2000) {
                changeToBeGivenInPennies -= 2000;
                count20++;
            }
            else if (changeToBeGivenInPennies >= 1000) {
                changeToBeGivenInPennies -= 1000;
                count10++;
            }
            else if (changeToBeGivenInPennies >= 500) {
                changeToBeGivenInPennies -= 500;
                count5++;
            }
            else if (changeToBeGivenInPennies >= 200) {
                changeToBeGivenInPennies -= 200;
                count2++;
            }
            else if (changeToBeGivenInPennies >= 100) {
                changeToBeGivenInPennies -= 100;
                count1++;
            }
            else if (changeToBeGivenInPennies >= 50) {
                changeToBeGivenInPennies -= 50;
                count50p++;
            }
            else if (changeToBeGivenInPennies >= 20) {
                changeToBeGivenInPennies -= 20;
                count20p++;
            }
            else if (changeToBeGivenInPennies >= 10) {
                changeToBeGivenInPennies -= 10;
                count10p++;
            }
            else if (changeToBeGivenInPennies >= 5) {
                changeToBeGivenInPennies -= 5;
                count5p++;
            }
            else if (changeToBeGivenInPennies >= 2) {
                changeToBeGivenInPennies -= 2;
                count2p++;
            }
            else {
                changeToBeGivenInPennies -= 1;
                count1p++;
            } 
        }
        return "£50 Notes: " + count50 + "\n£20 Notes: " + count20 + "\n£10 Notes: " + count10 + "\n£5 Notes: " + count5 + "\n£2 Coins: " + count2 + "\n£1 Coins: " + count1 + "\n50p Coins: " + count50p + "\n20p Coins: " + count20p + "\n10p Coins: " + count10p + "\n5p Coins: " + count5p + "\n2p Coins: " + count2p + "\n1p Coins: " + count1p;
    }
}