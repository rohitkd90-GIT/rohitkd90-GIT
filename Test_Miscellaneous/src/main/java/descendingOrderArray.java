import java.util.Scanner;

public class descendingOrderArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try (Scanner input = new Scanner(System.in)) {
			System.out.println("Specify the size of the array :" + " ");
			int noOfElements = input.nextInt();
			int arr[] = new int[noOfElements];
			System.out.println("Enter the array contents");
			for (int i = 0; i < arr.length; i++) {
				arr[i] = input.nextInt();
			}

			// Bubble Sort to do descending order
			int temp = 0;
			for (int i = 0; i < arr.length; i++) {
				for (int j = i + 1; j < arr.length; j++) {
					if (arr[i] > arr[j]) {
						temp = arr[i];
						arr[i] = arr[j];
						arr[j] = temp;
					}
				}
			}
			System.out.println("The array in descending order is :");
			for (int i = 0; i < arr.length; i++) {
				System.out.println(arr[i]);
			}

		}

	}
}
