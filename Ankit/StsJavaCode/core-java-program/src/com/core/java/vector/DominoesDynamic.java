/**
  Given a list of dominoes, dominoes[i] [a, b] is
equivalent to dominoes[j] = [c, d] if and only if either (a
== c and b == d), or (a == d and b == c) - that is, one
domino can be rotated to be equal to another domino.
Return the number of pairs (i, j) for which 0 <= i < j <
dominoes.length, and dominoes[i] is equivalent to
dominoes[j].
Input: dominoes = [[1,2],[2,1],[3,4],[5,6]]
Output: 1
 */
package com.core.java.vector;

import java.util.Scanner;
import java.util.Vector;

public class DominoesDynamic {

	public static void main(String[] args) {

		// int i[][]= {[1,2],[2,1],[3,4],[5,6]};
		// numEquivDominoPairs(i);

		System.out.print("Enter 2D array size : ");
		Scanner sc = new Scanner(System.in);
		int rows = sc.nextInt();
		int columns = sc.nextInt();

		System.out.println("Enter array elements : ");

		int twoD[][] = new int[rows][columns];

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				System.out.println("Row : " + i + " , Column : " + j);
				twoD[i][j] = sc.nextInt();
			}
		}
		System.out.println(numEquivDominoPairs(twoD));

	}

	public static int numEquivDominoPairs(int[][] dominoes) {
		int totalDominoes = 0;

		for (int arrayIndex = 0; arrayIndex < dominoes.length; arrayIndex++) {
			for (int index = arrayIndex + 1; index < dominoes.length; index++) {
				if ((dominoes[arrayIndex][0] == dominoes[index][0] && dominoes[arrayIndex][1] == dominoes[index][1])
						|| (dominoes[arrayIndex][0] == dominoes[index][1]
								&& dominoes[arrayIndex][1] == dominoes[index][0])) {
					totalDominoes = totalDominoes + 1;
				}
			}
		}

		return totalDominoes;

	}

}
