//[[1,2],[2,1],[3,4],[5,6]]

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

import java.util.Vector;

public class DominoesStatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Taking Input
		Vector<Vector<Integer>> vec = new Vector<Vector<Integer>>(); 
		
		//Vector 1
		Vector<Integer> v1=new Vector<>();
		v1.add(1);
		v1.add(2);
		
		Vector<Integer> v2=new Vector<>();
		v2.add(2);
		v2.add(1);
		
		Vector<Integer> v3=new Vector<>();
		v3.add(3);
		v3.add(4);
		
		Vector<Integer> v4=new Vector<>();
		v4.add(5);
		v4.add(6);
		
		vec.add(0,v1);
		vec.add(1,v2);
		vec.add(2,v3);
		vec.add(3,v4);
		//System.out.println(vec);
	    //-----------------------------------------------------//
		//Logic
		int output=0;
		for (int index=0;index<vec.size();index++) {
			
			if(index<vec.size()-1) {
				Object[] i=vec.get(index).toArray();
				Object[] j=vec.get(index+1).toArray();
				if((i[0].equals(j[0]) && i[1].equals(j[1])) || (i[0].equals(j[1]) && i[1].equals(j[0]))) {
					output=output+1;
				}
			}
		}
		System.out.println(output);
	}
}
