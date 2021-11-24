package com.bob.Datastructures.Utils;

public abstract class SortingUtil {

	public abstract int[] sort(int [] unsortedArray);
	
	public void sortedArrayLogging(int [] sortedArray) {
		for(int i=0; i< sortedArray.length; i++) {
        	System.out.println(sortedArray[i]);
        }

	}
}
