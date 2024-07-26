import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CheckDuplicateNumberInArray {

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
			int count = 0;
			List<Integer> newArr = new ArrayList<Integer>(noOfElements);
			// boolean checkArray = newArr.isEmpty();
			for (int i = 0; i < arr.length; i++) {
				for (int j = i + 1; j < arr.length; j++) {
					if (arr[i] == arr[j]) {

						count = count + 1;
						int appendNo = arr[i];
						// if (!checkArray == && newArr.get(i) != appendNo) {
						newArr.add(appendNo);
						// }
					}
				}
				if (count > 0) {
					System.out.println(
							arr[i] + " " + "is a duplicate number and is present" + " " + (count + 1) + " " + "times");
					count = 0;
					break;
				}

			}

			// if (checkArray == false) {
			for (int i = 0; i < newArr.size(); i++) {
				System.out.println("The new array is" + " " + newArr.get(i));
			}

			// }
		}
	}

}