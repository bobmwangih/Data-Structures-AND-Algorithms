package com.bob.Datastructures;

import java.util.Arrays;
import java.util.stream.IntStream;

public class InsertionSortTest {
	
	//testing insertion sort using streams and recursion
	private int [] unsortedArray = null;
	
	public InsertionSortTest(int[] unsortedArray) {
		super();
		this.unsortedArray = unsortedArray;
	}

	private void sort(int index) {
		while(index > 0 && unsortedArray[index] < unsortedArray[index - 1]) {
			int temp = unsortedArray[index];
			unsortedArray[index] = unsortedArray[index-1];
			unsortedArray[index - 1] = temp;
			sort(index - 1);
		}
	}
	
	public void sort() {
		IntStream.range(1,unsortedArray.length).forEach(this:: sort);
		System.out.println(Arrays.toString(unsortedArray));
	}
}
