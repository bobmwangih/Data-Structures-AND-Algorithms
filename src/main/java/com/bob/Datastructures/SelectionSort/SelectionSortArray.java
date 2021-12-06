package com.bob.Datastructures.SelectionSort;

import java.util.Arrays;

import com.bob.Datastructures.Utils.SortingUtil;
import com.bob.Datastructures.Utils.SwapUtil;

public class SelectionSortArray extends SortingUtil {
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
		
}
