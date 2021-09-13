package com.collection;

import java.util.List;
import java.util.Vector;

//Vector is synchronized
// Java vector contains many legacy methods that are not the part of a collections framework.
public class VectorDemo {
	
	public static void main(String args[]) {
		
		List<String> vect=new Vector<String>();
		vect.add("Ravi");
		vect.add("Ram");
		vect.add("Tom");
		vect.add("Jerey");
		vect.add("Ankit");
		
		System.out.println(vect);
	}

}
