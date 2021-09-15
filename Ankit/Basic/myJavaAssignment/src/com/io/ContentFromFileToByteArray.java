package com.io;
//Write a Java program to read contents from a file into byte array. 
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

// Write a Java program to read contents from a file into byte array. 
public class ContentFromFileToByteArray {
	
	public static void main(String args[])throws IOException {
		File file=new File("E:/io/abc.txt");
		InputStream fileiStream=new FileInputStream(file);
		//FileOutputStream write=new FileOutputStream(null)
		try {
			byte array[]=new byte[(int)file.length()];
			fileiStream.read(array);
			for(int i=0;i<array.length;i++) {
				System.out.print((char)array[i]);
			}
		}
		catch(Exception e) {
			
		}
	}

}
