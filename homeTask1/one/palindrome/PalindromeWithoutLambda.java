package one.palindrome;

import java.util.Scanner;

public class PalindromeWithoutLambda {

	public static boolean isPalindrome(String str) {
		StringBuilder rev = new StringBuilder();

		for (int i = str.length() - 1; i >= 0; i--) {
			rev = rev.append(str.charAt(i));
		}

		System.out.println(rev);

		if (str.equalsIgnoreCase(rev.toString())) {
			return true;
		} else {
			return false;
		}

	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		scan.close();
		System.out.println("The Palindrome status of given String " + str + " is: " + isPalindrome(str));

	}

}
