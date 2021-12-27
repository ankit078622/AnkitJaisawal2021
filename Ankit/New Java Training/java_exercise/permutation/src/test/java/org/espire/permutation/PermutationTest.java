/**
 * 
 */
package org.espire.permutation;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author ankit.jaisawal
 *
 */
public class PermutationTest {

	/**
	 * Test method for {@link org.espire.permutation.Permutation#findPermutation(java.lang.String, java.lang.Integer, java.lang.Integer)}.
	 */
	@Test
	public void testFindPermutation1() {
		Permutation.findPermutation("ABCD", 0, 3);
	}

	@Test
	public void testFindPermutation2() {
		Permutation.findPermutation("ABC", 0, 2);
	}
}
