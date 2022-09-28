package com.qa.handsonlabs.bulkdiscount;

public class BulkDiscounter {
	private static final double COST_FIRST_1000 = 2.25;
	private static final double COST_NEXT_2000 = 2.00;
	private static final double COST_REST_RED = 1.5;
	private static final double COST_REST_GREEN = 1.3;
	
	public static double getVolumeDiscount(BalloonOrder order) {
		//Note: you must reuse the provided partial implementation above without changing it
		//Hint 1: first 1000 balloons sold at 2.25 per item
		//Hint 2: next 2000 balloons sold at 2.00 per item
		//Hint 3.1: all remaining balloons charged at 1.50 per item - when order is for RED balloons
		//Hint 3.1: all remaining balloons charged at 1.30 per item - when order is for GREEN balloons
		//Hint 4: open the integrated terminal and run the command "gradle test" to execute all tests
		
		double sum = 0;
		int items = order.getCount();
		String colour = order.getColour();
		
		//your implementation goes here
		int anyRemaining = items - 3000;
		
		double costFirstThousand = 1000 * COST_FIRST_1000;
		double costNextTwoThousand = 2000 * COST_NEXT_2000;

		if (items <= 1000) {
			sum = costFirstThousand;
		} else if (items <= 3000) {
			sum = costFirstThousand + ((items - 1000) * COST_NEXT_2000);
		} else if (colour.equals("RED")) {
			sum = costFirstThousand + costNextTwoThousand + (anyRemaining * COST_REST_RED);
		} else if (colour.equals("GREEN")) {
			sum = costFirstThousand + costNextTwoThousand + (anyRemaining * COST_REST_GREEN);
		}
		return sum;
	}
}