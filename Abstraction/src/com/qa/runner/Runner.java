package com.qa.runner;

import com.qa.food.*;

public class Runner {

	public static void main(String[] args) {
		Food myItalianMeal = new Italian();
		Food myMexicanMeal = new Mexican(true, "Burritos", 5.99);
		Italian myBetterItalianMeal = new Italian(false, "Pizza", 10.99);
		System.out.println(myMexicanMeal.isSpicy());
		myMexicanMeal.meal();
		myItalianMeal.meal();
		myBetterItalianMeal.meal();
		
		
	}

}
