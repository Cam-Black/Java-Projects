package com.qa.generics.items;
import java.util.ArrayList;

public class Item<T> {
	private String name = "";
	private float cost = 0;
	private ArrayList<T> myItems = new ArrayList<>();

	public Item(){};
	public Item(String name, float cost) {
		this.name = name;
		this.cost = cost;
	}

	public ArrayList<T> addItem(T t) {
		myItems.add(t);
		return myItems;
	}

	public void printItems() {
		myItems.forEach(el -> System.out.println(el));
	}
	@Override
	public String toString() {
		return "Item: " + this.name + ", Cost: " + this.cost; 
	}
}