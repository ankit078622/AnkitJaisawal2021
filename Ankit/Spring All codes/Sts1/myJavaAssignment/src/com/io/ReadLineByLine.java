package com.io;
// Write a Java program to read a file content line by line. 
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadLineByLine {
	public static void main(String args[])throws IOException {
		
		FileReader file=new FileReader("E:/io/abc.txt");
		BufferedReader br=new BufferedReader(file);
		try {
			String reader=br.readLine();
			while(reader!=null) {
				System.out.println(reader);
				reader=br.readLine();
			}
		}
		finally {
			br.close();
		}
	}

}
