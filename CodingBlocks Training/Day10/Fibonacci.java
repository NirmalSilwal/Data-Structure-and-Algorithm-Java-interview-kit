package Lecture10;

public class Fibonacci {

	public static void main(String[] args) {

		int nth = 6;
		System.out.println(fibonacci(nth)); // 8
		System.out.println(fibonacci(0)); // 0
		System.out.println(fibonacci(5)); // 5
		System.out.println(fibonacci(7)); // 13

	}

	public static int fibonacci(int n) {
		if (n == 0) {
			return 0;
		}
		if (n == 1) {
			return 1;
		}
		return fibonacci(n - 1) + fibonacci(n - 2);
	}
}
