/**
 * 
 */
package org.espire.squareroot;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author ankit.jaisawal
 *
 */
public class SquareRootTest {

	/**
	 * Test method for {@link org.espire.squareroot.SquareRoot#checkRoot(int)}.
	 */
	@Test
	public void testCheckRoot() {
		assertEquals(1.7320508075688772, SquareRoot.findSquareRoot(3), 1.7320508075688772);
	}

}
