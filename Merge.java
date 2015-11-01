package sorting;

public class Merge {
	public static void mergeSort(int firstIndex, int lastIndex,int[] testArray){
		
		int tempNumber = lastIndex - firstIndex;         
        if (tempNumber <= 1) 
            return; 
        int middleIndex = firstIndex + tempNumber/2; 
        // recursively call the mergeSort so that we can get one one element
        mergeSort(firstIndex, middleIndex, testArray); 
        mergeSort(middleIndex, lastIndex, testArray); 
       
        // merge two sorted subarrays
        int[] temp = new int[tempNumber];
        int i = firstIndex, j = middleIndex;
        for (int k = 0; k < tempNumber; k++) 
        {
            if (i == middleIndex)  
                temp[k] = testArray[j++];
            
            else if (j == lastIndex) 
                temp[k] = testArray[i++];
            
            else if (testArray[j]<testArray[i]) 
                temp[k] = testArray[j++];
            
            else 
                temp[k] = testArray[i++];
        }
        //arrange the values in sorted
        for (int k = 0; k < tempNumber; k++) 
        	testArray[firstIndex + k] = temp[k];   
		
	}
}
