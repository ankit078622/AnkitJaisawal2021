/**
 * 
 */
package org.espire.sorting;

/**
 * @author ankit.jaisawal
 *
 */
public class InsertionSort {

	/*
	 * function to sort an array with insertion sort
	 */
	public static Integer[] insertionSort(Integer[] array) {
		// Declaring variable
		Integer i, blank, temp = 0;
		Integer len = array.length;

		for (i = 1; i < len; i++) {
			temp = array[i];
			blank = i;

			// Move the elements greater than temp then move element at right
			while (blank > 0 && array[blank - 1] > temp) {
				array[blank] = array[blank - 1];
				blank = blank - 1;
			}
			array[blank] = temp;
		}
		return array;
	}

	// Main method
	public static void main(String args[]) {
		Integer[] array = { 10, 80, 33, 22 };
		Integer i;
		// calling the method
		Integer output[] = insertionSort(array);
		for (i = 0; i < output.length; i++) {
			System.out.println(output[i]);
		}
	}
}
