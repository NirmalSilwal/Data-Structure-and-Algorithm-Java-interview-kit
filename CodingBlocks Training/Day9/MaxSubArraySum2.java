package Lecture9;

public class MaxSubArraySum2 {

	public static void main(String[] args) {
		int[] arr = { 3, 1, 5, -2, -4, 6 };
		System.out.println(max_subarray_sum2(arr));
	}

	public static int max_subarray_sum2(int[] arr) {

		int max = Integer.MIN_VALUE;

		for (int i = 0; i < arr.length; i++) {

			int sum = 0;
			for (int j = i; j < arr.length; j++) {

				sum = sum + arr[j];

				if (sum > max) {
					max = sum;
				}
			}
		}

		return max;
	}
}
