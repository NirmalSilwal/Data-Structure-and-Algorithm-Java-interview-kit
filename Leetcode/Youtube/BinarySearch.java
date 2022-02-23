package Leetcode.Youtube;

public class BinarySearch {

	public static int binarysearch(int[] arr, int value) {

		int start = 0, end = arr.length - 1;

		while (start <= end) {

			int mid = start + (end - start) / 2;

			if (arr[mid] == value) {
				return mid;
			} else if (arr[mid] > value) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}

		return -1;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 5, 6, 7, 8, 9, 12 };
		for (int n : arr) {
			System.out.println(binarysearch(arr, n));
		}
		
		System.out.println(binarysearch(arr, -2));
	}
}
