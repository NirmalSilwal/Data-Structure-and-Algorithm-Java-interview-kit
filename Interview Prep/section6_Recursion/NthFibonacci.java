package section6_Recursion;

public class NthFibonacci {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			System.out.println(fibonacci(i));
		}
	}

	// return nth fibonacci number in series
	static int fibonacci(int n) {
		if (n < 1)
			return 0;
		if (n == 1)
			return 1;

		int fibnm1 = fibonacci(n - 1);
		int fibnm2 = fibonacci(n - 2);

		int ans = fibnm1 + fibnm2;

		return ans;
	}
}
