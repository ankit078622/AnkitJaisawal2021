package com.collection2;
// Write a Java program to get all keys from the given a Tree Map.
import java.util.Iterator;
import java.util.TreeMap;

public class GetAllKeyFromTreeMap {

	public static void main(String args[]) {
		
		TreeMap<Integer,String> map=new TreeMap<Integer,String>();    
	    map.put(100,"Amit"); 
	    map.put(101,"Ramesh");
	    map.put(102,"Ravi");    
	    map.put(103,"Rahul");  
	    map.put(104, "Kishan");
	    System.out.println("Tree map : "+map);
	    
	    //getting all id from the tree map
	    Iterator<Integer> getid=map.keySet().iterator();
	    System.out.println("All the Keys are :");
	    while(getid.hasNext()) {
	    	System.out.println(getid.next());
	    }
	}
}
