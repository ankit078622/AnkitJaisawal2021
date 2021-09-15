package com.io;
// Write a Java program to get a list of all file/directory names from the given. 
import java.io.File;
/*
 * The list() method is a part of File class.The function returns an array of string denoting the 
 * files in a given abstract pathname if the path name is a directory else returns null.
 */
public class FileList {

	public static void main(String args[]) {
		
		File file=new File("E:/Training/Java");
		String []filelist=file.list();
		for(String listofall:filelist) {
			System.out.println(listofall);
		}
	}
}
