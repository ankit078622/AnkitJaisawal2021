/*
-> java string valueOf() method converts different types of values into string. 
	By the help of string valueOf() method, you can convert int to string, long to 
	string, boolean to string, character to string, float to string, double to string, 
	object to string and char array to string.
 */
package com.StirngHandling;

public class ValuOfMethod {
	
	public static void main(String args[]) {
		
		char char1='A';
		char char2='n';
		char char3='k';
		char char4='i';
		char char5='t';
		
		String s=String.valueOf(char1);
		s=s+String.valueOf(char2);
		s=s+String.valueOf(char3);
		s=s+String.valueOf(char4);
		s=s+String.valueOf(char5);
		System.out.println("The string is : "+s);
	}

}
