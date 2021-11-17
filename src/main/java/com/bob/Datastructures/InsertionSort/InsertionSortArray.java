package com.bob.Datastructures.InsertionSort;

import com.bob.Datastructures.Utils.SortingInterface;

public class InsertionSortArray implements SortingInterface {

	public int[] sort(int[] unsortedArray) {
		for(int firstUnsortedIndex = 1; firstUnsortedIndex < unsortedArray.length;firstUnsortedIndex++) {
		int candidateElement = unsortedArray[firstUnsortedIndex];
		int i;
		for (i = firstUnsortedIndex; i>0 && unsortedArray[i-1] > candidateElement;i--) {
			unsortedArray[i] = unsortedArray[i-1];
		}
		unsortedArray[i]=candidateElement;
		}
		return unsortedArray;
	}

	public void sortedArrayLogging(int[] sortedArray) {
		for(int i=0; i< sortedArray.length; i++) {
        	System.out.println(sortedArray[i]);
        }

	}

}
