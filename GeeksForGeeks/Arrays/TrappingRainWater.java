package gfg.Arrays;

public class TrappingRainWater {

	public static void main(String[] args) {

		int[] arr = { 3, 0, 1, 2, 5 };
		int[] arr2 = { 2, 0, 2 };
		int[] arr3 = { 1, 2, 3 };
		int[] arr4 = { 3, 2, 1 };

		System.out.println(trappedWaterVolume(arr)); // 6
		System.out.println(trappedWaterVolume(arr2)); // 2
		System.out.println(trappedWaterVolume(arr3)); // 0
		System.out.println(trappedWaterVolume(arr4)); // 0

	}

	// O(n^2) Time | O(1) Space
	public static int trappedWaterVolume(int[] arr) {
		int n = arr.length;
		int result = 0;

		// excluding first and last wall as they can't hold water
		for (int i = 1; i < n - 1; i++) {
			int leftMax = 0;
			int rightMax = 0;

			// finding left max item (leftmost tall wall) for arr[i] - current wall
			for (int j = 0; j < i; j++) {
				if (arr[j] > leftMax) {
					leftMax = arr[j];
				}
			}
			// finding right max item for arr[i] (rightmost tall wall from this wall)
			for (int k = i + 1; k < n; k++) {
				if (arr[k] > rightMax) {
					rightMax = arr[k];
				}
			}

			result = result + (Math.min(leftMax, rightMax) - arr[i]);

		}
		if (result > 0) {
			return result;
		}
		return 0;
	}
}
