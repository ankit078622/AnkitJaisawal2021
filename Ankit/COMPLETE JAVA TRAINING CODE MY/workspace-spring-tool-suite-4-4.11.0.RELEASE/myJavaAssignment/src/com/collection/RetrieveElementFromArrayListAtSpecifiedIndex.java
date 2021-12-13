package com.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

//Write a Java program to retrieve an element (at a specified index) from a given array list
public class RetrieveElementFromArrayListAtSpecifiedIndex {
	
	public static void main(String args[]) {
		int position=0;
		List<String> arrayList=new ArrayList<String>();
		arrayList.add("Red");
		arrayList.add("Blue");
		arrayList.add("Yellow");
		arrayList.add("White");
		arrayList.add("Black");
		
		Iterator itr=arrayList.iterator();
		while(itr.hasNext()) {
			
			System.out.println("Color is at "+position+" index : "+itr.next());
			position++;
			
		}
		
		//For user input
		System.out.print("Enter the  index you want to search : ");
		Scanner userInput=new Scanner(System.in);
		int index=userInput.nextInt();
		System.out.println("Element at "+index+" position is :"+arrayList.get(index));
	}

}
