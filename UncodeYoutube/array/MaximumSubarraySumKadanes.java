package array;

public class MaximumSubarraySumKadanes {

	private static int maximumSubarrySum(int[] arr) {

		int max = Integer.MIN_VALUE;
		int sum = 0;

		for (int i = 0; i < arr.length; i++) {

			sum += arr[i];

			if (sum > max) {
				max = sum;
			}
			if (sum < 0) {
				sum = 0;
			}
		}

		return max;
	}

	public static void main(String[] args) {
		int[] arr = { 3, 2, -7, 8, 9, -2, -1, 10 }; // 24
		System.out.println(maximumSubarrySum(arr)); 
	}
}
