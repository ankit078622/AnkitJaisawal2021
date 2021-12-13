package com.collection;

import java.util.Iterator;
import java.util.LinkedList;

public class ListLinkDemo {
	
	public static void main(String args[]) {
		
		LinkedList<String> arrlist2=new LinkedList<String>();
		arrlist2.add("Ravi");
		arrlist2.add("Ram");
		arrlist2.add("Tom");
		arrlist2.add("Jerey");
		arrlist2.add("Ankit");
		
		Iterator itr=arrlist2.iterator();
		
		while(itr.hasNext()) {
			System.out.println("List is : "+itr.next());
		}
	}

}
