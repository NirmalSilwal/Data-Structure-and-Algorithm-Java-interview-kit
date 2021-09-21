package MustDoEasyList;

public class PeakIndexInMountainArray852 {

	// O(N) time, O(1) space
	public static int peakIndexInMountainArray(int[] arr) {

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < arr[i - 1]) {
				return i - 1;
			}
		}

		return arr.length - 1;
	}

	// 2nd approach, O(LogN) time, O(1) space
	public static int peakIndexInMountainArray2(int[] arr) {

		int low = 0, high = arr.length - 1;
		int ans = 0;

		while (low < high) {

			int mid = low + (high - low) / 2;

			if (arr[mid] > arr[mid + 1]) {
				ans = mid;
				high = mid;
			} else {
				ans = mid + 1;
				low = mid + 1;
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		int[] arr = { 3, 4, 5, 1 };
		int[] arr2 = { 24, 69, 100, 99, 79, 78, 67, 36, 26, 19 };
		int[] arr3 = { 40, 48, 61, 75, 100, 99, 98, 39, 30, 10 };

		System.out.println(peakIndexInMountainArray2(arr3));
		System.out.println(peakIndexInMountainArray2(arr2));
		System.out.println(peakIndexInMountainArray2(arr));
	}
}
