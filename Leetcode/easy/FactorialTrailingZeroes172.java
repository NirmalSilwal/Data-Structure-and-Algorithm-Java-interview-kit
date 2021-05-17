package easy;

import java.math.BigInteger;

public class FactorialTrailingZeroes172 {

	public static int trailingZeroesNonOptimal(int n) {

		BigInteger factN = factorial(n);

		int count = 0;

		while (factN.mod(BigInteger.TEN).equals(BigInteger.ZERO)) {
			factN = factN.divide(BigInteger.valueOf(10));
			count++;
		}

		return count;
	}

	// iterative approach to find factorial
	private static BigInteger factorial(int n) {
		if (n == 0 || n == 1)
			return BigInteger.ONE;

		BigInteger ans = BigInteger.ONE;

		for (int i = 2; i <= n; i++) {
			ans = ans.multiply(BigInteger.valueOf(i));
		}

		return ans;
	}

	// recursive approach to find factorial
	private static BigInteger factorialRec(int n) {
		if (n == 0 || n == 1)
			return BigInteger.ONE;

		return BigInteger.valueOf(n).multiply(factorialRec(n - 1));
	}

	// optimal code - accepted Oms solution
	public static int trailingZeroes(int n) {

		int count = 0;

		while (n > 0) {
			n = n / 5;
			count = count + n;
		}

		return count;
	}

	public static void main(String[] args) {
		System.out.println(trailingZeroes(10000));
	}
}
