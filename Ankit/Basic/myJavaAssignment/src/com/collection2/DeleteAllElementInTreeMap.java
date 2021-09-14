package com.collection2;
//Write a Java program to delete all elements from a given Tree Map.
import java.util.TreeMap;

public class DeleteAllElementInTreeMap {

	public static void main(String args[]) {
		TreeMap<Integer,String> map=new TreeMap<Integer,String>();    
	    map.put(100,"Amit"); 
	    map.put(101,"Vijay");
	    map.put(102,"Ravi");    
	    map.put(103,"Rahul");    
	    System.out.println("Tree map : "+map);
	    
	    //Deleting all records
	    map.clear();
	    System.out.println("Tree map : "+map);
	    
	}
}
