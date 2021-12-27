package org.espire.armstrongnumber;

import java.util.Scanner;

public class ArmstrongNumber {

	/*
	 * Method to check Armstrong number
	 */
	public static Boolean isArmstrongNumber(int number) {

		//Variable to update the status
		Boolean status = false;
		// Declaring and initializing variable with zero
		Integer sum = 0, remainder = 0;
		Integer temp = number;

		// Loop for dividing number and find cubic sum of the number
		while (temp > 0) {
			remainder = temp % 10;
			sum = sum + (remainder * remainder * remainder);
			temp = temp / 10;
		}

		// Checking
		if (number == sum) {
			status = true;
		}
		return status;
	}

	// Main method
	public static void main(String args[]) {

		// Creating object of scanner class
		Scanner sc = new Scanner(System.in);

		// Taking input from the user
		int input = sc.nextInt();

		// calling isArmstrongNumber() method
		Boolean output = isArmstrongNumber(input);
		if(output=true) {
			System.out.println("Armstrong number");
		}
		else {
			System.out.println("Not armstrong number");
		}
	}
}
