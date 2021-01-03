package gfg.Arrays;

public class InsertInArray {

	public static void main(String[] args) {

		int[] arr = new int[6];
		arr[0] = 5;
		arr[1] = 6;
		arr[2] = 8;
		arr[3] = 9;
		arr[4] = 10;

		int[] result = insertAtIndex(arr, 5, arr.length, 7, 3);

		display(result); // 5 6 7 8 9 10
	}

	// O(n) time
	public static int[] insertAtIndex(int[] arr, int n, int capacity, int element, int pos) {
		if (n == capacity) {
			return arr;
		}
		// shifting elements
		for (int i = n - 1; i >= pos - 1; i--) {
			arr[i + 1] = arr[i];
		}
		arr[pos - 1] = element;

		return arr;
	}

	public static void display(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}
