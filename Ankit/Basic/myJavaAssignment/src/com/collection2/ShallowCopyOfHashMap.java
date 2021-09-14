package com.collection2;
//Write a Java program to get a shallow copy of a HashMap instance.
import java.util.HashMap;
import java.util.Map;

public class ShallowCopyOfHashMap {
	public static void main(String args[]) {
		//First map
		Map<Integer,String> emplist=new HashMap<Integer,String>();
		emplist.put(1,"Arjun");
		emplist.put(2,"Rahul");
		emplist.put(3,"Amit");
		emplist.put(4,"Arjun");
		emplist.put(5,"Ramesh");
		
		//Second map 
		Map<Integer,String> emplistcopy=new HashMap<Integer,String>();
		emplistcopy.putAll(emplist);
		System.out.println("Copy of hash map is : "+emplistcopy);
		
	}
}
