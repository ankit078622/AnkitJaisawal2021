package org.espire.removeduplicates;

public class RemoveDuplicates {

	public static <E> void removeDuplicateFromArray(E[] input) {
		// Creating object array
		Object array[] = new Object[input.length];
		int i, j = 0;
		// Loop for removing the duplicates
		for (i = 0; i < input.length -1; i++) {
			if (input[i] != input[i + 1]) {
				array[j] = input[i];
				j = j + 1;
			}
		}
		array[j] = input[input.length - 1];
		
		// Loop for printing the output
		for (i = 0; i <= j; i++) {
			if (i < j) {
				System.out.print(array[i] + ",");
			} else {
				System.out.print(array[i]);
			}

		}
		System.out.println();
	}

	// Main method
	public static void main(String args[]) {
		int i, j;
		Integer integerArray[] = { 1, 2, 3, 1, 5, 9, 6, 3 };
		// {1,1,2,,3,3,5,6,9}
		String str[] = { "Abb", "Abb", "B", "C" };
		Character charArray[] = { 'a', 'a', 'B', 'C' };

		// Loop for sorting the integer array
		for (i = 0; i < integerArray.length; i++) {
			for (j = i + 1; j < integerArray.length; j++) {
				int temp = 0;
				if (integerArray[i] > integerArray[j]) {
					temp = integerArray[i];
					integerArray[i] = integerArray[j];
					integerArray[j] = temp;
				}
			}
		}
		removeDuplicateFromArray(integerArray);
		// Calling String array
		removeDuplicateFromArray(str);
		
		// Calling character array
		removeDuplicateFromArray(charArray);
	}
}
