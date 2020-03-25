package _00_Sorting_Algorithms;

public class BubbleSorter extends Sorter{
	public BubbleSorter() {
		type = "Bubble";
	}
	
	//1. Use the bubble sorting algorithm to sort the array.
	//   You can use display.updateDisplay() to show the current
	//   progress on the graph.
	@Override
	void sort(int[] arr, SortingVisualizer display) {
		int length = arr.length;  
        int temp = 0;  
         for(int i=0; i < length; i++){  
            for(int j=1; j < (length-i); j++){  
               if(arr[j-1] > arr[j]){  
                  temp = arr[j-1];  
                  arr[j-1] = arr[j];  
                  arr[j] = temp;  
                  display.updateDisplay();
               }  
            }
         }
	}
	
}
