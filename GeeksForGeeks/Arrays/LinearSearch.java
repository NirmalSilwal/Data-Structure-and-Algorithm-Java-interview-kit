package gfg.Arrays;

public class LinearSearch {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };

		System.out.println(searchElement(arr, 4));
	}
	
	// O(n) time
	public static int searchElement(int[] arr, int item) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == item) {
				return i;
			}
		}
		return -1;
	}

}
