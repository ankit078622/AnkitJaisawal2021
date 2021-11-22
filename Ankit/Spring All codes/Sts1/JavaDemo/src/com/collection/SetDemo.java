package com.collection;

import java.util.LinkedHashSet;
import java.util.Set;

/*@The set interface is present in java.util package 
 * and 
extends the Collection interface is an unordered collection of objects
in which duplicate values cannot be stored. 
@It is an interface that 
implements the mathematical set. 
@This interface contains the methods
inherited from the Collection interface and adds a feature that restricts 
the insertion of the duplicate elements.
@ There are two interfaces that 
extend the set implementation namely SortedSet and NavigableSet.
*/
public class SetDemo {

	public static void main(String ar[]) {

		Set<Integer> data = new LinkedHashSet<Integer>();

		data.add(25);
		data.add(25);
		data.add(21);
		data.add(25);

		System.out.println(data);

	}

}