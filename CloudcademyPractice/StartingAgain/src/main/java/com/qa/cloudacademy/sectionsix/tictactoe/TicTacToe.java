package com.qa.cloudacademy.sectionsix.tictactoe;

import java.util.ArrayList;
import java.util.InputMismatchException;
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
			setPositions.add(String.valueOf(i));
		}
		return setPositions;
	}
	
	public void board() {
		for (int i = 1; i < positions.size() + 1; i++) {
			if (i % 3 == 0 && i != 9) {
				System.out.print(" " + positions.get(i - 1) + " \n");
				System.out.println("---|---|---");
			} else if (i == 9) {
				System.out.print(" " + positions.get(i - 1) + " \n");
			} else {
				System.out.print(" " + positions.get(i - 1) + " |");
			}
		}
		System.out.println();
	}
	
	public void playerTurn() {
		board();
		String position;
		do {
			System.out.println("Enter a number on the board:");
			position = SCAN.nextLine();
		}
		while (!getInput(position));
	}
	
	public boolean getInput(String position) {
		
		try {
			positions.set(Integer.parseInt(position) - 1, "X");
			return true;
		} catch (NumberFormatException | IndexOutOfBoundsException | InputMismatchException e) {
			System.err.println(position + " is not a valid number on the board, try again!");
			return false;
		}
	}
	
	public boolean isFull() {
		return positions.stream().allMatch((el) -> el.equals("X") || el.equals("O"));
	}
	
	public void playGame() {
		boolean play = true;
		String yOrN;
		
		while (play) {
			while (!isFull()) {
				playerTurn();
			}//end !isFull While
			SCAN.nextLine();
			System.out.println("Would you like to play again? Y/N");
			yOrN = SCAN.nextLine();
			if (yOrN.equals("N")) {
				play = false;
			} else {
				positions = fillPositions();
			}
		}//end play While
	}
}
