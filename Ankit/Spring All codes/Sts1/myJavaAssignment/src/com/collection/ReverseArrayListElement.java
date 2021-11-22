package com.collection;
//Write a Java program to reverse elements in a array list.
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ReverseArrayListElement {
	
	public static void main(String args[]) {
		
		List<String> arrayList=new ArrayList<String>();
		arrayList.add("India");
		arrayList.add("UK");
		arrayList.add("Singapur");
		arrayList.add("London");
		arrayList.add("Sri Lanka");
		
		//Before reverse operation
		System.out.print("Array List before reverse operation : ");
		Iterator itr=arrayList.iterator();
		while(itr.hasNext()) {
			System.out.print("\t"+itr.next());
		}
		
		
		//Reversing the arrayList
		System.out.print("\nArray List after reverse operation : ");
		for(int i=arrayList.size()-1;i>=0;i--) {
			System.out.print("\t"+arrayList.get(i));
		}
	}

}
