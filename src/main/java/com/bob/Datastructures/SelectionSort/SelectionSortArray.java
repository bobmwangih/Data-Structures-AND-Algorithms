package com.bob.Datastructures.SelectionSort;

import com.bob.Datastructures.Utils.SortingInterface;
import com.bob.Datastructures.Utils.SwapUtil;

public class SelectionSortArray implements SortingInterface {

	SwapUtil swapUtil = new SwapUtil();
	
	public int[] sort(int[] unsortedArray) {
		for(int lastIndex = unsortedArray.length-1;lastIndex > 0;lastIndex--) {
			int largest = 0;
			for(int i =1; i<=lastIndex; i++) {
				if(unsortedArray[i]>unsortedArray[largest]) {
					largest = i;
				}
			}
			swapUtil.swap(unsortedArray, largest, lastIndex);
			
		}
		return unsortedArray;
	}

	public void sortedArrayLogging(int[] sortedArray) {
		for(int i=0; i< sortedArray.length; i++) {
        	System.out.println(sortedArray[i]);
        }
		
	}
	
}
