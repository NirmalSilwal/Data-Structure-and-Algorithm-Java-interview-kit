package section1_basic;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter nth term: ");
		int nth = sc.nextInt();

		printFiboncacci(nth);

		sc.close();
	}

	static void printFiboncacci(int n) {
		int zeroth = 0;
		int first = 1;

		System.out.print(zeroth + " " + first + " ");
		for (int i = 2; i <= n; i++) {
			int next = zeroth + first;
			System.out.print(next + " ");
			zeroth = first;
			first = next;
		}
	}

}
