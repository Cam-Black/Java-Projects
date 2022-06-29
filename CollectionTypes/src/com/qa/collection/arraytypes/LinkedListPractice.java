package com.qa.collection.arraytypes;

import java.util.LinkedList;

public class LinkedListPractice {
	LinkedList<String> teams = new LinkedList<String>();
	
	public LinkedList<String> addTeams(String team) {
		teams.add(team);
		return teams;
	}
	
	@Override
	public String toString() {
		return "Teams: " + teams;
	}
}