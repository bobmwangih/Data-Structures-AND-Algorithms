package com.bob.Datastructures;

import java.util.Arrays;
import java.util.stream.IntStream;

import com.bob.Datastructures.BubbleSort.BubbleSortArray;
import com.bob.Datastructures.CountingSort.CountingSort;
import com.bob.Datastructures.InsertionSort.InsertionSortArray;
import com.bob.Datastructures.MergeSort.MergeSort;
import com.bob.Datastructures.QuickSort.QuickSort;
import com.bob.Datastructures.Recursion.Recursion;
import com.bob.Datastructures.SelectionSort.SelectionSortArray;
import com.bob.Datastructures.ShellSort.ShellSortArray;
import com.bob.Datastructures.Utils.ArrayUtil;
import com.bob.Datastructures.Utils.SortingInterface;
import com.bob.Datastructures.Utils.SortingUtil;

public class App {
	// Bubble Sort O(n2)Quadratic
	static void bubbleSorting() {
		SortingInterface sortingUtil = new BubbleSortArray<>();
		ArrayUtil.print(sortingUtil.sort(ArrayUtil.arrayGen(new Object[100])));
		ArrayUtil.print(sortingUtil.sort(new String[] { "la","kenya", "azimio", "umoja" }));
	}

	// Selection Sort O(n2)Quadratic
	static void selectionSorting() {
		SelectionSortArray sortingUtil = new SelectionSortArray<>();
		ArrayUtil.print((sortingUtil.sortUsingStreams( ArrayUtil.arrayGen(new Object[10]))));
		ArrayUtil.print( sortingUtil.sortUsingStreams(new String[] { "la","kenya", "azimio", "umoja" }));
	}

	// Insertion Sort O(n2)Quadratic
	static void insertionSorting() {
		SortingInterface sortingUtil = new InsertionSortArray<>();
		ArrayUtil.print(sortingUtil.sort(ArrayUtil.arrayGen(new Object[100])));
		ArrayUtil.print(sortingUtil.sort(new String[] { "la","kenya", "azimio", "umoja" }));
	}

	// SHell Sort
	static void shellSorting() {
		// SortingInterface sortingInterface = new ShellSortArray();
		SortingInterface sortingUtil = new ShellSortArray<>();
		ArrayUtil.print(sortingUtil.sort(ArrayUtil.arrayGen(new Object[10])));
		ArrayUtil.print(sortingUtil.sort(new String[] { "la","kenya", "azimio", "umoja" }));
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

	public static void main(String[] args) {
		//bubbleSorting();
		// selectionSorting();
		// insertionSorting();
		 shellSorting();
		// System.out.println(Recursion.recursion(3));
		//System.out.println(Recursion.fibonacci(9));
		//System.out.println(Arrays.toString(Recursion.sorterBubble(new String [] {"z","k","b","e"})));
		// mergeSorting();
		// quickSorting();
		// countSorting();
		// radixSort();
	}

}
