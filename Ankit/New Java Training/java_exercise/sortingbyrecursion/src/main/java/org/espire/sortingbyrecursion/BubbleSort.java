package org.espire.sortingbyrecursion;

import java.util.Arrays;

public class BubbleSort {
	public static Integer bubbleSort(Integer array[], Integer size) {
		/**
		 * Base case
		 */
		if (size == 1) {
			return array[0];
		}

		/**
		 * After this loop largest element is moved to end
		 */
		for (Integer i = 0; i < size - 1; i++) {
			if (array[i] > array[i + 1]) {
				Integer temp = array[i];
				array[i] = array[i + 1];
				array[i + 1] = temp;
			}
		}

		/**
		 * recursive calling
		 */
		return bubbleSort(array, size - 1);
	}

	/**
	 * Main method
	 */
	public static void main(String[] args) {
		Integer array[] = { 6, 99, 55, 34, 23, 12 };
		bubbleSort(array, array.length);
		System.out.println("Sorted array : ");
		System.out.println(Arrays.toString(array));

	}

}
