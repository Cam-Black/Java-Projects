package com.qa.generics;

import com.qa.generics.items.Item;

public class Runner {

	public static void main(String[] args) {
		Item<Object> items = new Item<>();
		items.addItem(new Item<>("Pear", 1.50f));
		items.addItem(new Item<>("Apple", 1.20f));
		items.printItems();

	}
}