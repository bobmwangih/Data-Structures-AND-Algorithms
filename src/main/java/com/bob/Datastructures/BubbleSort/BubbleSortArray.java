package com.bob.Datastructures.BubbleSort;

import org.springframework.stereotype.Component;

import com.bob.Datastructures.Utils.SortingInterface;
import com.bob.Datastructures.Utils.SwapUtil;

@Component
public class BubbleSortArray  implements SortingInterface{
	
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
	
	public void sortedArrayLogging(int [] sortedArray) {
		for(int i=0; i< sortedArray.length; i++) {
        	System.out.println(sortedArray[i]);
        }
	}
	
}
