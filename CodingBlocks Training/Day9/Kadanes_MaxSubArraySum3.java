package Lecture9;

public class Kadanes_MaxSubArraySum3 {

	public static void main(String[] args) {
		int[] arr = { 3, 1, 5, -2, -4, 6 };
		System.out.println(max_subarray_sum3(arr));
	}

	public static int max_subarray_sum3(int[] arr) {
		int max = Integer.MIN_VALUE;
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
			if (sum > max) {
				max = sum;
			}
			if (sum < 0) {
				sum = 0;
			}
		}

		return max;
	}
}
