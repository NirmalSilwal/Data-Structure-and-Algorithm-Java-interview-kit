package practice.revisited;

// leetcode 53. Maximum Subarray
public class MaximumSubarrayLC53 {

	public static int maxSubArray(int[] nums) {

		int maxsum = Integer.MIN_VALUE;
		int currsum = 0;

		for (int n : nums) {

			currsum += n;
			maxsum = Math.max(currsum, maxsum);

			if (currsum < 0)
				currsum = 0;
		}

		return maxsum;
	}

	public static void main(String[] args) {
		int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		System.out.println(maxSubArray(arr));

		System.out.println(maxSubArray(new int[] { 1 }));
		System.out.println(maxSubArray(new int[] { 5, 4, -1, 7, 8 }));
	}
}
