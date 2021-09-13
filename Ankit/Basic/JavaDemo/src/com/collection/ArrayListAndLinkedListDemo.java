package com.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ArrayListAndLinkedListDemo {
	
	public static void main(String args[]) {
	   
		// merging of two arrays
		List<String> list1=new LinkedList<String>();
		list1.add("Jyoti");
		list1.add("Amrita");
		
		ArrayList<String> arrlist2=new ArrayList<String>();
		arrlist2.add("Ravi");
		arrlist2.add("Ram");
		arrlist2.add("Tom");
		arrlist2.add("Jerey");
		arrlist2.add("Ankit");
		
		arrlist2.addAll(list1);
		
		Iterator itr=arrlist2.iterator();
		while(itr.hasNext()) {
			System.out.println("List is : "+itr.next());
		}
	}

}
