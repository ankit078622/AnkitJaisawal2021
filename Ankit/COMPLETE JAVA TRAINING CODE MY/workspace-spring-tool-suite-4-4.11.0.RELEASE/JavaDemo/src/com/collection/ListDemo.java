package com.collection;

import java.util.List;
import java.util.ArrayList;

//Collection demo for list interface
/*
 *Java List
  The Java List interface represents an ordered collect of object
  By ordered means, that you can access the elements in the order they occur in the list.
 */
public class ListDemo {

	public static void main(String args[]) {
		
		List<String> fruitlist=new ArrayList<String>();
		fruitlist.add("Apple");
		fruitlist.add("Banana");
		fruitlist.add("Mango");
		//Enhanced for loop specially used iterating objects on collects frame work
		for(String fruitsloop:fruitlist) {
			System.out.println("List of fruits : "+fruitsloop);
		}
	}
}
