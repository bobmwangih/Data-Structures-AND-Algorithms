package com.bob.Datastructures.Utils;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

public class ArrayUtil {

	static Random random = new Random();
	
	//logging sorted array
	public static void print(Object[] objects) {
		System.out.println("SortedArray=" + Arrays.toString(objects) + "]");
		
	}

	//generating array of random numbers(1 - 9999)
	public static Object[] arrayGen(Object[] unsortedArray) {
		for( int i=0; i< unsortedArray.length; i++ ) {
			unsortedArray[i] = random.nextInt(100);
		}
		System.out.println("Array to be sorted=" + Arrays.toString(unsortedArray) + "]");
		return unsortedArray;
	}	

}
