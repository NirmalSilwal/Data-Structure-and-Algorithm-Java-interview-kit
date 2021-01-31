package section3_Function_1DArray;

public class LowerBound {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 2, 2, 2, 3, 3, 3, 9, 11 };
		System.out.println(lowerIndexOfItem(arr, 2)); // 1
		System.out.println(lowerIndexOfItem(arr, 3)); // 5
	}

	// returns first index of search item using binary search
	static int lowerIndexOfItem(int[] arr, int item) {

		int low = 0;
		int high = arr.length - 1;
		int ans = -1;

		while (low <= high) {

			// int mid = (low + high) / 2;
			int mid = low + (high - low) / 2;

			if (arr[mid] == item) {
				ans = mid;
			}
			if (item <= arr[mid]) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}

		return ans;
	}
}
