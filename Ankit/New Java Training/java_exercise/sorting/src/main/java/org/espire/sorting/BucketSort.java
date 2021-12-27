package org.espire.sorting;

public class BucketSort {
	// function to implement bucket sort
	public static void bucket(Integer[] array) {
		Integer len = array.length;
		Integer maximum = getMax(array); // max is the maximum element of array
		Integer[] bucket = new Integer[maximum + 1];
		for (int i = 0; i <= maximum; i++) {
			bucket[i] = 0;
		}
		for (int i = 0; i < len; i++) {
			bucket[array[i]]++;

		}
		for (int i = 0, j = 0; i <= maximum; i++) {
			while (bucket[i] > 0) {
				array[j++] = i;
				bucket[i]--;
			}
		}
	}

	// function to get maximum element from the given array
	public static Integer getMax(Integer array[]) {
		Integer len = array.length;
		Integer maximum = array[0];
		for (int i = 1; i < len; i++)
			if (array[i] > maximum)
				maximum = array[i];
		return maximum;
	}

	// Main method
	public static void main(String args[]) {
		Integer array[] = { 95, 50, 45, 15, 20, 10 };
		bucket(array);
		// Printing the output
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
}
