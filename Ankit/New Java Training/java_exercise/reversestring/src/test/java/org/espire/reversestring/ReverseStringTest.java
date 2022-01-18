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
	public void testReverseString1() {
		//Test cases
		assertEquals("tima",ReverseString.reverseString("amit"));
	}
	@Test
	public void testReverseString2() {
		//Test cases
		assertEquals("lawasiaj",ReverseString.reverseString("jaisawal"));
	}
	@Test
	public void testReverseString3() {
		//Test cases
		assertEquals("yad",ReverseString.reverseString("day"));
	}
	
	/**
	 * 
	 */
	@Test
	public void testReverseStringByMethod1() {
		//Test cases
		assertEquals("tima",ReverseStringByMethod.reverseString("amit"));
	}

	@Test
	public void testReverseStringByMethod2() {
		//Test cases
		assertEquals("lawasiaj",ReverseStringByMethod.reverseString("jaisawal"));
	}
	@Test
	public void testReverseStringByMethod3() {
		//Test cases
		assertEquals("yad",ReverseStringByMethod.reverseString("day"));
	}
}
