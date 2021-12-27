package org.espire.sorting;

public class IterativeQuickSort {
	/**
	 * This function takes last element as pivot, places the pivot element at its
	 * correct position in sorted array, and places all smaller (smaller than pivot)
	 * to left of pivot and all greater elements to right of pivot
	 */
	public static Integer partition(Integer array[], Integer low, Integer high) {
		Integer pivot = array[high];

		// index of smaller element
		Integer i = (low - 1);
		for (Integer j = low; j <= high - 1; j++) {
			// If current element is smaller than or
			// equal to pivot
			if (array[j] <= pivot) {
				i++;

				// swap arr[i] and arr[j]
				Integer temp = array[i];
				array[i] = array[j];
				array[j] = temp;
			}
		}

		// swap arr[i+1] and arr[high] (or pivot)
		Integer temp = array[i + 1];
		array[i + 1] = array[high];
		array[high] = temp;

		return i + 1;
	}

	/*
	 * A[] --> Array to be sorted
	 */
	public static void quickSortIterative(Integer array[], Integer startIndex, Integer endIndex) {
		// Creating stack
		Integer[] stack = new Integer[endIndex - startIndex + 1];

		// initialize top of stack
		Integer top = -1;

		// push initial values of startIndex and endIndex to stack
		stack[++top] = startIndex;
		stack[++top] = endIndex;

		// Keep popping from stack while is not empty
		while (top >= 0) {
			// Pop endIndex and startIndex
			endIndex = stack[top--];
			startIndex = stack[top--];

			// Set pivot element at its correct position
			// in sorted array
			Integer p = partition(array, startIndex, endIndex);

			// If there are elements on left side of pivot,
			// then push left side to stack
			if (p - 1 > startIndex) {
				stack[++top] = startIndex;
				stack[++top] = p - 1;
			}

			// If there are elements on right side of pivot,
			// then push right side to stack
			if (p + 1 < endIndex) {
				stack[++top] = p + 1;
				stack[++top] = endIndex;
			}
		}
	}

	// Main method
	public static void main(String args[]) {
		Integer array[] = { 10,50,99,33,22,66,88,99 };
	

		// Function calling
		quickSortIterative(array, 0, array.length-1);

		for (Integer i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}
}
