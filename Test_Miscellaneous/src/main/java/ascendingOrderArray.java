import java.util.Scanner;

public class ascendingOrderArray {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			int n;
			System.out.println("Enter how many elements do you wanna enter in the array? ");
			n = sc.nextInt();
			// System.out.println("Enter name");
			// String name = sc.next();
			// System.out.println("My Name is :" + " " + name);
			int arr[] = new int[n];
			System.out.println("Array contents: ");

			for (int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();

			}
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

			for (int i = 0; i < arr.length; i++) {
				System.out.println("The sorted array is:" + " " + arr[i]);

			}
		}
	}
}