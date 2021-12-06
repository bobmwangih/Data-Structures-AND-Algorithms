package com.bob.Datastructures.QuickSort;

import com.bob.Datastructures.Utils.SortingUtil;

public class QuickSort extends SortingUtil {

	private int[] sortedArray = null;
	
	@Override
	public int[] sort(int[] unsortedArray) {
		quickSort(unsortedArray,0,unsortedArray.length);
		return getSortedArray();
	}
	
	public void quickSort(int [] unsortedArray , int startIndex,int endIndex) {
		if ((endIndex - startIndex) < 2) {
			return;
		}
		
		int pivot = partition(unsortedArray,startIndex,endIndex);
		
		quickSort(unsortedArray, startIndex, pivot);
		quickSort(unsortedArray, pivot + 1, endIndex);
		sortedArray = unsortedArray;
	}

	private int partition(int[] unsortedArray, int startIndex, int endIndex) {

		int pivot = unsortedArray[startIndex];
		int i = startIndex;
		int j = endIndex;
		
		while(i < j) {
			//Empty loop body
			while(i<j && unsortedArray[--j]>=pivot);
			if(i<j) {
				unsortedArray[i] = unsortedArray[j];
			}
			//Empty loop body
			while(i<j && unsortedArray[++i]<=pivot);
			if(i<j) {
				unsortedArray[j] = unsortedArray[i];
			}
			
		}
		unsortedArray[j] = pivot;
		return j;
	}

	public int[] getSortedArray() {
		return sortedArray;
	}
	
	
}
