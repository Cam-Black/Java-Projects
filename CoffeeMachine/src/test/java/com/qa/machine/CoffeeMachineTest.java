package com.qa.machine;

import com.qa.machine.drink.Drinks;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CoffeeMachineTest {

    @Test
    public void testGetCreditIsZero() {
        CoffeeMachine machine = new CoffeeMachine();
        assertEquals(0.0, machine.getCredit(), 0.0);
    }

    @Test
    public void testGetCreditIsNotZero() {
        CoffeeMachine machine = new CoffeeMachine(10);
        assertEquals(10.0, machine.getCredit(), 0.0);
    }

    @Test
    public void testAddCredit() {
        CoffeeMachine machine = new CoffeeMachine(10);
        assertEquals(20.0, machine.addCredit(10), 0.0);
    }

    @Test
    public void testOrderDrinkEnoughCredit() {
        CoffeeMachine machine = new CoffeeMachine(10);
        Drinks americano = new Drinks("Americano", 1.20, 1);
        String expectedString = americano.getName() + ": " + americano.getTotalPrice() +"\nCredit remaining: "
                + (machine.getCredit() - americano.getTotalPrice());
        assertEquals(expectedString, machine.orderDrink(americano));
    }

    @Test
    public void testGetPrice() {
        CoffeeMachine machine = new CoffeeMachine(1);
        assertEquals(1, machine.getCredit(), 0.0);
    }

    @Test
    public void testOrderDrinkNotEnoughCredit() {
        CoffeeMachine machine = new CoffeeMachine();
        Drinks americano = new Drinks("Americano", 1.20, 1);
        String expectedReturn = "Credit: " + machine.getCredit() + "\nDrink cost: "
                + americano.getTotalPrice() + "\nAdd More Credit!";
        assertEquals(expectedReturn, machine.orderDrink(americano));
    }
}
