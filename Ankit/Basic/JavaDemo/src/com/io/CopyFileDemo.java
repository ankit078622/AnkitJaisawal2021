package com.io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyFileDemo {
	
	public static void main(String args[])throws IOException {
		
		FileReader in=null;
		FileWriter out=null;
		in=new FileReader("E:/io/abc.txt");
		try {
			out=new FileWriter("E:/io/xyz.txt");
			
			int c;
			while((c=in.read())!=-1) {
				out.write(c);//output will generate on file insted of console
				
			}
			System.out.println("Done....");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		finally {
			in.close();
			out.close();
		}
		
	}

}
