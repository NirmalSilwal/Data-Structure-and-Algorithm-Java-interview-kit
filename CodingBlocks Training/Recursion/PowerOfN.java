package Recursion;

public class PowerOfN {

	public static void main(String[] args) {

		int n = 5;
		int num = 2;
		System.out.println(powerN(num, n)); // 32
		System.out.println(powerN(2, 0)); // 1
		System.out.println(powerN(3, 4));// 81
		System.out.println(powerN(5, 4)); // 625
		System.out.println(powerN(2, 1)); // 2

	}

	public static int powerN(int num, int n) {
		if (n == 0) {
			return 1;
		}
		int result = num * powerN(num, n - 1);

		return result;
	}
}
