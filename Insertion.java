package sorting;

public class Insertion {
	//insertionSort is static so we can call this function with class name.
	//no need to create an obj for calling this function
	public static void insertionSort(int testArray[])
	{
		for (int i = 1; i < testArray.length; i++) {
			//inner for loop for comparing values of array
			for (int j = i; j > 0; j--) {
				//check if 1st value is small than 2nd or not 
				if(testArray[j] < testArray[j-1]){
					//swap
					swap.swapNumber(j, j-1, testArray);
				};
			};//end of inner for loop
			
		};//end of outer for loop
		
		
	};//end of insertionSort
};//end of class
