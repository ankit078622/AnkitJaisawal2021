package com.collection;

import java.util.ArrayList;
import java.util.List;

public class RemoveArrayListThirdElement {
	
	public static void main(String args[]) {
		
		List<String> arrayList=new ArrayList<String>();
		arrayList.add("India");
		arrayList.add("UK");
		arrayList.add("Singapur");
		arrayList.add("London");
		arrayList.add("Sri Lanka");
		
		//Printing arrayList element before element is removed
		System.out.println("Array List element are : "+arrayList);
		
		////Printing arrayList element after third element is removed
		arrayList.remove(new String("Singapur"));
		System.out.println("Array List element after third is removed : "+arrayList);
		
	}

}
