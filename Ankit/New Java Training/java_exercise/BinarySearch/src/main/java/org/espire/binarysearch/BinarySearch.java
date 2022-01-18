/**
 * 
 */
package org.espire.binarysearch;

/**
 * @author ankit.jaisawal
 *
 */
public class BinarySearch {

	public static Integer binarySearch(Integer array[],Integer beg,Integer end,Integer searchValue) {
		Integer mid;
		if(end>=beg) {
			mid=(beg+end)/2;
			if(array[mid]==searchValue) {
				//if the item to be searched is present at middle
				return mid+1;
			}
			//if the searched value is greater then search right side of mid
			else if(array[mid]<searchValue) {
				return binarySearch(array,mid+1,end,searchValue);
			}
			//if the searched value is smaller then search left side of mid
			else {
				return binarySearch(array, beg, mid-1, searchValue);
			}
			
		}
		//If searched value is not present then return "-1"
		return -1;
		
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		Integer array[]= {10,20,30,50,66,88,95};
		
		//Calling method
		Integer output=binarySearch(array, 0, array.length-1, 50);
		if(output==-1) {
			System.out.println("Searched value is not present");
		}
		else{
			System.out.println("Searched value is present");
		}

	}

}
