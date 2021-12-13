package com.io;
//Write a Java program to check if given pathname is a directory or a file. 
import java.io.File;

public class CheckGivenPathIsDirectoryOrFile {

	public static void main(String args[]) {
		
		File file=new File("E:/io/abc.txt");
	    if(file.isDirectory()) {
	    	System.out.println("The given path is directory");
	    }
	    else if(file.isFile()) {
	    	System.out.println("The given path is file");
	    }
	    else {
	    	System.out.println("The given path is not exists");
	    }
	}
}
