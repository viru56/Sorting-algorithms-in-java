package sorting;

public class Bubble {
	public static void bubbleSort( int testArray[]){
		int arrLength = testArray.length;
        int key;
        //iterate array till array length
        for (int m = arrLength; m >= 0; m--) {
            for (int i = 0; i < arrLength - 1; i++) {
            	key = i + 1;
            	//compare two value and swap
                if (testArray[i] > testArray[key]) {
                	//swap
                	swap.swapNumber(i, key, testArray);
                }
            }//end of inner for loop
        }//end of outer for loop
		
	}
}
