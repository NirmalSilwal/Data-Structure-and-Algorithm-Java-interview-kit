package com.maharishiuniversity.admit.practiceTest.frequentQn;

public class FibonacciNumberChecking {

	public static void main(String[] args) {
		System.out.println(isFibonacci(1)); // 1
		System.out.println(isFibonacci(3)); // 1
		System.out.println(isFibonacci(9)); // 0

	}

	// O(K) Time, where K is kth fibonacci number | O(1) Space
	static int isFibonacci(int n) {
		int first = 1;
		int second = 1;
		int temp = first;

		while (second <= n) {
			if (second == n)
				return 1;
			temp = first + second;
			first = second;
			second = temp;
		}
		return 0;
	}
}
