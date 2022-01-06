package com.bob.Datastructures.Recursion;

import java.util.stream.IntStream;

public class Recursion {

	// factorial soulution
	public static int recursion(int num) {
		// eg. 3! = 3 * 2!
		// num! = num * (num-1)!
		// 0! = 1 (baseline of the recursion)

		if (num == 0) {
			return 1;
		}
		return num * recursion(num - 1);
	}

	// fibonacci solution
	public static int fibonacci(int num) {
		// eg fibonacci(3) = fibonacci(2) + fibonacci(1)
		// fibonacci(num) = fibonacci(num-1) + fibonacci(num-2)
		// fibonacci(0) = 0
		// fibonacci(1) = 1 (baseline of the recursion)

		if (num <= 1) {
			return num;
		}

		return fibonacci(num - 1) + fibonacci(num - 2);
	}

	// write code to sort an array of string in ascending order

	// insertion sort
	public static String[] sorter(String[] unsortedArray) {

		IntStream.range(1, unsortedArray.length).forEach(index -> {
			String candidateString = unsortedArray[index];
			int i = index;
			while (i > 0 && candidateString.compareTo(unsortedArray[i - 1]) < 0) {
				unsortedArray[i] = unsortedArray[i - 1];
				i--;
			}
			unsortedArray[i] = candidateString;
		});

		return unsortedArray;

	}

	// selection sort
	public static String[] sorterSel(String[] unsortedArray) {
		IntStream.range(0, unsortedArray.length).forEach(index -> {
			IntStream.range(index, unsortedArray.length)
					.reduce((left, right) -> unsortedArray[left].compareTo(unsortedArray[right]) < 0 ? left : right)
					.ifPresent(smallestIndex -> {
						String temp = unsortedArray[index];
						unsortedArray[index] = unsortedArray[smallestIndex];
						unsortedArray[smallestIndex] = temp;
					});
		});
		return unsortedArray;
	}
	
	//bubble sort
	public static String[] sorterBubble(String [] unsortedArray) {
		for (int i = unsortedArray.length-1; i > 0; i--) {
			boolean didSwap = false;
			for (int j = 0; j < i; j++) {
				if(unsortedArray[j].compareTo(unsortedArray[j+1]) > 0) {
					String  temp = unsortedArray[j];
					unsortedArray[j] = unsortedArray[j+1];
					unsortedArray[j+1] = temp;
					didSwap = true;
				}
			}
			if(!didSwap) {
				break;
			}
		}
		
		return unsortedArray;
	}

}
