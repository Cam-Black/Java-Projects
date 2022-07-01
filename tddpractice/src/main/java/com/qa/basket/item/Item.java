package com.qa.basket.item;

/**
 * Item class to allow creation of unique Items with a name, price and quantity.
 * These can then be created individually or added to a collection type such as a list.
 * In ShoppingBasket we utilise a list to add multiple items to our basket.
 */
public class Item {
    //Attribute to set the name of an Item
    private String name = "";
    //Attribute to set the cost in GBP of an Item
    private double cost = 0;
    //Attribute to set the quantity of items to be added
    private int quantity = 0;

    public Item() {}

    public Item(String name, double cost, int quantity) {
        this.name = name;
        this.cost = cost;
        this.quantity = quantity;
    }

    /**
     * @return cost * quantity.
     *
     */
    public double getTotalCost() {
        return this.cost * this.quantity;
    }
}
