import java.util.Scanner;

import org.testng.annotations.Test;

public class SortingAndSearchingOfElements {
	// @Test
	public void TakeArrayAsInputAndPrint() {

		try (Scanner s = new Scanner(System.in)) {
			System.out.println("Enter the length of the array");

			// Initialize the size of the array
			int arraySize = 0;

			// User inputs the size of the array
			if (s.hasNextInt()) {
				arraySize = s.nextInt();
			}

			// Declare and initialize the array of numbers
			int[] arrayOfNum = new int[arraySize];

			// User inputs the array of numbers
			System.out.println("Enter the array of numbers");
			for (int i = 0; i < arraySize; i++) {
				if (s.hasNextInt()) {
					arrayOfNum[i] = s.nextInt();
				}
			}

			// Print the array
			System.out.print("The array of numbers is : ");
			for (int i = 0; i < arraySize; i++) {

				System.out.print(arrayOfNum[i] + " ");

			}
		}
	}

	@Test
	public void BubbleSort() {

		int[] arrOfNum = { 352, 258, 717, 1432, 1, 6000 };
		int size = arrOfNum.length;
		int temp = 0;

		for (int i = 0; i < size; i++) {
			for (int j = i + 1; j < size; j++) {
				if (arrOfNum[i] > arrOfNum[j]) { // Sort it in Ascending or descending order
					temp = arrOfNum[i];
					arrOfNum[i] = arrOfNum[j];
					arrOfNum[j] = temp;
				}
			}
		}

		// Print the sorted array
		System.out.println("The sorted array is : ");
		for (int i = 0; i < size; i++) {
			System.out.print(arrOfNum[i] + " ");
		}

		// Print the second largest element in the array
		System.out.println("\n" + "The second largest element in the array is : " + arrOfNum[size - 2]);
		
		//next code coming soon
	}
}
