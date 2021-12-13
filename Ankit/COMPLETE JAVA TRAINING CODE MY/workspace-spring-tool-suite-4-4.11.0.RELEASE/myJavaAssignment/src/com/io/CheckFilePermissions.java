package com.io;
// Write a Java program to check if a file or directory has read and write permission. 
import java.io.File;

public class CheckFilePermissions {
	
	public static void main(String args[]) {
		
		File file=new File("E:\\Training\\Java");
		
		//checking permission
		if(file.canRead()) {
			System.out.println("File or Directory has read permission");
		}
		else {
			System.out.println("File or Directory has not read permission");
		}
		if(file.canWrite()) {
			System.out.println("File or Directory has write permission");
		}
		else {
			System.out.println("File or Directory has not wirte permission");
		}
	}

}
