/**
 * 
 */
package org.espire.permutation;

public class Permutation {

	/**
	 * permutation method
	 * @param str string to calculate permutation for
	 * @param str
	 * @param startIndex
	 * @param endIndex
	 */
	public static void findPermutation(String str, Integer startIndex, Integer endIndex) {
		if (startIndex == endIndex) {
			System.out.println(str);
		} else {
			for (Integer i = startIndex; i <= endIndex; i++) {
				str = swap(str, startIndex, i);
				findPermutation(str, startIndex + 1, endIndex);
				str = swap(str, startIndex, i);
			}
		}
	}

	/**
	 * Swapping method
	 * @param a
	 * @param i
	 * @param j
	 * @return
	 */
	public static String swap(String stri, Integer i, Integer j) {
		char temp;
		char[] charArray = stri.toCharArray();
		temp = charArray[i];
		charArray[i] = charArray[j];
		charArray[j] = temp;
		return String.valueOf(charArray);
	}

	/**
	 * @param args
	 */
	public static void main(String args[]) {

		findPermutation("ABC", 0, 2);
	}
}
