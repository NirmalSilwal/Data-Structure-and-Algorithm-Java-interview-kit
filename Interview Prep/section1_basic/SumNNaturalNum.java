package section1_basic;

import java.util.Scanner;

public class SumNNaturalNum {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter n:");
		int n = sc.nextInt();

		int sum = 0;
		int counter = 1;
		while (counter <= n) {
			sum += counter;
			counter++;
		}

		System.out.println("Sum of first " + n + " Natural Numbers is: " + sum);

		sc.close();
	}

}
