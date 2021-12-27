/**
 * 
 */
package org.espire.reversestring;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author ankit.jaisawal
 *
 */
public class ReverseStringTest {

	/**
	 * Test method for {@link org.espire.reversestring.ReverseString#reverseString(java.lang.String)}.
	 */
	@Test
	public void testReverseString() {
		//Test cases
		assertEquals("tima",ReverseString.reverseString("amit"));
		assertEquals("lawasiaj",ReverseString.reverseString("jaisawal"));
		assertEquals("yad",ReverseString.reverseString("day"));
	}
	
	/**
	 * 
	 */
	@Test
	public void testReverseStringByMethod() {
		//Test cases
		assertEquals("tima",ReverseStringByMethod.reverseString("amit"));
		assertEquals("lawasiaj",ReverseStringByMethod.reverseString("jaisawal"));
		assertEquals("yad",ReverseStringByMethod.reverseString("day"));
	}

}
