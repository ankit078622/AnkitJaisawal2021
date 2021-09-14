package com.collection2;
//Write a Java program to search a key in a Tree Map.
import java.util.Scanner;
import java.util.TreeMap;

public class TreeMapKeySearch {
	
	public static void main(String args[]) {
		//Adding key and value
		TreeMap<Integer,String> map=new TreeMap<Integer,String>();    
	    map.put(100,"Amit"); 
	    map.put(101,"Vijay");
	    map.put(102,"Ravi");    
	    map.put(103,"Rahul");    
	    System.out.println("Tree map : "+map);
	    
	    //Checking mapping for key is present or not
  		Integer key;
  		Scanner input=new Scanner(System.in);
  		System.out.print("Enter the key of check mapping exists or not : ");
  		key=input.nextInt();
  		if(map.containsKey(key)) {
  			System.out.println("Yes mapping is available for key : "+key);
  		}
  		else
  		{
  			System.out.println("Mapping is not available for key : "+key);
  		}
	}

}
