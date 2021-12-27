/**
 * 
 */
package org.espire.binarysearch;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author ankit.jaisawal
 *
 */
public class BinarySearchTest {

	/**
	 * Test method for {@link org.espire.binarysearch.BinarySearch#binarySearch(int[], int, int, int)}.
	 */
	@Test
	public void testBinarySearch1() {
		//First test case
		Integer array[]= {10,20,30,50,66,88,95};
		Integer expected=4;
		assertEquals(expected, BinarySearch.binarySearch(array, 0, array.length-1, 50));
		
	}
	@Test
	public void testBinarySearch2() {		
		//Second test case
		Integer array1[]= {10,20,30,50,66,88,95};
		Integer expected1=-1;
		assertEquals(expected1, BinarySearch.binarySearch(array1, 0, array1.length-1, 500));
	}

}
