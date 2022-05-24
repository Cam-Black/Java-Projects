package com.qa.pennies;

public class CalculateChange {
    

    private double roundToTwoDecimalPlaces(double num) {
        return Math.floor(num * 100) / 100;
    }

    private double difference(double cost, double given) {
        double changeToBeGiven = given - cost;
        return roundToTwoDecimalPlaces(changeToBeGiven);
    }

    private double changeInCoins(double cost, double given) {
        double changeToBeGivenInPennies = difference(cost, given) * 100;
        System.out.println(changeToBeGivenInPennies);
        double givenInPennies = given * 100;
        System.out.println(givenInPennies);
        int count50 = 0;
        int count20 = 0;

        // while (changeToBeGivenInPennies != givenInPennies) {
        //     switch (given) {
        //         case given > 50 :
                    
        //     }
        // }
        return 0;
    }

    public double returnChange(double cost, double given) {
        changeInCoins(cost, given);
        return difference(cost, given);
    }
}
