package section6_Recursion;

public class IsSortedArray {

	public static void main(String[] args) {
		int[] arr = { 1, 3, 6, 7, 8, 9 };
		int startIndex = 0;
		System.out.println(isSorted(arr, startIndex)); // true

		int[] arr2 = { 3, 8, 6, 1, 9, 7 };
		System.out.println(isSorted(arr2, startIndex)); // false

	}

	static boolean isSorted(int[] arr, int si) {
		if (si == arr.length - 1)
			return true;

		if (arr[si] > arr[si + 1])
			return false;

		boolean ans = isSorted(arr, si + 1);

		return ans;
	}
}
