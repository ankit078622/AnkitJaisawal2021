package com.io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadingDemoFromConsolensole {

	public static void main(String args[])throws IOException {
		InputStreamReader cin=null;// An InputStreamReader is a bridge from byte streams to character streams:
		
		FileOutputStream fileOutputStream=null;
		try {
			cin=new InputStreamReader(System.in);
			fileOutputStream=new FileOutputStream("abc.txt");
			
			System.out.println("Enter characters 'q' to quit.");
			char c;
			do {
				c=(char)cin.read();//type casting
				fileOutputStream.write(c);
				
				System.out.println(c);
			}
			while(c!='q');
			
			System.out.println("done");//this
		}
		finally {
			if(cin!=null) {
				cin.close();
			}
			
		}
	}
}
