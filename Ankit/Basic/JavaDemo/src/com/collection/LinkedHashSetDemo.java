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
public class LinkedHashSetDemo {

	public static void main(String ar[]) {

		Set<String> data = new LinkedHashSet<String>();

		data.add("Ram");
		data.add("Ram");
		data.add("raj");
	

		System.out.println(data);

	}

}