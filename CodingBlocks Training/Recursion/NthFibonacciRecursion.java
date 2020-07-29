package Recursion;

public class NthFibonacciRecursion {

	public static void main(String[] args) {

		int nth = 5;
		System.out.println(fibb(nth)); // 5

		System.out.println(fibb(0)); // 0
		System.out.println(fibb(1)); // 1
		System.out.println(fibb(7)); // 13
	}

	public static int fibb(int n) {

		if (n == 0) {
			return 0;
		}
		if (n == 1) {
			return 1;
		}

		int result = fibb(n - 1) + fibb(n - 2);

		return result;
	}
}
