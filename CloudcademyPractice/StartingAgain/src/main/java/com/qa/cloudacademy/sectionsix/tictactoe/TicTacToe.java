package com.qa.cloudacademy.sectionsix.tictactoe;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Predicate;

public class TicTacToe {
	private final Scanner SCAN;
	
	public TicTacToe() {
		super();
		SCAN = new Scanner(System.in);
	}
	
	public String[][] createBoard() {
		String[][] board = new String[6][3];
		int k = 1;
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				if (i % 2 == 0) {
					board[i][j] = "----";
				} else {
					board[i][j] = "| " + k + " ";
					k++;
				}
			}
		}
		return board;
	}
	
	public void printBoard(String[][] board) {
		for (String[] arr : board) {
			for (String space : arr) {
				System.out.print(space);
			}
			System.out.println();
		}
	}
	
	public void userInput(String[][] board) {
		String input = SCAN.nextLine();
		Arrays.stream(board).forEach((el) -> el.equals(input) ? el[el] = "X" : null);
	}
}
