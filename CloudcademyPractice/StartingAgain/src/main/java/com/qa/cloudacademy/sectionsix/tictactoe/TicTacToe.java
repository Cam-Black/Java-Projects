package com.qa.cloudacademy.sectionsix.tictactoe;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class TicTacToe {
	private final Scanner SCAN;
	
	private int player = 1;
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
		String position;
		do {
			System.out.println("Enter a number on the board:");
			position = SCAN.nextLine();
		} while (!getInput(position));
		checkIsWinnerOrFull();
	}
	
	public boolean getInput(String position) {
		try {
			if (positions.get(Integer.parseInt(position) - 1).equals("X") ||
					positions.get(Integer.parseInt(position) - 1).equals("O")) {
				System.out.println("There is already something there!");
				return false;
			}
			positions.set(Integer.parseInt(position) - 1, "X");
			return true;
		} catch (NumberFormatException | IndexOutOfBoundsException | InputMismatchException e) {
			System.err.println(position + " is not a valid number on the board, try again!");
			return false;
		}
	}
	
	public void computerTurn() {
		if (!isWinner() && !isFull()) {
			int position;
			do {
				position = (int) Math.floor(Math.random() * positions.size());
			} while (positions.get(position).equals("X") || positions.get(position).equals("O"));
			positions.set(position, "O");
			System.out.println("Computer turn: " + (position + 1));
			checkIsWinnerOrFull();
		}
	}
	
	public void changePlayer() {
		if (player == 1) {
			player++;
		} else if (player == 2) {
			player--;
		}
	}
	
	public void checkIsWinnerOrFull() {
		if (isWinner()) {
			if (player == 1) {
				board();
				System.out.println("Congratulations, you win");
			} else if (player == 2) {
				board();
				System.out.println("The computer won, unlucky!");
			}
		} else if (isFull()) {
			board();
			System.out.println("It's a tie!");
		} else {
			board();
			changePlayer();
		}
	}
	
	public boolean isFull() {
		return positions.stream().allMatch((el) -> el.equals("X") || el.equals("O"));
	}
	
	public boolean isWinner() {
		if (positions.get(0).equals(positions.get(1)) && positions.get(1).equals(positions.get(2))) {
			return true;
		}
		if (positions.get(3).equals(positions.get(4)) && positions.get(4).equals(positions.get(5))) {
			return true;
		}
		if (positions.get(6).equals(positions.get(7)) && positions.get(7).equals(positions.get(8))) {
			return true;
		}
		if (positions.get(0).equals(positions.get(3)) && positions.get(3).equals(positions.get(6))) {
			return true;
		}
		if (positions.get(1).equals(positions.get(4)) && positions.get(4).equals(positions.get(7))) {
			return true;
		}
		if (positions.get(2).equals(positions.get(5)) && positions.get(5).equals(positions.get(8))) {
			return true;
		}
		if (positions.get(0).equals(positions.get(4)) && positions.get(4).equals(positions.get(8))) {
			return true;
		}
		if (positions.get(2).equals(positions.get(4)) && positions.get(4).equals(positions.get(6))) {
			return true;
		}
		return false;
	}
	
	public void playGame() {
		boolean play = true;
		String yOrN;
		while (play) {
			board();
			while (!isFull() && !isWinner()) {
				playerTurn();
				computerTurn();
			}//end !isFull While
			System.out.println("Would you like to play again? Y/N");
			yOrN = SCAN.nextLine();
			if (yOrN.equalsIgnoreCase("N")) {
				play = false;
			} else {
				positions = fillPositions();
			}
		}//end play While
	}
}