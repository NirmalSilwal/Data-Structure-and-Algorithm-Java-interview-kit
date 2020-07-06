package Lecture2_1;

import java.util.Scanner;

public class NthFibonacci {

	public static void main(String[] args) {

		int firstNum = 0;
		int secondNum = 1;
		int counter = 1;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter nth term value: ");
		int nth = sc.nextInt();

		while (counter <= nth) {
			int next = firstNum + secondNum;
			firstNum = secondNum;
			secondNum = next;

			counter++;
		}

		System.out.println(nth + "th Fibonacci number is: " + firstNum);
	}
}
