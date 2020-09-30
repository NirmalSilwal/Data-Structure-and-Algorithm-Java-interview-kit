package Lecture27;

//time complexity: O(n)
// it has better space complexity than fibonacciDyanamicProg.java using recursive apporach, though time
// complexity is same using DP approach.

public class fibonacciDPIterative {

	public static void main(String[] args) {

		int nthItem = 5;
		System.out.println(fibIterative(nthItem)); // 5

		System.out.println(fibIterative(0)); // 0
		System.out.println(fibIterative(1)); // 1
		System.out.println(fibIterative(6)); // 8
	}

	public static int fibIterative(int n) {
		int[] memStorage = new int[n + 1];
		return fibIterative(n, memStorage);
	}

	private static int fibIterative(int n, int[] storage) {
		if (n == 0 || n == 1) {
			return n;
		}

		storage[0] = 0;
		storage[1] = 1;

		for (int i = 2; i <= n; i++) {
			storage[i] = storage[i - 1] + storage[i - 2];
		}

		return storage[n];
	}

}
