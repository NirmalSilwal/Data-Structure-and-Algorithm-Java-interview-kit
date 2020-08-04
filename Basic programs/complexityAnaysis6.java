package BasicPractice;

// complexity: O(n)

public class complexityAnaysis6 {

	public static void main(String[] args) {

		int num = 5;
		System.out.println(factorial(num)); // 120
		System.out.println(factorial(0)); // 1
		System.out.println(factorial(6)); // 720
	}

	// computes factorial recursively
	public static int factorial(int n) {
		if (n < 0)
			return -1;

		if (n == 0 | n == 1)
			return 1;

		return n * factorial(n - 1); // recursive call
	}
}
