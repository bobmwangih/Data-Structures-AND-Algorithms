package com.bob.Datastructures.InsertionSort;

import java.util.stream.IntStream;

import com.bob.Datastructures.Utils.SortingInterface;

public class InsertionSortArray<T extends Comparable<T>> implements SortingInterface {

	// INTEGER SORT
	/*
	 * public int[] sort(int[] unsortedArray) { for(int firstUnsortedIndex = 1;
	 * firstUnsortedIndex < unsortedArray.length;firstUnsortedIndex++) { int
	 * candidateElement = unsortedArray[firstUnsortedIndex]; int i; for (i =
	 * firstUnsortedIndex; i>0 && unsortedArray[i-1] > candidateElement;i--) {
	 * unsortedArray[i] = unsortedArray[i-1]; } unsortedArray[i]=candidateElement; }
	 * return unsortedArray; }
	 */

	// INTEGER AND STRING SORT
	@Override
	public Object[] sort(Object[] unsortedArray) {
		IntStream.range(1, unsortedArray.length).forEach(index -> {
			Object candidateElement = unsortedArray[index];
			int i = index;
			while(i >0 && ((Comparable<T>) candidateElement).compareTo((T) unsortedArray[i-1]) < 0) {
				unsortedArray[i] = unsortedArray[i-1];
				i--;
			}
			unsortedArray[i] = candidateElement;
		});
		return unsortedArray;
	}

}
