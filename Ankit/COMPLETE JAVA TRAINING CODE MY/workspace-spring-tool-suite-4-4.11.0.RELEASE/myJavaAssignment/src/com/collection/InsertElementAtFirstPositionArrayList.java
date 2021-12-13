package com.collection;

import java.util.List;
import java.util.ArrayList;

//Write a Java program to insert an element into the array list at the first position.
public class InsertElementAtFirstPositionArrayList {

	public static void main(String args[]) {
		
		List<String> plantlist=new ArrayList<String>();
		plantlist.add("Rose");
		plantlist.add("Alyssum");
		plantlist.add("Daisy");
		plantlist.add("lily");
		plantlist.add("Holly");
		
		//Before adding element at first position
		System.out.println(plantlist);
		
		//After adding element at first position
		plantlist.add(0,"Aloe Vera");
		System.out.println(plantlist);
	}
}
