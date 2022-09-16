package com.qa.cloudacademy.sectionsix;

import java.util.Random;

public class FunWith2DArrays {
	public static void main(String[] args) {
		int[][] my2DArr = new int[3][3];
		fill2DArray(my2DArr);
		print2DArray(my2DArr);
		twice2DArray(my2DArr);
		print2DArray(my2DArr);
	}
	
	public static void fill2DArray(int[][] twoDArr) {
		Random rand = new Random();
		for (int i = 0; i < twoDArr.length; i++) {
			for (int j = 0; j < twoDArr.length; j++) {
				twoDArr[i][j] = rand.nextInt(100);
			}
		}
	}
	
	public static void print2DArray(int[][] twoDArr) {
		for (int[] arr : twoDArr) {
			for (int num : arr) {
				System.out.print(num + " ");
			}
			System.out.println();
		}
	}
	
	public static void twice2DArray(int[][] twoDArr) {
		for (int i = 0; i < twoDArr.length; i++) {
			for (int j = 0; j < twoDArr.length; j++) {
				twoDArr[i][j] *= 2;
			}
		}
	}
}
