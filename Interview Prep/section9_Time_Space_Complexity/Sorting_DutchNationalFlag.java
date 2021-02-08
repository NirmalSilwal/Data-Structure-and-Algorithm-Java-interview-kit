package section9_Time_Space_Complexity;

public class Sorting_DutchNationalFlag {

	public static void main(String[] args) {

		// constraints: the array will have only 0,1 and 2 as elements
		int[] arr = { 1, 1, 0, 2, 1, 0, 2 };

		sortBetter(arr);

		for (int val : arr) {
			System.out.print(val + " ");
		}
	}

	// O(N) Time | O(1) Space
	public static void sortBetter(int[] arr) {
		int low = 0, mid = 0;
		int high = arr.length - 1;

		while (mid <= high) {
			if (arr[mid] == 0) {
				swap(arr, low, mid);
				low++;
				mid++;
			} else if (arr[mid] == 1) {
				mid++;
			} else {
				swap(arr, mid, high);
				high--;
			}
		}
	}

	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
