package com.io;
//. Write a Java program to check if a file or directory specified by pathname exists or not. 
import java.io.File;

public class CheckFileOrDirectory {
	
	public static void main(String args[]) {
		File file=new File("E:/io/abc.txt");
		
		
		//Checking file or directory exist or not
		if(file.exists()) {
			
			if(file.exists() && file.isFile()) {
				System.out.println("File is exists ");
			}
			else if(file.exists() && file.isDirectory())	{
				System.out.println("Directory is exists ");
				
			}
			
		}
		else {
			System.out.println("File or dirctory is not exists");
		}
		
	}

}
