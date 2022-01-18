/**
 * 
 */
package org.espire.sorting;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author ankit.jaisawal
 *
 */
public class Sorting {

	/**
	 * Test method for
	 * {@link org.espire.sorting.InsertionSort#insertionSort(int[])}.
	 */
	Integer[] array = { 10, 9, 20, 50, 30 };
	Integer[] sortedArray = { 9,10,20,30,50};
	// For second test case
	Integer[] array1 = { 10, 80, 33, 22, 7, 4, 2, 1 };
	Integer[] sortedArray1 = { 1, 2, 4, 7, 10, 22, 33, 80 };

	// Test cases for insertion sort
	@Test
	public void testInsertionSort1() {
		InsertionSort.insertionSort(array);
		assertArrayEquals(sortedArray, array);
	}

	@Test
	public void testInsertionSort2() {
		// Second test case
		InsertionSort.insertionSort(array1);
		assertArrayEquals(sortedArray1, array1);

	}

	// Test cases for bubble sort
	@Test
	public void testBubbleSort1() {
		BubbleSort.bubbleSort(array);
		assertArrayEquals(sortedArray, array);
	}

	@Test
	public void testBubbleSort2() {
		BubbleSort.bubbleSort(array);
		assertArrayEquals(sortedArray, array);
	}
	
	//Test cases of quick sort
	@Test
	public void testQuickSort1() {
		QuickSort.quick(array, 0, array.length-1);
		assertArrayEquals(sortedArray, array);
	}

	@Test
	public void testQuickSort2() {
		QuickSort.quick(array1, 0, array1.length-1);
		assertArrayEquals(sortedArray1, array1);
	}
	
	//Test case for mergesort
	@Test
	public void testMergeSort1() {
		MergeSort.mergerSort(array, new Integer[array.length], 0, array.length - 1);
		assertArrayEquals(sortedArray, array);
	}

	@Test
	public void testMergeSort2() {
		MergeSort.mergerSort(array1, new Integer[array1.length], 0, array1.length - 1);
		assertArrayEquals(sortedArray1, array1);
	}
	
	//Test case for iterative quick sort
	@Test
	public void testIterativeQuickSort1() {
		IterativeQuickSort.quickSortIterative(array, 0, array.length - 1);
		assertArrayEquals(sortedArray, array);
	}

	@Test
	public void testIterativeQuickSort2() {
		IterativeQuickSort.quickSortIterative(array1,0, array1.length - 1);
		assertArrayEquals(sortedArray1, array1);
	}


}
