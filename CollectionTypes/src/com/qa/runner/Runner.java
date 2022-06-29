package com.qa.runner;

import java.util.ArrayList;

import com.qa.collection.arraytypes.ArrayListPractice;
import com.qa.collection.arraytypes.ArrayPractice;
import com.qa.collection.arraytypes.LinkedListPractice;
import com.qa.collection.enums.Pizza;
import com.qa.collection.hashing.HashMapPractice;
import com.qa.collection.hashing.HashSetPractice;

public class Runner {
	public static void main(String[] args) {
		ArrayPractice myArr = new ArrayPractice();
		System.out.println(myArr.toString());
		
		ArrayListPractice myArrList = new ArrayListPractice();
		myArrList.addNums(1);
		myArrList.addNums(2);
		myArrList.addNums(3);
		System.out.println(myArrList.toString());
		
		ArrayList<String> team = new ArrayList<String>();
		ArrayList<String> newTeam = new ArrayList<String>();
		team.add("Cam");
		team.add("Dev");
		team.add("Erhan");
		
		int ranNum = 0;
		ranNum = (int) (Math.floor(Math.random() * team.size()));
		
		newTeam.add(team.get(ranNum));
		team.remove(ranNum);
		System.out.println(team + " " + newTeam);
		
		LinkedListPractice fOneTeams = new LinkedListPractice();
		fOneTeams.addTeams("Red Bull");
		fOneTeams.addTeams("Mercedes");
		fOneTeams.addTeams("Ferrari");
		
		System.out.println(fOneTeams);
		
		HashSetPractice myCars = new HashSetPractice();
		myCars.addCars("Porsche");
		System.out.println(myCars);
		
		HashMapPractice driverRanks = new HashMapPractice();
		driverRanks.addDriver(1, "Max Verstappen");
		driverRanks.addDriver(2, "Sergio Perez");
		System.out.println(driverRanks);
		
		for (Pizza p : Pizza.values()) {
			System.out.println(p);
		}
		System.out.println(Pizza.orderPizza("Pepperoni"));
	}
}
