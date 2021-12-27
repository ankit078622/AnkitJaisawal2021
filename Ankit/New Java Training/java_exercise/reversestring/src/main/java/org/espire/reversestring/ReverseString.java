package org.espire.reversestring;

import java.util.Scanner;

public class ReverseString {

	/*
	 * Program to find reverse of string
	 */
	public static String reverseString(String str) {
		
		//Declaring variable
		int i;
		
		//Initializing character array
		char [] stringChar=str.toCharArray();
		
		//Declaring empty string
		String revString="";
		
		//Retrieving char from array
		for(i=str.length()-1;i>=0;i--) {
			revString=revString+stringChar[i];
		}
		return revString;
	}
	
	//Main method
	public static void main(String args[]) {
		
		//Creating object of scanner class
		Scanner sc=new Scanner(System.in);
		
		//Taking input
		String str=sc.nextLine();
		
		//Calling the method and printing the output
		System.out.println(reverseString(str));
		
	}
}
