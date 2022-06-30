package com.qa.generics;

import com.qa.generics.items.Item;

public class Runner {

	public static void main(String[] args) {
		Item<Object> item1 = new Item<>("Apple", 1.99f);
		item1.addItem(item1);
		item1.printItems();
	}
}