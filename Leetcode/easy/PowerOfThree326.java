package easy;

public class PowerOfThree326 {

	// this code gives TLE
	public static boolean isPowerOfThree1(int n) {
		if (n < 1)
			return false;

		int start = 1;
		while (start < n) {
			start = start * 3;
		}

		return start == n ? true : false;
	}

	public static boolean isPowerOfThree2(int n) {
		if (n < 1)
			return false;

		while (n != 0 && n % 3 == 0) {
			n = n / 3;
		}

		return n == 1 ? true : false;
	}

	public static boolean isPowerOfThree(int n) {
		return (Math.log10(n) / Math.log10(3)) % 1 == 0;
	}

	public static void main(String[] args) {
		System.out.println(isPowerOfThree(3));
		System.out.println(isPowerOfThree(9));
		System.out.println(isPowerOfThree(27));
		System.out.println(isPowerOfThree(81));
		System.out.println(isPowerOfThree(243));
		System.out.println(isPowerOfThree(729));

		System.out.println();
		System.out.println(isPowerOfThree(0));
		System.out.println(isPowerOfThree(85));
		System.out.println(isPowerOfThree(45));
		System.out.println(isPowerOfThree(56));
		System.out.println(isPowerOfThree(42));

	}
}
