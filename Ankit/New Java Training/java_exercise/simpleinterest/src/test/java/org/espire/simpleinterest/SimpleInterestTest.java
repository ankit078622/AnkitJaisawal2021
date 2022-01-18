/**
 * 
 */
package org.espire.simpleinterest;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author ankit.jaisawal
 *
 */
public class SimpleInterestTest {

	/**
	 * Test method for
	 * {@link org.espire.simpleinterest.SimpleInterest#simpleInterest(java.lang.Integer, java.lang.Integer, java.lang.Integer)}.
	 */
	@Test
	public void testSimpleInterest1() {
		Integer output = 500;
		assertEquals(output, SimpleInterest.simpleInterest(5000, 10, 1));
	}

	@Test
	public void testSimpleInterest2() {
		Integer output = 2000;
		assertEquals(output, SimpleInterest.simpleInterest(10000, 10, 2));
	}

	@Test
	public void testSimpleInterest3() {
		Integer output = 7500;
		assertEquals(output, SimpleInterest.simpleInterest(10000, 15, 5));
	}

}
