package sorting;

public class Quick {
	public static void quickSort(int firstIndex, int lastIndex, int[] testArray){
		int i = firstIndex;
		int j = lastIndex;
		int pivot = testArray[(firstIndex + lastIndex)/2 ]; //pivot is middle value of array so that we can partition the array
		while(i <= j){
			while(testArray[i] < pivot)
				i++;
			while(testArray[j] > pivot)
				j--;
			//swap 
			if(i <= j){
				swap.swapNumber(i, j, testArray);
				i++; j--;
			}
		}//end of outer while
		// recursion on first half
		if(firstIndex < j)
			quickSort(firstIndex, j, testArray);
		if(i < lastIndex)
			quickSort(i, lastIndex, testArray);
	}
}
