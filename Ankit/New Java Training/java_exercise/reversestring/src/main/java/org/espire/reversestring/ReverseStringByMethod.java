package org.espire.reversestring;

public class ReverseStringByMethod {

	/*
	 * Program to reverse string using substring method
	 */
	/**
	 * @param str
	 * @return
	 */
	public static String reverseString(String str) {
		//Here we are using the recursive approach
		if(str.length()<=1) {
			return str;
		}
		//Recursive approach
		return str.substring(str.length()-1)+reverseString(str.substring(0,str.length()-1));
	}
	
	//Main method
	public static void main(String args[]) {
		//Calling and printing the output
		System.out.println(reverseString("aavaaab"));
	}
}
