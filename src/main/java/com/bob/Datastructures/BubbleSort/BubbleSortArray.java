package com.bob.Datastructures.BubbleSort;

import java.util.Arrays;
import java.util.Random;

import org.springframework.stereotype.Component;

import com.bob.Datastructures.Utils.SortingInterface;
import com.bob.Datastructures.Utils.SwapUtil;

@Component
public class BubbleSortArray <T extends Comparable<T>> implements SortingInterface{
	
	@SuppressWarnings("rawtypes")
	SwapUtil swapUtil = new SwapUtil();
	Random random = new Random();

	@SuppressWarnings("unchecked")
	public Object[] sort(Object[] unsortedArray) {
		for (int lastIndex = unsortedArray.length - 1; lastIndex > 0; lastIndex-- ) {
			boolean didSwap = false;
			for (int i = 0; i< lastIndex; i++) {
				if(( (Comparable<T>) unsortedArray[i]).compareTo( (T) unsortedArray[i + 1]) > 0) {
					swapUtil.swap(unsortedArray, i , i+1 );
					didSwap = true;
				}
			}
			if(!didSwap) {
				break;
			} 
		}
		
		return unsortedArray;
	}

	public void print(Object[] objects) {
		System.out.println("SortedArray=" + Arrays.toString(objects) + "]");
		
	}

	public Object[] arrayGen(Object[] unsortedArray) {
		for( int i=0; i< unsortedArray.length; i++ ) {
			unsortedArray[i] = random.nextInt(10000);
		}
		System.out.println("Array to be sorted=" + Arrays.toString(unsortedArray) + "]");
		return unsortedArray;
	}
	
}
