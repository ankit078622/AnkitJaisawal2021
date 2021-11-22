package com.StirngHandling;

public class StringCompareToMethod {
	
	public static void main(String args[]) {
		
		//compareTo() method working demo
		/*
		 Java String class compareTo() method compares the given string with the 
		 current string lexicographically. It returns a positive number, negative 
		 number, or 0. 
		 compares strings on the basis of the Unicode value of each character in the strings
		 */
		String s1="hello";
		String s2="hello";
		String s3="nice";
		String s4="excelent";
		System.out.println(s1.compareTo(s2));//return 0
		System.out.println(s1.compareTo(s3));//return -6
		System.out.println(s1.compareTo(s4));//return 3
		System.out.println(s3.compareTo(s4));//return 9
	}


}
