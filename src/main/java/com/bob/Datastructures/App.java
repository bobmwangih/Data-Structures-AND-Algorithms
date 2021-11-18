package com.bob.Datastructures;


import com.bob.Datastructures.BubbleSort.BubbleSortArray;
import com.bob.Datastructures.InsertionSort.InsertionSortArray;
import com.bob.Datastructures.SelectionSort.SelectionSortArray;
import com.bob.Datastructures.ShellSort.ShellSortArray;
import com.bob.Datastructures.Utils.SortingInterface;

public class App 
{   
	//Bubble Sort O(n2)Quadratic
    static void bubbleSorting() {
    	SortingInterface sortingInterface = new BubbleSortArray();
    	sortingInterface.sortedArrayLogging(sortingInterface.sort(new int[] {20,35,-15,7,55,1,-22}));
    }
	//Selection Sort O(n2)Quadratic
    static void selectionSorting() {
    	SortingInterface sortingInterface = new SelectionSortArray();
        sortingInterface.sortedArrayLogging(sortingInterface.sort(new int[] {20,35,-15,7,55,1,-22}));
    }
	//Insertion Sort O(n2)Quadratic
    static void insertionSorting() {
    	SortingInterface sortingInterface = new InsertionSortArray();
        sortingInterface.sortedArrayLogging(sortingInterface.sort(new int[] {20,35,-15,7,55,1,-22}));
    }
	//SHell Sort 
    static void shellSorting() {
    	SortingInterface sortingInterface = new ShellSortArray();
        sortingInterface.sortedArrayLogging(sortingInterface.sort(new int[] {20,35,-15,7,55,1,-22,45,99,33}));
    }
    
    public static void main( String[] args )
    {
    	//bubbleSorting();
    	//selectionSorting();
    	//insertionSorting();
    	shellSorting();
    }

}
