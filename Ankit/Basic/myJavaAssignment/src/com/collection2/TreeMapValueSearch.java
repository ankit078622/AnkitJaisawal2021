package com.collection2;
// Write a Java program to search a value in a Tree Map.
import java.util.Scanner;
import java.util.TreeMap;

public class TreeMapValueSearch {
	
	public static void main(String args[]) {
		
		TreeMap<Integer,String> map=new TreeMap<Integer,String>();    
	    map.put(100,"Amit"); 
	    map.put(101,"Vijay");
	    map.put(102,"Ravi");    
	    map.put(103,"Rahul");    
	    System.out.println("Tree map : "+map);
		
		//Checking mapping for value is present or not
		String value;
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the value of check mapping exists or not : ");
		value=input.next();
		if(map.containsValue(value)) {
			System.out.println("Yes mapping is available for value : "+value);
		}
		else
		{
			System.out.println("Mapping is not available for value : "+value);
		}
	}

}
