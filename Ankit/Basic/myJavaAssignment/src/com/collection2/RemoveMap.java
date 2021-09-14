package com.collection2;
//4. Write a Java program to remove all of the mappings from a map. 
import java.util.HashMap;
import java.util.Map;

public class RemoveMap {
	
	public static void main(String args[]) {
		Map<Integer,String> emplist=new HashMap<Integer,String>();
		emplist.put(1,"Arjun");
		emplist.put(2,"Rahul");
		emplist.put(3,"Amit");
		emplist.put(4,"Arjun");
		emplist.put(5,"Rahul");
		System.out.println("List of employee : "+emplist);
		
		//Removing all employee records
		emplist.clear();
		System.out.println("List of employee"+emplist);
		
	}

}
