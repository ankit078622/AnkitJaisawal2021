package com.io;
// Write a Java program to get specific files by extensions from a specified folder. 
import java.io.File;
import java.io.FilenameFilter;

public class GetFilesByExtention {
	
	public static void main(String args[]) {
		
		File file=new File("E:/Training/Java");
		String[] listofAll=file.list(new FilenameFilter() {
			
			@Override
			public boolean accept(File dir, String name) {
				// TODO Auto-generated method stub
				if(name.toLowerCase().endsWith(".png")) {
					return true;
				}
				else {
					return false;
				}
			}
		});
		//Printing the file having extension .png
		System.out.println("List of all file having extension '.png' ");
		for(int i=0;i<listofAll.length;i++) {
			System.out.println(listofAll[i]);
		}
	}

}
