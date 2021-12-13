package com.io;
//Write a Java program to read a plain text file. 
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;

public class ReadPlainText {
	
	public static void main(String args[])throws IOException {
		FileInputStream file=new FileInputStream("E:/io/abc.txt");
		BufferedInputStream bufferedInputStream=new BufferedInputStream(file);
		int i;
		while((i=bufferedInputStream.read())!=-1) {
			System.out.print((char)i);
		}
		file.close();
		bufferedInputStream.close();
		
	}

}
