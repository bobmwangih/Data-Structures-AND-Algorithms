package com.bob.Datastructures;

import java.util.Arrays;

import com.bob.Datastructures.Utils.SortingUtil;

public class RadixSort extends SortingUtil {
	
	private int [] sortedArray;
	
	@Override
	public int[] sort(int[] unsortedArray) {
		int max = Arrays.stream(unsortedArray).max().orElse(Integer.MAX_VALUE);
		for(int exp = 1; max/exp > 0; exp*=10) {
			radixSort(exp,unsortedArray);
		}
		return getSortedArray();
	}
	
	public void radixSort(int exp,int[] unsortedArray) {
		int [] countingArray = new int [10];
		
		for(int value : unsortedArray) {
			countingArray[(value/exp) % 10]++;
		}
		for (int i = 1; i<10; i++) {
			countingArray[i] += countingArray[i-1];
		} 
		
		int [] output = new int [unsortedArray.length];
		for (int i = unsortedArray.length -1; i >=0; i-- ) {
			int value = unsortedArray[i];
			int inCountArrayPosition = countingArray[(value/exp) % 10]-1;
			output[inCountArrayPosition] = value;
			countingArray[(value/exp) % 10]--;
		}
		System.arraycopy(output, 0, unsortedArray, 0, unsortedArray.length);
		sortedArray = unsortedArray;
		
	}
	
	public int [] getSortedArray() {
		return sortedArray;
	}

}
