/**
 * 
 */
package org.espire.removeduplicates;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author ankit.jaisawal
 *
 */
public class RemoveDuplicatesTest {

	/**
	 * Test method for {@link org.espire.removeduplicates.RemoveDuplicates#removeDuplicateFromArray(E[])}.
	 */
	@Test
	public void testRemoveDuplicateFromArrayInteger() {

		Integer integerArray[] = { 1, 1, 2, 3,3, 5, 9, 6 };
		RemoveDuplicates.removeDuplicateFromArray(integerArray);
	}
	@Test
	public void testRemoveDuplicateFromArrayString() {

		String str[] = { "Abb", "Abb", "B", "C" };
		RemoveDuplicates.removeDuplicateFromArray(str);
	}
	@Test
	public void testRemoveDuplicateFromArrayCharacter() {

		Character charArray[] = { 'a', 'a', 'B', 'C' };
		RemoveDuplicates.removeDuplicateFromArray(charArray);
	}
}
