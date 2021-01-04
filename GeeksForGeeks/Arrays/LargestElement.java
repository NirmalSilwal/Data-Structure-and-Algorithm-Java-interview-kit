package gfg.Arrays;

public class LargestElement {

	public static void main(String[] args) {

		int[] arr = { 10, 5, 20, 8, 4 };
		System.out.println("Largest element index is: " + indexOfLargestElement(arr));

		int[] arr2 = { 40, 8, 50, 100 };
		System.out.println("Largest element index is: " + indexOfLargestElement(arr2));
	}

	
	// O(n) time
	public static int indexOfLargestElement(int[] arr) {
		if (arr.length < 1) {
			return -1;
		}
		int index = 0;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > arr[index]) {
				index = i;
			}
		}

		return index;
	}

}
