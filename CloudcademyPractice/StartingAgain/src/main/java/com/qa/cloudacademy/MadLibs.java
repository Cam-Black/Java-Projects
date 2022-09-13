package com.qa.cloudacademy;

import java.util.Scanner;

public class MadLibs {
	public static void main(String[] args) {
		String adjOne, girlsName, adjTwo, occOne, kingdom, clothing, hobby, adjThree, occTwo, boysName, father;
		Scanner s = new Scanner(System.in);
		
		System.out.println("Type an adjective:");
		adjOne = s.nextLine();
		
		System.out.println("Next, type a girls name:");
		girlsName = s.nextLine();
		
		System.out.println("Now another adjective:");
		adjTwo = s.nextLine();
		
		System.out.println("Then an occupation:");
		occOne = s.nextLine();
		
		System.out.println("Now we need a location:");
		kingdom = s.nextLine();
		
		System.out.println("And type of clothing:");
		clothing = s.nextLine();
		
		System.out.println("Now for a hobby:");
		hobby = s.nextLine();
		
		System.out.println("A final adjective:");
		adjThree = s.nextLine();
		
		System.out.println("Another occupation:");
		occTwo = s.nextLine();
		
		System.out.println("A name for a boy:");
		boysName = s.nextLine();
		
		System.out.println("And finally a name for a man:");
		father = s.nextLine();
		
		String story =
				"There once was a " + adjOne + " girl named " + girlsName + " who was a " + adjTwo + " " + occOne +
						" in the " + "kingdom" + " of " + kingdom + ".\nShe loved to wear some sort of " +
						clothing + " and to " + hobby + ".\nShe wanted to marry the " + adjThree + " " + occTwo +
						" named " + boysName + ".\nBut her father, King " + father + " forbid her from seeing him.";
		System.out.println(story);
	}
}
