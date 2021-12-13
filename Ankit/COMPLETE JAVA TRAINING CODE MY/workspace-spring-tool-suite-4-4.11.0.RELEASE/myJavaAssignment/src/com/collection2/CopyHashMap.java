package com.collection2;
//Write a Java program to copy all of the mappings from the specified map to another map.
import java.util.HashMap;
import java.util.Map;

public class CopyHashMap {
	
	public static void main(String args[]) {
		//Emp list
		Map<Integer,String> emplist=new HashMap<Integer,String>();
		emplist.put(1,"Arjun");
		emplist.put(2,"Rahul");
		emplist.put(3,"Amit");
		emplist.put(4,"Arjun");
		emplist.put(5,"Rahul");
		
		//Copy emplist 
		Map<Integer,String> emplistcopy=new HashMap<Integer,String>();
		emplistcopy.putAll(emplist);
		System.out.println("List of employee : "+emplistcopy);
		
	}

}
