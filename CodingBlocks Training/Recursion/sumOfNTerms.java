package Recursion;

public class sumOfNTerms {

	public static void main(String[] args) {

		int n = 10;
		System.out.println(nthSum(n)); // 55
		System.out.println(nthSum(3)); // 6
	}

	public static int nthSum(int n) {
		if (n == 0) {
			return 0;
		}
		return n + nthSum(n - 1);
	}
}
