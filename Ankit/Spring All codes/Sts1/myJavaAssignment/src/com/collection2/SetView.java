package com.collection2;
//Write a Java program to create a set view of the mappings contained in a map.
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class SetView {
	
	public static void main(String args[]) {
		Map<Integer,String> emplist=new HashMap<Integer,String>();
		emplist.put(1,"Arjun");
		emplist.put(2,"Rahul");
		emplist.put(3,"Amit");
		emplist.put(4,"Arjun");
		emplist.put(5,"Ramesh");
		
		//Creating set view for map
		Set setlist=emplist.entrySet();
		System.out.println("Set key values are: "+setlist);
	}

}
