package Lecture10;

public class Factorial {

	public static void main(String[] args) {

		int n = 5;

		System.out.println(factorial(n));
		System.out.println(factorial(0));
	}

	public static int factorial(int n) {
		if (n == 0 | n == 1) {
			return 1;
		} else {
			return n * factorial(n - 1);
		}
	}
}
