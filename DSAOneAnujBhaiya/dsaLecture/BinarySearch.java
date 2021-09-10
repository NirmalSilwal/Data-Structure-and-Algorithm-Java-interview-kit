package dsaLecture;

public class BinarySearch {

	public static int binarySearch(int[] arr, int key) {

		int low = 0, high = arr.length - 1;

		while (low <= high) {

			int mid = (low + high) / 2;

			if (key == arr[mid]) {
				return mid;
			}
			if (key > arr[mid]) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		return -1;
	}

	public static int binSearchRecursive(int[] arr, int key) {
		return binSearchRecursive(arr, key, 0, arr.length - 1);
	}

	private static int binSearchRecursive(int[] arr, int key, int low, int high) {
		if (low > high) {
			return -1;
		}

		int mid = (low + high) / 2;

		if (key == arr[mid]) {
			return mid;
		}

		if (key > arr[mid]) {
			return binSearchRecursive(arr, key, mid + 1, high);
		} else {
			return binSearchRecursive(arr, key, low, mid - 1);
		}
	}

	public static void main(String[] args) {
		int[] arr = { -1, 2, 5, 7, 11, 14 };
		int key = 2;
		
		System.out.println(binarySearch(arr, key)); // 1
		
		System.out.println(binSearchRecursive(arr, key)); // 1
	}
}
