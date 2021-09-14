package com.collection;
//Write a Java program to add all the elements of a specified tree set to another tree set. 
import java.util.TreeSet;

public class AddingTwoTreeSet {
		public static void main(String args[]) {
			//First tree set
			TreeSet<String> treeset=new TreeSet<String>();
			treeset.add("Blue");
			treeset.add("Yellow");
			treeset.add("Red");
			treeset.add("Yellow");
			treeset.add("Brown");
			treeset.add("White");
			
			//Second tree set
			TreeSet<String> treeset1=new TreeSet<String>();
			treeset.add("Mango");
			treeset.add("Orange");
			treeset.add("Apple");
			treeset.add("PineApple");
			
			//Adding both treeset in single tree set
			TreeSet<String> treeset2=new TreeSet<String>();
			treeset2.addAll(treeset);
			treeset2.addAll(treeset1);
			
			//Printing the combined tree set
			System.out.println("Combined tree set : "+treeset2);
		}
}
