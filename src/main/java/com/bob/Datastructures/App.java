package com.bob.Datastructures;


import com.bob.Datastructures.BubbleSort.BubbleSortArray;
import com.bob.Datastructures.SelectionSort.SelectionSortArray;
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
    
    
    public static void main( String[] args )
    {
    	//bubbleSorting();
    	selectionSorting();
    
    }

}
