package GeeksForGeeks;

import java.util.Scanner;

public class IfElseLadder {

	public static void main(String... args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter any number: ");
		int num = sc.nextInt();

		if (num > 0) {
			System.out.print("Positive ");
			if (num % 2 == 0) {
				System.out.print("Even");
			} else {
				System.out.print("Odd");
			}
		} else if (num < 0) {
			System.out.print("Negative ");
			if (num % 2 == 0) {
				System.out.print("Even");
			} else {
				System.out.print("Odd");
			}
		} else {
			System.out.println("zero");
		}
	}
}
