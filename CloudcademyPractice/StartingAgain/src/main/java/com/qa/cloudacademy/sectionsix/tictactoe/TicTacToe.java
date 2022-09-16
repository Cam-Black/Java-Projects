package com.qa.cloudacademy.sectionsix.tictactoe;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TicTacToe {
	private final Scanner SCAN;
	private List<String> positions = fillPositions();
	
	public TicTacToe() {
		super();
		SCAN = new Scanner(System.in);
	}
	
	public List<String> fillPositions() {
		List<String> setPositions = new ArrayList<>();
		for (Integer i = 1; i < 10; i++) {
			setPositions.add(i.toString());
		}
		return setPositions;
	}
	
	public void board() {
		for (String value : positions) {
			if (Integer.parseInt(value) % 3 == 0 && Integer.parseInt(value) != 9) {
				System.out.print(" " + value + " \n");
				System.out.println("---|---|---");
			} else if (Integer.parseInt(value) == 9) {
				System.out.print(" " + value + " \n");
			} else {
				System.out.print(" " + value + " |");
			}
		}
		System.out.println();
	}
	
	public void playerTurn() {
		System.out.println("Enter a number that appears on the board:");
		
	}
	
}
