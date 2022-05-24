package com.qa.blackjack;

public class App {
    public static void main(String[] args) throws Exception {
        Blackjack cards = new Blackjack();
        
        System.out.println(cards.play(19, 23));
        System.out.println(cards.play(0 , 1));
        System.out.println(cards.play(15, 16));
        System.out.println(cards.play(17, 10));
    }
}
