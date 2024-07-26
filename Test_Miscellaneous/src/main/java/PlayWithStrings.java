import java.util.Scanner;

import org.testng.annotations.Test;

public class PlayWithStrings {

	// public static void main(String[] args) {

	// PlayWithStrings pls = new PlayWithStrings();
	// pls.NoOfWordsInSentence();
	// pls.SwapTwoWordsInSentenceUsingConcat();
	// pls.SwapTwoWordsInSentenceUsingStringBuilder();
	// pls.ReverseEachWordsInASentence();
	// }

	@Test
	public void NoOfWordsInSentence() {

		System.out.println("Enter the String :");
		try (Scanner sc = new Scanner(System.in)) {
			String input = sc.nextLine();
			String input2 = input.trim();
			// int s = input.split("\\s").length;

			System.out.println("The String entered by user is : " + input2);

			int c = 0;

			for (int i = 0; i < input2.length(); i++) {
				if (input2.charAt(i) == ' ')
					c = c + 1;
			}
			// System.out.println("The number of words is : " + s);
			System.out.println("The number of words is : " + (c + 1));
		} catch (Exception e) {
			System.out.println("In catch block");
		}
	}

	@Test
	public void SwapTwoWordsInSentenceUsingConcat() {

		System.out.println("Enter the String :");
		try (Scanner sc = new Scanner(System.in)) {
			String input1 = sc.nextLine();

			String str[] = input1.split(" ");
			String output = str[1] + " " + str[0];
			System.out.println("The reverse String : " + output);

		}

		catch (Exception e) {
			System.out.println("In catch block");
		}
	}

	@Test
	public void SwapTwoWordsInSentenceUsingStringBuilder() {

		System.out.println("Enter the String :");
		try (Scanner sc = new Scanner(System.in)) {

			String input1 = sc.nextLine();
			StringBuilder sb = new StringBuilder();
			String str[] = input1.split(" ");

			sb.append(str[1]);
			sb.append(" ");
			sb.append(str[0]);

			System.out.println("The reverse String : " + sb);

		}

		catch (Exception e) {
			System.out.println("In catch block");
		}
	}

	@Test
	public void ReverseEachWordsInASentence() {

		// System.out.println("Enter the String :");
		try {

			String input1 = "Hey there whats Up?";
			System.out.println("The String entered is : " + input1);
			StringBuffer s = new StringBuffer(input1);
			// input1 = s.reverse().toString();
			// input1 = s.toString();
			// System.out.println("The reverse String buffer is : " + input1);

			// String newStr = s.toString();

			String str[] = input1.split("\\s");

			StringBuffer rev = new StringBuffer();

//			for (int i = str.length - 1; i >= 0; i--) {
//
//				rev.append(str[i]).append(' ');
//
//			}

			for (int i = 0; i < str.length; i++) {

				// rev.append(str[i]).append(' ');
				rev.append(str[i]).reverse().append(' ');

			}

			System.out.println("The reverse String : " + rev.toString());

		}

		catch (Exception e) {
			System.out.println("In catch block");
		}
	}
}
