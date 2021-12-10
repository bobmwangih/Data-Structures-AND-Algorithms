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
	
	public void countingSort(int [] unsortedArray) {
		int min = Arrays.stream(unsortedArray).min().orElse(0);
		int max = Arrays.stream(unsortedArray).max().orElse(Integer.MAX_VALUE);
		int[] countingArray = new int [(max - min) +1 ];
		
		for(int value : unsortedArray) {
			countingArray[value - min]++;
		}
		
		int reMappingIndex = 0;
		for(int i = 0; i < max - min + 1;i++) {
			while(countingArray[i] > 0) {
				unsortedArray[reMappingIndex] = i + min;
				countingArray[i]--;
				reMappingIndex++;
			}
		}
		sortedArray = unsortedArray;
	}
	
	public int[] getSortedArray() {
		return sortedArray;
	}

}
