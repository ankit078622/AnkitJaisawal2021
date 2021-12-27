package org.espire.squareroot;

/**
 * @author ankit.jaisawal
 *
 */
public class SquareRoot {
	/*
	 * Method to find the Square root of a number
	 */
	public static double findSquareRoot(int n) {

		double squareRoot, result;

		// approximate by half of the given number
		squareRoot = n / 2;

		// until the difference of approximate value and root value is not equal to 0
		do {
			result = squareRoot;
			squareRoot = (result + (n / result)) / 2;
		} while ((result - squareRoot) != 0);

		return squareRoot;

	}

	public static void main(String args[]) {

		System.out.println(SquareRoot.findSquareRoot(3));

	}
}
