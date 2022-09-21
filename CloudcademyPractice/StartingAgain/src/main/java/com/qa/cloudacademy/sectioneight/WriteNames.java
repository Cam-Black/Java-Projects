package com.qa.cloudacademy.sectioneight;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WriteNames {
	
	public static void main(String[] args) {
		Scanner s;
		List<String> names = fillList();
		
		try {
			PrintWriter pw = new PrintWriter("./src/main/resources/names.txt");
			for (String name : names) {
				pw.println(name);
			}
			pw.close();
			s = new Scanner(new File("./src/main/resources/names.txt"));
			while (s.hasNextLine()) {
				System.out.println(s.nextLine());
			}
		} catch (FileNotFoundException fnfe) {
			System.err.println(fnfe.getMessage());
		}
	}
	
	public static List<String> fillList() {
		List<String > populate = new ArrayList<>();
		populate.add("Obi-Wan Kenobi");
		populate.add("General Grevious");
		populate.add("Anakin Skywalker");
		populate.add("Master Yoda");
		populate.add("Mace Windu");
		return populate;
	}
}
