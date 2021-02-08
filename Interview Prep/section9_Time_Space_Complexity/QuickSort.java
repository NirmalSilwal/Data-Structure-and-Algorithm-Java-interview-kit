package section9_Time_Space_Complexity;

public class QuickSort {

	public static void main(String[] args) {
		int[] arr = { 12, 4, 5, 2, 6, 7, 3, 98, 45, -1 };
		int start = 0, end = arr.length - 1;

		quickSort(arr, start, end);

		display(arr);
	}

	public static void quickSort(int[] arr, int low, int high) {

		if (low == high)
			return;

		int mid = low + (high - low) / 2;
		int pivot = arr[mid];
		int left = low;
		int right = high;

		// partitioning
		while (left <= right) {

			while (arr[left] < pivot) {
				left++;
			}

			while (arr[right] > pivot) {
				right--;
			}

			if (left <= right) {
				swap(arr, left, right);
				left++;
				right--;
			}
		}

		quickSort(arr, low, right);
		quickSort(arr, left, high);
	}

	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	private static void display(int[] arr) {
		for (int val : arr) {
			System.out.print(val + " ");
		}
	}
}
