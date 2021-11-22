package com.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
	public static void main(String args[]) {
		
		ArrayList<String> arrList=new ArrayList<String>();
		arrList.add("Ravi");
		arrList.add("Ram");
		arrList.add("Tom");
		arrList.add("Jerey");
		arrList.add("Ankit");
		Iterator itr=arrList.iterator();
		while(itr.hasNext()) {
			
			System.out.println("List is : "+itr.next());
			
		}
	}

}
