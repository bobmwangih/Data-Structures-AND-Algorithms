package com.bob.Datastructures;


import com.bob.Datastructures.BubbleSort.BubbleSortArray;
import com.bob.Datastructures.CountingSort.CountingSort;
import com.bob.Datastructures.InsertionSort.InsertionSortArray;
import com.bob.Datastructures.MergeSort.MergeSort;
import com.bob.Datastructures.QuickSort.QuickSort;
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
    	sortingUtil.print(sortingUtil.sort(sortingUtil.arrayGen(new int[1000])));
    }
	//Selection Sort O(n2)Quadratic
    static void selectionSorting() {
    	SortingUtil sortingUtil = new SelectionSortArray();
    	sortingUtil.print(sortingUtil.sort(sortingUtil.arrayGen(new int[1000])));
    	
    }
	//Insertion Sort O(n2)Quadratic
    static void insertionSorting() {
    	SortingUtil sortingUtil = new InsertionSortArray();
    	sortingUtil.print(sortingUtil.sort(sortingUtil.arrayGen(new int[1000])));
    }
	//SHell Sort 
    static void shellSorting() {
    	//SortingInterface sortingInterface = new ShellSortArray();
    	SortingUtil sortingUtil = new ShellSortArray();
    	sortingUtil.print(sortingUtil.sort(sortingUtil.arrayGen(new int[1000])));
    }
    
	//merge Sort 
    static void mergeSorting() {
    	SortingUtil sortingUtil = new MergeSort() ;
    	sortingUtil.print(sortingUtil.sort(sortingUtil.arrayGen(new int[1000])));
    }
    
	//quick Sort average(O(log n)) worst (O (n2))
    static void quickSorting() {
    	SortingUtil sortingUtil = new QuickSort();
    	sortingUtil.print(sortingUtil.sort(sortingUtil.arrayGen(new int[1000])));
    }
    
    //counting sort average-linear( ideal when the range of values in the array is equal to the no. of items )
    static void countSorting() {
    	SortingUtil sortingUtil  = new CountingSort();
    	sortingUtil.print(sortingUtil.sort(sortingUtil.arrayGen(new int [1000])));
    }
    
    public static void main( String[] args )
    {
    	//bubbleSorting();
    	//selectionSorting();
    	//insertionSorting();
    	//shellSorting();
    	//System.out.println(Recursion.recursion(3));
    	//mergeSorting();
    	//quickSorting();
    	countSorting();
    }

}
