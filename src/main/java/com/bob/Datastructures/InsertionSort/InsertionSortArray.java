package com.bob.Datastructures.InsertionSort;

import com.bob.Datastructures.Utils.SortingUtil;

public class InsertionSortArray extends SortingUtil {

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


}
