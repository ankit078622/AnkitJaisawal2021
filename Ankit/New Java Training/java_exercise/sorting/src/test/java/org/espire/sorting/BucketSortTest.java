package org.espire.sorting;

import static org.junit.Assert.*;

import org.junit.Test;

public class BucketSortTest {

	//First test case
	@Test
	public void testBucketSort1() {
		Integer array[] = { 95, 50, 45, 15, 20, 10 };
		Integer sortedArray[] = {10,15,20,45,50,95};
		BucketSort.bucket(array);
		assertArrayEquals(sortedArray, array);
	}
	//Second test case
	@Test
	public void testBucketSort2() {
		Integer array[] = { 95, 80, 45, 5, 20, 10 ,88};
		Integer sortedArray[] = {5,10,20,45,80,88,95};
		BucketSort.bucket(array);
		assertArrayEquals(sortedArray, array);
	}

}
