package Recursion;

public class isArraySorted {

	public static void main(String[] args) {

		int[] arr = { 3, 8, 6, 1, 9, 7 };
		int[] arr1 = { 1, 2, 3, 4, 5 };

		System.out.println(isSorted(arr, 0));
		System.out.println(isSorted(arr1, 0));
	}

	public static boolean isSorted(int[] arr, int si) {

		if (si + 1 == arr.length) {
			return true;
		}
		// System.out.println("executed "+ si);

		if (arr[si] > arr[si + 1]) {
			return false;
		}

		boolean restAnswer = isSorted(arr, si + 1);
		if (restAnswer) {
			return true;
		} else {
			return false;
		}
	}
}
