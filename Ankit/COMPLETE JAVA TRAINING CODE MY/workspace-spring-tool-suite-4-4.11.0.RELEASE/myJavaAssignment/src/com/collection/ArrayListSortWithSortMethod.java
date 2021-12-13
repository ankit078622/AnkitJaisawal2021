package com.collection;
//Write a Java program to sort a given array list.
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListSortWithSortMethod {
	
	public static void main(String args[]) {
		List<String> arrayList=new ArrayList<String>();
		arrayList.add("Red");
		arrayList.add("Blue");
		arrayList.add("Yellow");
		arrayList.add("White");
		arrayList.add("Black");
		
		//before sorting
		System.out.println("Array List element are before sorting : "+arrayList);
		
		//After sorting
		Collections.sort(arrayList);
		System.out.println("Array List element are after sorting : "+arrayList);
	}

}
