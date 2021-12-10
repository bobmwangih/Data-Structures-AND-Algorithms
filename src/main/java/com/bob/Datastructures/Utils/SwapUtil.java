package com.bob.Datastructures.Utils;

public class SwapUtil<T extends Comparable<T>> {
	
	
	public  void swap(Object[] unsortedArray,int i, int j) {
		if (i == j) {
			return;
		}
		
		Object tempFirstValue = unsortedArray[i];
		unsortedArray[i] = unsortedArray[j];
		unsortedArray[j] = tempFirstValue;
		
	}
	
	public  void swap(int[] unsortedArray,int i, int j) {
		if (i == j) {
			return;
		}
		
		int tempFirstValue = unsortedArray[i];
		unsortedArray[i] = unsortedArray[j];
		unsortedArray[j] = tempFirstValue;
		
	}
}
