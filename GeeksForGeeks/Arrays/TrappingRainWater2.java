package gfg.Arrays;

public class TrappingRainWater2 {

	public static void main(String[] args) {
		int[] arr = { 3, 0, 1, 2, 5 };
		int[] arr2 = { 2, 0, 2 };
		int[] arr3 = { 1, 2, 3 };
		int[] arr4 = { 3, 2, 1 };
		int[] arr5 = { 3, 5, 2, 3 };
		int[] arr6 = { 5, 0, 6, 2, 3 };

		System.out.println(trappedWaterOptimal(arr)); // 6
		System.out.println(trappedWaterOptimal(arr2)); // 2
		System.out.println(trappedWaterOptimal(arr3)); // 0
		System.out.println(trappedWaterOptimal(arr4)); // 0
		System.out.println(trappedWaterOptimal(arr5)); // 1
		System.out.println(trappedWaterOptimal(arr6)); // 6

	}

	// O(n) Time | O(n) Space, n is length of array
	public static int trappedWaterOptimal(int[] arr) {
		int n = arr.length;

		if (n < 2) {
			return 0;
		}
		int result = 0;

		// computing leftMax and rightMax for each wall in between
		int[] leftMax = new int[n];
		int[] rightMax = new int[n];

		leftMax[0] = arr[0];
		for (int i = 1; i < n; i++) {
			leftMax[i] = Math.max(arr[i], leftMax[i - 1]);
		}

		rightMax[n - 1] = arr[n - 1];
		for (int i = n - 2; i >= 0; i--) {
			rightMax[i] = Math.max(arr[i], rightMax[i + 1]);
		}

		for (int i = 1; i < n - 1; i++) {
			result = result + (Math.min(leftMax[i], rightMax[i]) - arr[i]);
		}
		return result;
	}
}
