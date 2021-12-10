package com.bob.Datastructures.Utils;

import java.util.Arrays;
import java.util.Random;

public abstract class SortingUtil {

	Random random = new Random();
	
	public abstract int[] sort(int [] unsortedArray);
	
	//logging sorted array
	public void print(int []sortedArray) {
		//return "SelectionSortArray [sortedArray=" + Arrays.toString(sortedArray) + "]";
		System.out.println("SortedArray=" + Arrays.toString(sortedArray) + "]");
	}
	
	
	//generating an array of random numbers (1- 9999)
	public int[] arrayGen(int [] unsortedArray) {
		for( int i=0; i< unsortedArray.length; i++ ) {
			unsortedArray[i] = random.nextInt(10000);
		}
		return unsortedArray;
		
	}
}

