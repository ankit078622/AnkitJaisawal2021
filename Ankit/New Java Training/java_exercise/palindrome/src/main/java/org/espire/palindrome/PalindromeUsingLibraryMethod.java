package org.espire.palindrome;

import java.util.Scanner;

public class PalindromeUsingLibraryMethod {

	// Returning true if string is palindrome
	public static boolean isPalindrome(String string1) {

		Boolean status = true;
		// declaring and initializing variable by zero
		int i = 0, stringLength = 0;

		// Storing length of string
		stringLength = string1.length() - 1;

		while (stringLength > i) {

			// Checking if there is mismatch
			if (string1.charAt(i) != string1.charAt(stringLength)) {
				status = false;
			}

			// Incrementing 'i' and decrementing 'stringLength'
			i++;
			stringLength--;
		}
		// String is palindrome
		return status;
	}

	// Main method
	public static void main(String args[]) {

		// Creating object of scanner class
		Scanner sc = new Scanner(System.in);

		// Taking input
		String input = sc.nextLine();

		// Checking and then printing the output
		if (isPalindrome(input)) {
			System.out.println("String is palindrome");
		} else {
			System.out.println("String is not palindrome");
		}
	}
}
