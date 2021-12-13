package com.collection2;
//
import java.util.HashMap;
import java.util.Map;

public class CountNumberOfKeyValueInHashMap {
	
	public static void main(String args[]) {
		
		Map<Integer,String> emplist=new HashMap<Integer,String>();
		emplist.put(1,"Arjun");
		emplist.put(2,"Rahul");
		emplist.put(3,"Amit");
		emplist.put(4,"Arjun");
		emplist.put(5,"Ramesh");
		
		System.out.println("Number of records in hash map are : "+emplist.size());
	}

}
