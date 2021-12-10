package com.bob.Datastructures.CountingSort;

import java.util.Arrays;

import com.bob.Datastructures.Utils.SortingUtil;

public class CountingSort extends SortingUtil {

	private int[] sortedArray = null;
	
	@Override
	public int[] sort(int[] unsortedArray) {
		countingSort(unsortedArray);
		
		return getSortedArray();
	}
	//method 1
//	public void countingSort(int [] unsortedArray) {
//		int min = Arrays.stream(unsortedArray).min().orElse(0);
//		int max = Arrays.stream(unsortedArray).max().orElse(Integer.MAX_VALUE);
//		int[] countingArray = new int [(max - min) +1 ];
//		
//		for(int value : unsortedArray) {
//			countingArray[value - min]++;
//		}
//		
//		int reMappingIndex = 0;
//		for(int i = 0; i < max - min + 1;i++) {
//			while(countingArray[i] > 0) {
//				unsortedArray[reMappingIndex] = i + min;
//				countingArray[i]--;
//				reMappingIndex++;
//			}
//		}
//		sortedArray = unsortedArray;
//	}
	
//	//method two
	public void countingSort(int [] unsortedArray) {
		int min = Arrays.stream(unsortedArray).min().orElse(0);
		int max = Arrays.stream(unsortedArray).max().orElse(Integer.MAX_VALUE);
		int[] countingArray = new int [(max - min) +1 ];
		
		for(int value : unsortedArray) {
			countingArray[value - min]++;
		}
		
		for(int i=1; i< (max-min)+1;i++) {
			countingArray[i] +=countingArray[i-1]; 
		}
		
		int [] output= new int [unsortedArray.length];
		for (int i = unsortedArray.length-1;i>=0;i--) {
			int current = unsortedArray[i];
			int inCountingArrayPosition = countingArray[current - min] - 1;
			output[inCountingArrayPosition] = current;
			countingArray[current - min]--;
		}
		System.arraycopy(output, 0, unsortedArray, 0, unsortedArray.length);
		sortedArray = unsortedArray;
	}
	
	public int[] getSortedArray() {
		return sortedArray;
	}

}
