package com.bob.Datastructures.Utils;

public class SwapUtil {

	public  void swap(int[] unsortedArray,int i, int j) {
		if (i == j) {
			return;
		}
		
		int tempFirstValue = unsortedArray[i];
		unsortedArray[i] = unsortedArray[j];
		unsortedArray[j] = tempFirstValue;
		
	}
}
