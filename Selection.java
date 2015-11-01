package sorting;

public class Selection {
	public static void  selectionSort(int testArray[]){
		for (int i = 0; i < testArray.length - 1; i++)
        {
            int tempIndex = i; //tempIndex is the lower value Index
            for (int j = i + 1; j < testArray.length; j++){
            	if (testArray[j] < testArray[tempIndex])//check if current current Index Value is lower or not
            		tempIndex = j; //new lower value Index
            };
            //swap
            swap.swapNumber(tempIndex, i, testArray);
        }//end of outer for loop		
		
	};//end of selectionSort
};//end of class
