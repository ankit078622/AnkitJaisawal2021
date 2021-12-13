package com.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArralistAddAllMethodDemo {
	
	public static void main(String args[]) {
		
		//Merging of two arrays
		ArrayList<String> arrlist1=new ArrayList<String>();
		arrlist1.add("Jyoti");
		arrlist1.add("Himansi");
		
		ArrayList<String> arrlist2=new ArrayList<String>();
		arrlist2.add("Ravi");
		arrlist2.add("Ram");
		arrlist2.add("Tom");
		arrlist2.add("Jerey");
		arrlist2.add("Ankit");
		
		arrlist2.addAll(arrlist1);
		
		Iterator itr=arrlist2.iterator();
		while(itr.hasNext()) {
			System.out.println("List is : "+itr.next());
		}
		
	}

}
