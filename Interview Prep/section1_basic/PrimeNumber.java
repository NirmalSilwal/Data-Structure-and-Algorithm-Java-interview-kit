package section1_basic;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter any number to check for prime: ");
		int n = sc.nextInt();

		boolean flag = true;
		int counter = 2;

		while (counter <= n / 2) {
			if (n % counter == 0) {
				flag = false;
				break;
			}
			counter++;
		}

		if (flag == false) {
			System.out.println(n + " is not Prime");
		} else {
			System.out.println(n + " is Prime");

		}
		sc.close();
	}

}
