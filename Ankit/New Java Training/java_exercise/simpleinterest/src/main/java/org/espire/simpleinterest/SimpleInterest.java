package org.espire.simpleinterest;

public class SimpleInterest {

	/**
	 * 
	 * @param <E>
	 * @param principle
	 * @param interestRate(in Percentage)
	 * @param timeDuration(in Year)
	 */
	public static Integer simpleInterest(Integer principle, Integer interestRate, Integer timeDuration) {
		Integer simpleInterest = 0;
		simpleInterest = (principle * interestRate * timeDuration) / 100;
		return simpleInterest;
	}

	public static void main(String[] args) {
		// Calling the simpleInterest() method
		System.out.println(simpleInterest(10000, 15, 5));
	}
}
