package com.qa.basket;

import com.qa.basket.item.Item;

import java.util.List;

public class ShoppingBasket {
    private List<Item> items;
    public ShoppingBasket(){}
    public ShoppingBasket(List<Item> items) {
        this.items = items;
    }
    public double getTotal() {
        double runningTotal =
                items.stream()
                        .map(x -> x.getCost())
                        .reduce(0.0, (a,b) -> a+b);
        return runningTotal;
    }
}
