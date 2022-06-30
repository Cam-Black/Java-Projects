package com.qa.basket;

import com.qa.basket.item.Item;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class ShoppingBasketTest {

    @Test
    public void totalOfEmptyBasket() {
        ShoppingBasket basket = new ShoppingBasket();
        assertEquals(0.0, basket.getTotal(), 0.0);
    }

    @Test
    public void totalOfSingleItem() {
        ShoppingBasket basket = new ShoppingBasket(Arrays.asList(new Item("Wine", 10.0, 1)));
        assertEquals(10.0, basket.getTotal(), 0.0);
    }

    @Test
    public void totalOfMultipleItems() {
        ShoppingBasket basket = new ShoppingBasket(Arrays.asList(
                new Item("Banana", 0.2, 1),
                new Item("Beer", 5.0, 4)));
        assertEquals(20.2, basket.getTotal(), 0.0);
    }
}
