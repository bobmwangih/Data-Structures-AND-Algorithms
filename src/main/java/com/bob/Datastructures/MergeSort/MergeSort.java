package com.bob.Datastructures.MergeSort;

import java.util.Arrays;

import com.bob.Datastructures.Utils.SortingUtil;

public class MergeSort extends SortingUtil {
	
	private int[] sortedArray = null;

	public int[] sort(int[] unsortedArray) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public void mergeSort(int[] unsortedArray) {
		int inputLength = unsortedArray.length;

		if (inputLength < 2) {
			return;
		}
		
		int midPoint = inputLength / 2;
		
		int[] leftHalf = new int[midPoint];
		int[] rightHalf = new int[inputLength - midPoint];
		
		System.arraycopy(unsortedArray, 0, leftHalf, 0, midPoint);
		System.arraycopy(unsortedArray, midPoint, rightHalf, 0, (inputLength - midPoint));
		
		//recursion
		mergeSort(leftHalf);
		mergeSort(rightHalf);
		
		//merge
		sortedArray = merge(unsortedArray, leftHalf, rightHalf);
	}

	private int[] merge(int[] inputArray,int[] leftHalf,int[] rightHalf) {
		int leftSize = leftHalf.length;
		int rightSize = rightHalf.length;
		
		int i=0, j=0, k=0;
		
		while(i < leftSize && j < rightSize) {
			if(leftHalf[i] <= rightHalf[j]) {
				inputArray[k] = leftHalf[i];
				i++;
			}
			else {
				inputArray[k] = rightHalf[j];
				j++;
			}
			k++;
		}
		while( i < leftSize) {
			inputArray[k] = leftHalf[i];
			i++;
			k++;
		}
		while( j < rightSize) {
			inputArray[k] = rightHalf[j];
			j++;
			k++;
		}
		return inputArray;
	}
	
	public int[] getSortedArray() {
		return sortedArray;
	}

	@Override
	public String toString() {
		return "MergeSort [sortedArray=" + Arrays.toString(sortedArray) + "]";
	}
	
}
