package sorting;

import java.util.Scanner;

public class handler {
	private static Scanner scanner = new Scanner(System.in);
	public static int[] input(){
		System.out.print("How many value you want to sort :	 ");
		int number = scanner.nextInt();
		int testArray[] = new int[number];
		for (int i = 0; i < testArray.length; i++) {
			System.out.print("Enter value "+i+" :	");
			testArray[i] = scanner.nextInt();
		};
		return testArray;	
	};//end of input
	public static void print(int[] testArray){
		System.out.println("Sorted Array...\n");
		for (int i = 0; i < testArray.length; i++) {
			System.out.print(testArray[i]+" ");
		};
		System.out.println("\n");
	};//end of print
	public static void choice(int choice){
		int testArray[];
		switch (choice) {
		case 0:
			System.exit(0);
			break;
		case 1:
			testArray = input();
			Insertion.insertionSort(testArray);
			print(testArray);
			showSelection();
			break;
		case 2:
			testArray = input();
			Selection.selectionSort(testArray);
			print(testArray);
			showSelection();
			break;
		case 3:
			testArray = input();
			Bubble.bubbleSort(testArray);
			print(testArray);
			showSelection();
			break;
		case 4:
			testArray = input();
			Merge.mergeSort(0, testArray.length, testArray);
			print(testArray);
			showSelection();
			break;
		case 5:
			testArray = input();
			Quick.quickSort(0, testArray.length-1, testArray);
			print(testArray);
			showSelection();
			break;
		default:
			System.out.println("Invalid Choice...");
			showSelection();
			break;
		};
	}
	public static void showSelection(){
		System.out.print("1. Insertion Sort \n2. Selection Sort \n3. Bubble Sort \n4. Merge Sort \n5. Quick Sort \n Enter Your Choice:	");
		int choice =  scanner.nextInt();
		choice(choice);	
	}
}
