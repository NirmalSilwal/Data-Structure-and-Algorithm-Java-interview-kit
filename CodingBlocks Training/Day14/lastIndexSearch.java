package Lecture14;

public class lastIndexSearch {

	public static void main(String[] args) {

		int[] arr = { 10, 20, 25, 30, 30, 30, 30, 30, 40, 50, 60, 70 };
		int key = 30;
		System.out.println(binarySearchLastIndex(arr, key));

	}

	public static int binarySearchLastIndex(int[] arr, int key) {

		int start = 0, end = arr.length - 1;
		int ans = -1;

		while (start <= end) {

			int mid = (start + end) / 2;

			if (arr[mid] == key) {
				ans = mid;
			}
			if (key >= arr[mid]) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}
		}

		return ans;
	}

}
