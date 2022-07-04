package com.qa.machine.drink;

import org.junit.Test;

import static org.junit.Assert.*;

public class DrinksTest {
    @Test
    public void testInstanceOfDrinkEmptyConstructor() {
        assertTrue(new Drinks() instanceof Drinks);
    }

    @Test
    public void testInstanceOfDrinkPopulatedConstructor() {
        assertTrue(new Drinks("Americano", 1.2, 1) instanceof Drinks);
    }

    @Test
    public void testGetPriceNotInitialised() {
        Drinks americano = new Drinks();
        assertEquals(0.0, americano.getPrice(), 0.0);
    }

    @Test
    public void testGetPriceInitialised() {
        Drinks americano = new Drinks("Americano", 1.2, 1);
        assertEquals(1.2, americano.getPrice(), 0.0);
    }

    @Test
    public void testGetTotalPrice() {
        Drinks americano = new Drinks("Americano", 1.2, 2);
        assertEquals(2.4, americano.getTotalPrice(), 0.0);
    }

    @Test
    public void testGetNameIsEmpty() {
        assertEquals("", new Drinks().getName());
    }

    @Test
    public void testGetNameIsNotEmpty() {
        assertEquals("Americano", new Drinks("Americano", 1.2, 1).getName());
    }

    @Test
    public void testGetQuantity() {
        Drinks americano = new Drinks("Americano", 1.2, 1);
        assertEquals(1, americano.getQuantity());
    }

    @Test
    public void testToString() {
        Drinks americano = new Drinks("Americano", 1.2, 1);
        String expectedString = "Drink [Name: " + americano.getName()
                + ", Cost: " + americano.getPrice() + ", Quantity: "
                + americano.getQuantity() + "]";
        assertEquals(expectedString, americano.toString());
    }
}