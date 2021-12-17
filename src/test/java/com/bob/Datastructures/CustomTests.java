package com.bob.Datastructures;

import java.util.stream.IntStream;

public class CustomTests {
	
	static void swapper(int[] array, int left, int right) {
		int parentValue = array[left];
		array[left] = array[right];
		array[right] = parentValue;
	}

	//testing selection sort using streams
	static int[] test() {
		// Object[] testingArray = ArrayGenerator.arrayGen(new Object[10]);
		int[] testArray = new int[] { 13,99,5,19,0,0,9,7,2,1};
		IntStream.range(0, testArray.length).forEach(index -> {
			IntStream.range(index , testArray.length)
					.reduce((left, right) -> testArray[left] < testArray[right] ? left : right).ifPresent(smallest -> {
						if(smallest != index) {
							swapper(testArray, index, smallest);
						}
					});
		});
		return testArray;
	}

	public static void main(String[] args) {

		//System.out.println(Arrays.toString(test()));
		new InsertionSortTest(new int[] { 13,99,5,19,0,0,9,7,2,1}).sort();
	}

}
