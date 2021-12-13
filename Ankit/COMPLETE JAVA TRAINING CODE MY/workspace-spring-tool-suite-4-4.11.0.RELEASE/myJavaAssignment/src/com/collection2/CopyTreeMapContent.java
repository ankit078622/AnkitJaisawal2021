package com.collection2;
// Write a Java program to copy a Tree Map content to another Tree Map.
import java.util.TreeMap;

public class CopyTreeMapContent {
	
	public static void main(String args[]) {
		
		TreeMap<Integer,String> mappen=new TreeMap<Integer,String>(); 
		mappen.put(1, "Blue pen");
		mappen.put(2, "Black pen");
		mappen.put(3, "White pen");
		mappen.put(4, "Green Pen");
		mappen.put(5, "Light pen");
		
		//For copy the tree map 
		TreeMap<Integer,String> mappencopy=new TreeMap<Integer,String>(); 
		mappencopy.putAll(mappen);
		System.out.println(mappencopy);
		
	}

}
