package org.espire.sorting;

public class MergeSort {
	public static void mergerSort(Integer[] array, Integer[] temp, Integer low, Integer high) {
		if (low < high) { // base case
			int mid = low + (high - low) / 2; // overflow condition (low + high) / 2;
			mergerSort(array, temp, low, mid);
		    mergerSort(array, temp, mid + 1, high);
			merge(array, temp, low, mid, high);
		}
	}

	private static void merge(Integer[] array, Integer[] temp, Integer low, Integer mid, Integer high) {
		//Integer i;
		for (Integer i = low; i <= high; i++) {
			temp[i] = array[i];
		}
		// traverse left sorted subarray
		Integer lowIndex = low; 
		// traverse right sorted subarray
		Integer j = mid + 1; 
		// will merge both arrays into original array (array)
		Integer k = low; 

		while (lowIndex <= mid && j <= high) {
			if (temp[lowIndex] <= temp[j]) {
				array[k] = temp[lowIndex];
				lowIndex++;
			} else {
				array[k] = temp[j];
				j++;
			}
			k++;
		}

		while (lowIndex <= mid) {
			array[k] = temp[lowIndex];
			k++;
			lowIndex++;
		}
	}

	//Main method
	public static void main(String[] args) {
		Integer[] array ={ 9, 5, 2, 4, 3, -1 };
		mergerSort(array, new Integer[array.length], 0, array.length - 1);
		Integer i;
		for (i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}
}
