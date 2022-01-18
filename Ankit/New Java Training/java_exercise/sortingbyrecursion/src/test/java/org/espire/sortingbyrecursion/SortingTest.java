package org.espire.sortingbyrecursion;

import static org.junit.Assert.*;

import org.junit.Test;

public class SortingTest {

	Integer[] array = { 10, 9, 20, 50, 30 };
	Integer[] sortedArray = { 9,10,20,30,50};
	// For second test case
	Integer[] array1 = { 10, 80, 33, 22, 7, 4, 2, 1 };
	Integer[] sortedArray1 = { 1, 2, 4, 7, 10, 22, 33, 80 };
	
	@Test
	public void testBubbleSort1() {
		BubbleSort.bubbleSort(array, array.length);
		assertArrayEquals(sortedArray, array);
	}
	@Test
	public void testBubbleSort2() {
		BubbleSort.bubbleSort(array1, array1.length);
		assertArrayEquals(sortedArray1, array1);
	}

}
