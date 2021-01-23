package com.maharishiuniversity.admit.practiceTest.frequentQn;

/*
 * Write a method named getExponent(n, p) that returns the largest exponent x such that p^x
 * evenly divides n. If p is <= 1 the method should return -1.

 * For example, getExponent(162, 3) returns 4 because 162 = 2^1 * 3^4, 
 * therefore the value of x here is 4.
 */
public class GetExponent {

	public static void main(String[] args) {
		System.out.println(getExponent(162, 3)); // 4
		System.out.println(getExponent(27, 3)); // 3
		System.out.println(getExponent(28, 3)); // 0
		System.out.println(getExponent(280, 7)); // 1
		System.out.println(getExponent(-250, 5)); // 3
		System.out.println(getExponent(18, 1)); // -1
		System.out.println(getExponent(128, 4)); // 3
	}

	static int getExponent(int n, int p) {
		if (p <= 1)
			return -1;

		int x = 0;
		int power = 1;
		while (n % (int) Math.pow(p, power) == 0) {
			x = power;
			power++;
		}

		return x;
	}

}
