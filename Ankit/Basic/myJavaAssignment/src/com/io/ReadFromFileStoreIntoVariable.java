package com.io;
// Write a Java program to read a plain text file. 
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;

public class ReadFromFileStoreIntoVariable {

	public static void main(String args[]) throws IOException {
		String storevalue=new String();
		BufferedReader br = new BufferedReader(new FileReader("E:/io/abc.txt"));
		try {
			
			String string=br.readLine();
			while(string!=null) {
				
				storevalue=storevalue+string;
				string=br.readLine();
			}
			System.out.println(storevalue);
		}
		
		finally {
			br.close();
		}
	}
}
