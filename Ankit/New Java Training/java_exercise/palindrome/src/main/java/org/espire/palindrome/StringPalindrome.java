package org.espire.palindrome;

import java.util.Scanner;

public class StringPalindrome {

	/*
	 * Method to check string is palindrome or not.
	 */
	public static String isPalindrome(String string1) {
		// Variable for empty string
		String stringReverse = "";
		Integer i;

		// Reading string from end to first
		for (i = string1.length() - 1; i >= 0; i--) {
			stringReverse = stringReverse + Character.toString(string1.charAt(i));
		}

		// Comparing the string
		if (string1.equals(stringReverse)) {
			return "The string is palindrome";
		} else {
			return "The string is not palindrome";
		}
	}

	// Main method
	public static void main(String args[]) {

		// Creating object of scanner class
		Scanner sc = new Scanner(System.in);

		// Taking users input
		String input = sc.nextLine();

		// Calling method to check string is palindrome or not
		isPalindrome(input);
	}
}
