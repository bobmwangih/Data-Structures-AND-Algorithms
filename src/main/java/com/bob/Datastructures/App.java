package com.bob.Datastructures;

import java.util.Arrays;
import java.util.stream.IntStream;

import com.bob.Datastructures.BubbleSort.BubbleSortArray;
import com.bob.Datastructures.CountingSort.CountingSort;
import com.bob.Datastructures.InsertionSort.InsertionSortArray;
import com.bob.Datastructures.MergeSort.MergeSort;
import com.bob.Datastructures.QuickSort.QuickSort;
import com.bob.Datastructures.SelectionSort.SelectionSortArray;
import com.bob.Datastructures.ShellSort.ShellSortArray;
import com.bob.Datastructures.Utils.ArrayGenerator;
import com.bob.Datastructures.Utils.ArrayUtil;
import com.bob.Datastructures.Utils.SortingInterface;
import com.bob.Datastructures.Utils.SortingUtil;

public class App {
	// Bubble Sort O(n2)Quadratic
	static void bubbleSorting() {
		SortingInterface sortingUtil = new BubbleSortArray();
		ArrayUtil.print(sortingUtil.sort(ArrayUtil.arrayGen(new Object[1000])));
		ArrayUtil.print(sortingUtil.sort(new String[] { "la","Kenya", "azimio", "umoja" }));
	}

	// Selection Sort O(n2)Quadratic
	static void selectionSorting() {
		SortingInterface sortingUtil = new SelectionSortArray();
		// ArrayUtil.print(sortingUtil.sort(ArrayUtil.arrayGen(new Object[10])));
		// ArrayUtil.print(sortingUtil.sort(new String []
		// {"azimio","azimo","la","umoja"}));
		ArrayUtil.print(((SelectionSortArray) sortingUtil).sortUsingStreams(ArrayUtil.arrayGen(new Object[10])));
		ArrayUtil.print(((SelectionSortArray) sortingUtil).sortUsingStreams(new String[] { "la","kenya", "azimio", "umoja" }));
	}

	// Insertion Sort O(n2)Quadratic
	static void insertionSorting() {
		SortingUtil sortingUtil = new InsertionSortArray();
		sortingUtil.print(sortingUtil.sort(sortingUtil.arrayGen(new int[1000])));
	}

	// SHell Sort
	static void shellSorting() {
		// SortingInterface sortingInterface = new ShellSortArray();
		SortingUtil sortingUtil = new ShellSortArray();
		sortingUtil.print(sortingUtil.sort(sortingUtil.arrayGen(new int[1000])));
	}

	// merge Sort
	static void mergeSorting() {
		SortingUtil sortingUtil = new MergeSort();
		sortingUtil.print(sortingUtil.sort(sortingUtil.arrayGen(new int[1000])));
	}

	// quick Sort average(O(log n)) worst (O (n2))
	static void quickSorting() {
		SortingUtil sortingUtil = new QuickSort();
		sortingUtil.print(sortingUtil.sort(sortingUtil.arrayGen(new int[1000])));
	}

	// counting sort average-linear( ideal when the range of values in the array is
	// equal to the no. of items )
	static void countSorting() {
		SortingUtil sortingUtil = new CountingSort();
		sortingUtil.print(sortingUtil.sort(sortingUtil.arrayGen(new int[1000])));
	}

	// Radix sort
	static void radixSort() {
		SortingUtil sortingUtil = new RadixSort();
		sortingUtil.print(sortingUtil.sort(sortingUtil.arrayGen(new int[1000])));
	}

	static void swapper(int[] array, int left, int right) {
		System.out.println("Array before swap: "+ Arrays.toString(array));
		int parentValue = array[left];
		System.out.println("left element to be swapped: "+ parentValue);
		System.out.println("right element to be swapped: "+ array[right]);
		array[left] = array[right];
		array[right] = parentValue;
		System.out.println("Array after swap: "+ Arrays.toString(array));
	}

	static int[] test() {
		// Object[] testingArray = ArrayGenerator.arrayGen(new Object[10]);
		int[] testArray = new int[] { 13,99,5,19,0,0,9,7,2,1};
		IntStream.range(0, testArray.length).forEach(index -> {
			IntStream.range(index , testArray.length)
					.reduce((left, right) -> testArray[left] < testArray[right] ? left : right).ifPresent(smallest -> {
						if(smallest != index) {
							System.out.println("the smallest index is: "+ smallest);
							System.out.println("the index is: "+ index);
							swapper(testArray, index, smallest);
						}
					});
		});
		return testArray;
	}

	public static void main(String[] args) {
		// bubbleSorting();
		 selectionSorting();
		// insertionSorting();
		// shellSorting();
		// System.out.println(Recursion.recursion(3));
		// mergeSorting();
		// quickSorting();
		// countSorting();
		// radixSort();
		//System.out.println(Arrays.toString(test()));
	}

}
