package com.maharishiuniversity.admit.practiceTest.frequentQn;

public class NormalNumber {

	public static void main(String[] args) {
		System.out.println(isNormal(1)); // 1
		System.out.println(isNormal(3)); // 1
		System.out.println(isNormal(4)); // 1
		System.out.println(isNormal(5)); // 1
		System.out.println(isNormal(7)); // 1
		System.out.println(isNormal(8)); // 1
		System.out.println(isNormal(6)); // 0
		System.out.println(isNormal(9)); // 0
		System.out.println(isNormal(10)); // 0

	}

	static int isNormal(int n) {
		if (n == 1 || n == 2)
			return 1;

		for (int i = 3; i <= n / 2; i += 2) {
			if (n % i == 0)
				return 0;
		}
		return 1;
	}

}
