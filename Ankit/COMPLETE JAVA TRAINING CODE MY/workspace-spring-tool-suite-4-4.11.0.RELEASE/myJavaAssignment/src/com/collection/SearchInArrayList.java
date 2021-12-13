package com.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

//Write a Java program to search an element in a array list.
public class SearchInArrayList {

	public static void main(String arga[]) {
		
		List<String> arraylist=new ArrayList<String>();
		arraylist.add("Ravi");
		arraylist.add("Ram");
		arraylist.add("Tom");
		arraylist.add("Jerey");
		arraylist.add("Ankit");
		
		System.out.println("Array List elements are : "+arraylist);
		
		//Taking input for searching the element
		System.out.print("Enter the name which you want to search : ");
		Scanner input=new Scanner(System.in);
		String str1=input.next();
		int check=0;
		Iterator itr=arraylist.iterator();
		while(itr.hasNext()) {
			if(itr.next().equals(str1)) {
				check=1;
			}
		}
		if(check==1) {
			System.out.println(str1+" is available in the array list");
		}
		else {
			System.out.println(str1+" Element you wnat to search is not available in the array list");
		}
		
	}
}
