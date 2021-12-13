package com.collection2;
//Write a Java program to sort keys in Tree Map by using comparator.
import java.util.Comparator;
import java.util.TreeMap;

public class SortKeyComparator {

	public static void main(String args[]) {
		
		TreeMap<String,String> map=new TreeMap<String,String>(new sorttreemap());    
		map.put("104","Rahul");
	    map.put("100","Amit"); 
	    map.put("101","Vijay");
	    map.put("102","Ravi");    
	    map.put("103","Rahul");    
	    System.out.println("Tree map : "+map);
	    
		
	}
}

class sorttreemap implements Comparator<String>{
    public int compare(String key, String value) {
       return key.compareTo(value);
   }
    
}
