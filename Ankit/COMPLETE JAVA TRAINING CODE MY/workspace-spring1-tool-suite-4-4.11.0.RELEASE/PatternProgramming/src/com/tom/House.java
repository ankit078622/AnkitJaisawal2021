package com.tom;

public class House {

	public static void main(String args[]) {
		int row,column;
		for(row=0;row<25;row++) {
			for(column=0;column<55;column++) {
				if((row==0 && column>8) || column==54 || row==9 || (column<= 8 &&column==9-row)) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
