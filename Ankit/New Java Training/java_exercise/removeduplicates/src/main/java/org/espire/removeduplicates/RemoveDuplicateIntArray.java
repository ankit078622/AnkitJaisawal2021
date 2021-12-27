package org.espire.removeduplicates;

public class RemoveDuplicateIntArray {
	public static int removeDuplicate(int input[]) {
		int len=input.length;
		if(len==0 || len==1) {
			//return len;
		}
		int[] temp=new int[len];
		int j=0;
		for(int i=0;i<len-1;i++) {
			if(input[i]!=input[i+1]) {
				temp[j++]=input[i];
			}
		}
		temp[j++]=input[len-1];
		//Changing original array
		for(int i=0;i<j;i++) {
			input[i]=temp[i];
		}
		return j;
	}
	public static void main(String args[]) {
		int array[]= {10,20,20,30,40};
		removeDuplicate(array);
	}
}
