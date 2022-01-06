package com.bob.Datastructures.ShellSort;

import java.util.stream.IntStream;

import com.bob.Datastructures.Utils.SortingInterface;
import com.bob.Datastructures.Utils.SortingUtil;

public class ShellSortArray<T extends Comparable<T>> implements SortingInterface {

	/*
	 * public int[] sort(int[] unsortedArray) { for(int gap =
	 * unsortedArray.length/2; gap>0; gap/=2) { for(int i = gap;
	 * i<unsortedArray.length;i++) { int candidateELement = unsortedArray[i]; int j
	 * = i; while(j>=gap && unsortedArray[j-gap] > candidateELement) {
	 * unsortedArray[j]= unsortedArray[j-gap]; j-=gap; } unsortedArray[j] =
	 * candidateELement; } } return unsortedArray; }
	 */
	public Object[] sort(int index,int gap,Object[] unsortedArray) {
		//int j = index;
				while (index >= gap & ((Comparable<T>) unsortedArray[index - gap]).compareTo((T) unsortedArray[index]) > 0) {
					Object candidateElement = unsortedArray[index];
					unsortedArray[index] = unsortedArray[index - gap];
					unsortedArray[index - gap] = candidateElement;
					sort(index-gap , gap,unsortedArray);
				}
		return unsortedArray;
	}

	@Override
	public Object[] sort(Object[] unsortedArray) {
		IntStream.iterate(unsortedArray.length / 2, gap -> gap > 0, gap -> gap /= 2)
				.forEach(gap -> IntStream.range(gap, unsortedArray.length).forEach(index -> sort(index, gap,unsortedArray)));
		return unsortedArray;

	}
}
