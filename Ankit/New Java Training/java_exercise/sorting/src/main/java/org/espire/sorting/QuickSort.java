package org.espire.sorting;

public class QuickSort {

	/**
	 * method to sort the array
	 * 
	 * @param array
	 * @param pivot
	 * @param size
	 */
	public static void quick(Integer array[], Integer pivot, Integer size) {
		Integer partitioningIndex;
		// Checking if pivot value is 0 and size value is last index of the the array
		if (pivot < size) {
			/**
			 * q indicate that the value which is left side of q is sorted and the value
			 * which is right side of the array is unsorted
			 */
			partitioningIndex = partition(array, pivot, size);
			quick(array, pivot, partitioningIndex - 1);
			quick(array, partitioningIndex + 1, size);
		}
	}

	// It divides the array in two parts unsorted and sorted
	public static int partition(Integer array[], Integer pivot, Integer size) {
		Integer x, i, j, temp;
		x = array[size];
		i = pivot - 1;
		for (j = pivot; j <= size-1; j++) {
			if (array[j] <= x) {
				i = i + 1;
				temp = array[j];
				array[j] = array[i];
				array[i] = temp;
			}
		}
		temp = array[size];
		array[size] = array[i + 1];
		array[i + 1] = temp;
		return i + 1;
	}

	/**
	 * Main method 
	 * @param args
	 */
	public static void main(String args[]) {
		Integer array[] = { 10, 9, 20, 50, 30 };
		Integer pivot, i;

		pivot = 0;
		quick(array, pivot, array.length - 1);
		for (i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}

	}
}
