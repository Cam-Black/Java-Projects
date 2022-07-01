package com.qa.basket;

import com.qa.basket.item.Item;
import java.util.List;
import static java.util.Objects.isNull;

/**
 * <p>Shopping basket class allows us to create a list of items and add it to our basket<br>
 * Cost is then calculated by individual item's cost * quantity,
 * <em>see: {@link com.qa.basket.item.Item#getTotalCost()  totalCost() method}</em></p>
 */
public class ShoppingBasket {
    private List<Item> items;
    public ShoppingBasket(){}
    public ShoppingBasket(List<Item> items) {
        this.items = items;
    }
    public double getTotal() {
        if (isNull(items)) {
            return 0;
        } else {
            double runningTotal =
                    items.stream()
                            .map(x -> x.getTotalCost())
                            .reduce(0.0, (a, b) -> a + b);
            return runningTotal;
        }
    }
}
