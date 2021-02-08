package section9_Time_Space_Complexity;

public class QuickSort2 {

	public static void main(String[] args) {
		int[] arr = { 12, 4, 5, 2, 6, 7, 3, 98, 45, -1 };
		int low = 0, high = arr.length - 1;

		quickSort(arr, low, high);

		for (int val : arr) {
			System.out.print(val + " ");
		}
	}

	public static void quickSort(int[] arr, int low, int high) {

		if (low < high) {
			int pivotIndex = partition(arr, low, high);
			quickSort(arr, low, pivotIndex);
			quickSort(arr, pivotIndex + 1, high);
		}
	}

	private static int partition(int[] arr, int low, int high) {
		int pivot = arr[low];
		int i = low;
		int j = high;

		while (i < j) {

			while (arr[i] <= pivot)
				i++;

			while (arr[j] > pivot)
				j--;

			if (i < j) {
				swap(arr, i, j);
				i++;
				j--;
			}
		}
		swap(arr, low, j);
		return j;
	}

	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
