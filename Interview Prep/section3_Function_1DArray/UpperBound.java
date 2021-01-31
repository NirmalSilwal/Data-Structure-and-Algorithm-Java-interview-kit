package section3_Function_1DArray;

public class UpperBound {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 2, 2, 2, 3, 3, 3, 9, 11 };
		System.out.println(upperIndexOfItem(arr, 2)); // 4
		System.out.println(upperIndexOfItem(arr, 3)); // 7
	}

	// returns last occurrance index of search item using binary search
	static int upperIndexOfItem(int[] arr, int item) {

		int low = 0;
		int high = arr.length - 1;
		int ans = -1;

		while (low <= high) {

			// int mid = (low + high) / 2;
			int mid = low + (high - low) / 2;

			if (arr[mid] == item) {
				ans = mid;
			}
			if (item >= arr[mid]) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}

		return ans;
	}
}
