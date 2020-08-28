package Lecture14;

public class binarySearch {

	public static void main(String[] args) {

		int[] arr = { 10, 20, 30, 40, 50, 60, 70, 80 };
		int key = 70;
		int start = 0, end = arr.length - 1;
		int result = binarySearchElement(arr, key, start, end);
		if (result >= 0) {
			System.out.println(result);
		} else {
			System.out.println("element not present");
		}
	}

	// returns index of searched element if found else return -1
	public static int binarySearchElement(int[] arr, int key, int start, int end) {
		if (start == end && key != arr[start]) {
			return -1;
		}
		int mid = (start + end) / 2;

		if (arr[mid] == key) {
			return mid;
		} else {
			if (key > arr[mid]) {
				return binarySearchElement(arr, key, mid + 1, end);
			} else {
				return binarySearchElement(arr, key, start, mid - 1);
			}
		}
	}
}