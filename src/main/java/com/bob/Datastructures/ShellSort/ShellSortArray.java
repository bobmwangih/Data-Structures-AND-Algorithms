package com.bob.Datastructures.ShellSort;

import com.bob.Datastructures.Utils.SortingInterface;
import com.bob.Datastructures.Utils.SortingUtil;

public class ShellSortArray extends SortingUtil{

	public int[] sort(int[] unsortedArray) {
		for(int gap = unsortedArray.length/2; gap>0; gap/=2) {
			for(int i = gap; i<unsortedArray.length;i++) {
				int candidateELement = unsortedArray[i];
				int j = i;
				while(j>=gap && unsortedArray[j-gap] > candidateELement) {
					unsortedArray[j]= unsortedArray[j-gap];
					j-=gap;
				}
				unsortedArray[j] = candidateELement;
			}
		}
		return unsortedArray;
	}

}
