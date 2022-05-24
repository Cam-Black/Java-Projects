package com.qa.blackjack;

public class App {
    public static void main(String[] args) throws Exception {
        Blackjack cardsOne = new Blackjack(18, 18);
        System.out.println(cardsOne.checkWinner());

        Blackjack cardsTwo = new Blackjack(15, 20);
        System.out.println(cardsTwo.checkWinner());
    }
}
