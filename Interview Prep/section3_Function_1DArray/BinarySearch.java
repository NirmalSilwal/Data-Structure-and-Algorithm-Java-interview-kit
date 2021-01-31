package section3_Function_1DArray;

public class BinarySearch {

	public static void main(String[] args) {
		int[] arr = { 5, 7, 10, 12, 15, 20, 27, 31, 36, 42, 55, 58, 60, 65, 70, 80 };
		System.out.println(binSearch(arr, 55)); // 10
	}

	static int binSearch(int[] arr, int item) {

		int low = 0;
		int high = arr.length - 1;

		while (low <= high) {
			// int mid = (low + high) / 2;
			int mid = low + (high - low) / 2;
			if (arr[mid] == item)
				return mid;
			if (item < arr[mid]) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}

		return -1;
	}
}
