package com.bob.Datastructures;


import com.bob.Datastructures.BubbleSort.BubbleSortArray;
import com.bob.Datastructures.InsertionSort.InsertionSortArray;
import com.bob.Datastructures.MergeSort.MergeSort;
import com.bob.Datastructures.Recursion.Recursion;
import com.bob.Datastructures.SelectionSort.SelectionSortArray;
import com.bob.Datastructures.ShellSort.ShellSortArray;
import com.bob.Datastructures.Utils.ArrayGenerator;
import com.bob.Datastructures.Utils.SortingInterface;
import com.bob.Datastructures.Utils.SortingUtil;

public class App 
{   
	
	//Bubble Sort O(n2)Quadratic
    static void bubbleSorting() {
    	SortingUtil sortingUtil = new BubbleSortArray();
        sortingUtil.sortedArrayLogging(sortingUtil.sort(new int[] {20,35,-15,7,55,1,-22,45,99,33}));
    }
	//Selection Sort O(n2)Quadratic
    static void selectionSorting() {
    	SortingUtil sortingUtil = new SelectionSortArray();
        sortingUtil.sortedArrayLogging(sortingUtil.sort(new int[] {20,35,-15,7,55,1,-22,45,99,33}));
    }
	//Insertion Sort O(n2)Quadratic
    static void insertionSorting() {
    	SortingUtil sortingUtil = new InsertionSortArray();
        sortingUtil.sortedArrayLogging(sortingUtil.sort(new int[] {20,35,-15,7,55,1,-22,45,99,33}));
    }
	//SHell Sort 
    static void shellSorting() {
    	//SortingInterface sortingInterface = new ShellSortArray();
    	SortingUtil sortingUtil = new ShellSortArray();
        sortingUtil.sortedArrayLogging(sortingUtil.sort(new int[] {20,35,-15,7,55,1,-22,45,99,33}));
    }
    
	//merge Sort 
    static void mergeSorting() {
    	ArrayGenerator arrayGenerator = new ArrayGenerator();
    	SortingInterface sortingInterface = new MergeSort() ;
    	((MergeSort) sortingInterface).mergeSort(arrayGenerator.arrayGen(new int[1000]));
    	System.out.println(((MergeSort) sortingInterface).toString());
    }
    
    public static void main( String[] args )
    {
    	//bubbleSorting();
    	//selectionSorting();
    	//insertionSorting();
    	//shellSorting();
    	//System.out.println(Recursion.recursion(3));
    	mergeSorting();
    }

}
