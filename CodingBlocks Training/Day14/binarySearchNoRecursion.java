package Lecture14;

public class binarySearchNoRecursion {

	public static void main(String[] args) {

		int[] arr = { 10, 20, 30, 40, 50, 60, 70, 80 };
		int key = 30;
		int result = binarySearch(arr, key);
		System.out.println(result); // 2
		System.out.println(binarySearch(arr, 70)); // 6
		System.out.println(binarySearch(arr, 700)); // -1
	}

	public static int binarySearch(int[] arr, int key) {

		int start = 0, end = arr.length - 1;

		while (start <= end) {
			int mid = (start + end) / 2;
			if (arr[mid] == key) {
				return mid;
			} else if (key > arr[mid]) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}
		}

		return -1;
	}
}
