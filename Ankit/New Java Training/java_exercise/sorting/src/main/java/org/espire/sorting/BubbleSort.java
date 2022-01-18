/**
 * 
 */
package org.espire.sorting;

/**
 * @author ankit.jaisawal
 *
 */
public class BubbleSort {

	// function to implement bubble sort and print the sorted array
	public static void bubbleSort(Integer array[]) {
		Integer i, j, temp, len = array.length;
		for (i = 0; i < len; i++) {
			for (j = i + 1; j < len; j++) {
				// Comparing
				if (array[j] < array[i]) {
					// Swapping
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
	}

	// Main method
	public static void main(String[] args) {

		Integer array[] = { 10, 80, 20, 3, 7, 8 };

		// calling bubbleSort() method
		bubbleSort(array);

	}

}
