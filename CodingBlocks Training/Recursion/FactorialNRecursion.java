package Recursion;

public class FactorialNRecursion {

	public static void main(String[] args) {

		int num = 4;
		System.out.println(factorial(num)); // 24
		System.out.println(factorial(0)); // 1
	}

	public static int factorial(int n) {
		if (n == 0 | n == 1) {
			return 1;
		} else {
			return n * factorial(n - 1);
		}
	}
}
