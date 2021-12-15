package com.bob.Datastructures.BubbleSort;

import com.bob.Datastructures.Utils.SortingInterface;
import com.bob.Datastructures.Utils.SwapUtil;

public class BubbleSortArray<T extends Comparable<T>> implements SortingInterface {

	@SuppressWarnings("unchecked")
	public Object[] sort(Object[] unsortedArray) {
		for (int lastIndex = unsortedArray.length - 1; lastIndex > 0; lastIndex--) {
			boolean didSwap = false;
			for (int i = 0; i < lastIndex; i++) {
				if (((Comparable<T>) unsortedArray[i]).compareTo((T) unsortedArray[i + 1]) > 0) {
					SwapUtil.swap(unsortedArray, i, i + 1);
					didSwap = true;
				}
			}
			if (!didSwap) {
				break;
			}
		}

		return unsortedArray;
	}

}
