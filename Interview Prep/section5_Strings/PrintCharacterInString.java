package section5_Strings;

import java.util.Scanner;

public class PrintCharacterInString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("enter string: ");
		String s = sc.nextLine();
		printChars(s);

		sc.close();
	}

	static void printChars(String s) {
		for (int i = 0; i < s.length(); i++) {
			System.out.println(s.charAt(i));
		}
	}
}
