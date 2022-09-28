package com.qa.handsonlabs;

/*

This exercise doesn't come with any starter implementation.
This is so that you get to practice creating classes and methods
which is an important part of programming in Java.

*/
public class BeerSong {
	public BeerSong() {
	}
	
	public String genericVerse(int i) {
		return i + " bottles of beer on the wall, " +
				i + " bottles of beer.\nTake one down and pass it around, " + (i - 1) + " bottles of beer on the wall" +
				".\n\n";
	}
	
	public String goingToSingleBottleVerse() {
		return "2 bottles of beer on the wall, 2 bottles of beer.\n" +
				"Take one down and pass it around, 1 bottle of beer on the wall.\n\n";
	}
	public String singleBottleVerse() {
		return "1 bottle of beer on the wall, 1 bottle of beer.\nTake it down and pass it around, no more " +
				"bottles of beer on the wall.\n\n";
	}
	
	public String finalVerse() {
		return "No more bottles of beer on the wall, no more bottles of beer.\nGo to the store and buy some more, 99" +
				" " +
				"bottles of beer on the wall.\n\n";
	}
	
	public String sing(int i, int j) {
		String song = "";
		
		for (int k = i; k > i - j; k--) {
			if (k == 2) {
				song += goingToSingleBottleVerse();
			} else if (k == 1) {
				song += singleBottleVerse();
			} else if (k == 0) {
				song += finalVerse();
			} else {
				song += genericVerse(k);
			}
		}
		return song;
	}
	
	public String singSong() {
		String song = "";
		for (int i = 99; i >= 0; i--) {
			if (i == 2) {
				song += goingToSingleBottleVerse();
			} else if (i == 1) {
				song += singleBottleVerse();
			} else if (i == 0) {
				song += finalVerse();
			} else {
				song += genericVerse(i);
			}
		}
		return song;
	}
}