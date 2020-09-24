package Leetcode_August_Challenge;

public class Day4_PowerOfFour {

	public static void main(String[] args) {

		int num = 64;
		System.out.println(isPowerOfFour(num));
		System.out.println(isPowerOfFour(5));
		System.out.println(isPowerOfFour_log(num));
		System.out.println(isPowerOfFour_log(5));
	}

	// approach 1- using loop
	public static boolean isPowerOfFour(int num) {
		if (num == 0) {
			return false;
		}
		while (num > 1) {
			if (num % 4 != 0) {
				return false;
			}
			num = num / 4;
		}
		if (num == 1) {
			return true;
		} else {
			return false;
		}
	}

	// approach 2- using log
	public static boolean isPowerOfFour_log(int num) {
		if (num == 0) {
			return false;
		}
		double logn = Math.log(num) / Math.log(4);
		// System.out.println(Math.floor(logn) + " "+ Math.ceil(logn));
		return Math.floor(logn) == Math.ceil(logn);
	}
}
