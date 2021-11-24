package com.bob.Datastructures.BubbleSort;

import org.springframework.stereotype.Component;

import com.bob.Datastructures.Utils.SortingUtil;
import com.bob.Datastructures.Utils.SwapUtil;

@Component
public class BubbleSortArray  extends SortingUtil{
	
	SwapUtil swapUtil = new SwapUtil();

	public int[] sort(int[] unsortedArray) {
		for (int lastIndex = unsortedArray.length - 1; lastIndex > 0; lastIndex-- ) {
			for (int i = 0; i< lastIndex; i++) {
				if(unsortedArray[i] > unsortedArray[i + 1]) {
					swapUtil.swap(unsortedArray, i , i+1 );
				}
			}
		}
		
		return unsortedArray;
	}
	
}
