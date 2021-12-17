package com.bob.Datastructures.SelectionSort;

import java.util.stream.IntStream;

import com.bob.Datastructures.Utils.SortingInterface;
import com.bob.Datastructures.Utils.SwapUtil;

public class SelectionSortArray<T extends Comparable<T>> implements SortingInterface{
	
	@Override
	public Object[] sort(Object[] unsortedArray) {
		for (int lastIndex = unsortedArray.length - 1; lastIndex > 0; lastIndex--) {
			int largest = 0;
			for (int i = 1; i <= lastIndex; i++) {
				// unsortedArray[i]>unsortedArray[largest]
				if (((Comparable<T>) unsortedArray[i]).compareTo((T) unsortedArray[largest]) > 0) {
					largest = i;
				}
			}
			SwapUtil.swap(unsortedArray, largest, lastIndex);

		}
		return unsortedArray;
	}

	// method two using streams
	public Object[] sortUsingStreams(Object[] unsortedArray) {
		IntStream.range(0, unsortedArray.length).forEach(i -> IntStream.range(i, unsortedArray.length)
				//((Comparable<T>) unsortedArray[left]).compareTo((T) unsortedArray[right])
				.reduce((left, right) -> ((Comparable<T>) unsortedArray[left]).compareTo((T) unsortedArray[right]) < 0
						? left
						: right)
				.ifPresent(smallestIndex -> {
					if(smallestIndex != i) {
						SwapUtil.swap(unsortedArray, smallestIndex, i);	
					}
				}));
		return unsortedArray;
	}




}
