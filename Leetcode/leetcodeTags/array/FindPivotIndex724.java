package leetcodeTags.array;

/*
 * LC post link: https://leetcode.com/problems/find-pivot-index/discuss/1231473/java-solution-brute-force-and-optimized-code
 */
public class FindPivotIndex724 {

	// O(N^2) Time | O(1) Space
	public static int pivotIndex1(int[] nums) {

		for (int i = 0; i < nums.length; i++) {
			int lsum = sumLeft(i, nums);
			int rsum = sumRight(i, nums);
			if (lsum == rsum) {
				return i;
			}
		}
		return -1;
	}

	private static int sumLeft(int i, int[] arr) {
		if (i == 0) {
			return 0;
		}
		int sum = 0;
		for (int idx = 0; idx < i; idx++) {
			sum += arr[idx];
		}
		return sum;
	}

	private static int sumRight(int i, int[] arr) {
		if (i == arr.length - 1) {
			return 0;
		}
		int sum = 0;
		for (int idx = i + 1; idx < arr.length; idx++) {
			sum += arr[idx];
		}
		return sum;
	}

	// O(N) Time | O(1) Space
	public static int pivotIndex(int[] nums) {
		int totalSum = 0;
		for (int n : nums)
			totalSum += n;

		int runningTotal = 0; // prefix sum

		for (int i = 0; i < nums.length; i++) {

			int lsum = runningTotal;
			runningTotal += nums[i];
			int rsum = totalSum - runningTotal;

			if (lsum == rsum)
				return i;
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] nums = { -1, -1, 0, 1, 1, 0 };
		System.out.println(pivotIndex(nums)); // 5
	}
}
