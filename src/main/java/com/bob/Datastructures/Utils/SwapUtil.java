package com.bob.Datastructures.Utils;

public class SwapUtil<T extends Comparable<T>> {

	public static void swap(Object[] unsortedArray, int i, int j) {
		if (i == j) {
			return;
		}

		Object tempFirstValue = unsortedArray[i];
		unsortedArray[i] = unsortedArray[j];
		unsortedArray[j] = tempFirstValue;

	}
}
