package sorting;

public class swap {
	public static void swapNumber(int i, int j, int[] testArray){
		//if 2nd value is small than switch
		int tempValue = testArray[i];
		testArray[i] = testArray[j]; 
		testArray[j] = tempValue;
	}
}
