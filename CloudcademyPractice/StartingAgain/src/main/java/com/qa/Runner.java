package com.qa;

import java.sql.SQLException;

//TODO Figure out bridge between Controller and DAO in IMS
public class Runner {
	public static void main(java.lang.String[] args) {
		byte myByte = 2;
		short myShort = 4;
		int myInt = 1;
		long myLong = 2467434;
		char myChar = 'C';
		boolean myBool = false;
		
		float myFloat = 34.4434234234234234234f;
		double myDbl = 24.24234234234234234234;
		double floatToDbl = myFloat;
		float dblToFloat = (float) myDbl;
		System.out.println(myDbl);
		System.out.println(dblToFloat);
		System.out.println(myFloat);
		System.out.println(floatToDbl);
	}
}