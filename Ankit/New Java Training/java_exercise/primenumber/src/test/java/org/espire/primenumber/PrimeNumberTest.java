/**
 * 
 */
package org.espire.primenumber;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author ankit.jaisawal
 *
 */
public class PrimeNumberTest {

	/**
	 * Test method for
	 * {@link org.espire.primenumber.PrimeNumber#isPrime(java.lang.Integer)}.
	 */
	@Test
	public void testIsPrime1() {
		assertEquals(true, PrimeNumber.isPrime(5));
	}

	@Test
	public void testIsPrime2() {
		assertEquals(false, PrimeNumber.isPrime(4));
	}

}
