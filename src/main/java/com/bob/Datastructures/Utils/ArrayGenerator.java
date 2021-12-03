package com.bob.Datastructures.Utils;

import java.util.Random;

public class ArrayGenerator {
	//int[] unsortedArray = new int[1000];
	Random random = new Random();
	
	public int[] arrayGen(int [] unsortedArray) {
		for( int i=0; i< unsortedArray.length; i++ ) {
			unsortedArray[i] = random.nextInt(10000);
		}
		return unsortedArray;
		
	}
}
