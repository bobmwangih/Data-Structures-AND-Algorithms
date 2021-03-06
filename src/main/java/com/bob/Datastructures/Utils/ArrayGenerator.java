package com.bob.Datastructures.Utils;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

public class ArrayGenerator {
	static Random random = new Random();
	
	public static int[] arrayGen(int [] unsortedArray) {
		for( int i=0; i< unsortedArray.length; i++ ) {
			unsortedArray[i] = random.nextInt(100);
		}
		System.out.println("Array to be sorted=" + Arrays.toString(unsortedArray) + "]");
		return unsortedArray;
		
	}

	public static Object[] arrayGen(Object[] objects) {
		IntStream.range(0, objects.length).forEach(index -> objects[index]= random.nextInt(100));
		System.out.println("Array to be sorted=" + Arrays.toString(objects) + "]");
		return objects;
	}
}
