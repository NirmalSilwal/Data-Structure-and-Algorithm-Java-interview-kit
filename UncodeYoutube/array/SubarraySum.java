package array;

import java.util.Scanner;

public class SubarraySum {

	public static int findSubarraySum(int[] arr, int start, int end) {
		// make prefix sum array
		int[] prefix = new int[arr.length];
		prefix[0] = arr[0];

		for (int i = 1; i < prefix.length; i++) {
			prefix[i] = prefix[i - 1] + arr[i];
		}

		if (start == end || (start - 1) < 0) {
			return prefix[end];
		}
		return prefix[end] - prefix[start - 1];
	}

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5 };

		Scanner sc = new Scanner(System.in);

		int queries = sc.nextInt();

		for (int testcase = 0; testcase < queries; testcase++) {
			int start = sc.nextInt();
			int end = sc.nextInt();
			System.out.println(findSubarraySum(arr, start, end));
		}
		sc.close();
	}
}

/* test case- 
4
0 2
1 4
2 4
1 1
*/