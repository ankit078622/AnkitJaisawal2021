package org.espire.primenumber;

public class PrimeNumber {

	/*
	 * checking whether number is prime or not
	 */
	public static boolean isPrime(Integer number) {

		// Variable for loop
		Integer i;

		if (number <= 1) {
			return false;
		} else {
			for (i = 2; i <= number / 2; i++) {

				if (number % i == 0) {
					return false;
				}
			}
			return true;
		}
	}

	public static void main(String args[]) {

		// Calling method and print the output
		System.out.println(PrimeNumber.isPrime(5));

	}
}
