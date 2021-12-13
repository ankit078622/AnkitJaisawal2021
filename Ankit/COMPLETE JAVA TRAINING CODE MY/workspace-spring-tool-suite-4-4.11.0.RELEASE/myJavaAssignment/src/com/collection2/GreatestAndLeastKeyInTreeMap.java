package com.collection2;

import java.util.TreeMap;

//Write a Java program to get a key-value mapping associated with the greatest key and the least key in a map. 
public class GreatestAndLeastKeyInTreeMap {
	
	public static void main(String args[]) {
		
		TreeMap<Integer,String> map=new TreeMap<Integer,String>();    
		map.put(104,"Rahul");	   
		map.put(100,"Amit"); 
	    map.put(101,"Vijay");
	    map.put(102,"Ravi");    
	    map.put(103,"Rahul");    
	    System.out.println("Tree map : "+map);
	    
	    //Greater key
	    System.out.println("Greater Key : "+map.firstEntry());
	    System.out.println("Least key value :"+map.lastEntry());
		
	}

}
