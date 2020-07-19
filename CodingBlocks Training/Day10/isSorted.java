package Lecture10;

public class isSorted {

	public static void main(String[] args) {

		int[] arr = { 1, 5, 8, 10, 15 };
		System.out.println(isSortedArray(arr, 0));
	}

	public static boolean isSortedArray(int[] arr, int index) {
		if (index == arr.length - 1) {
			return true;
		}

		if (arr[index] > arr[index + 1]) {
			return false;
		} else {
			return isSortedArray(arr, index + 1);
		}
	}
}
