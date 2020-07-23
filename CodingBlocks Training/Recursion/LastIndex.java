package Recursion;

public class LastIndex {

	public static void main(String[] args) {

		int[] arr = { 3, 8, 1, 8, 8, 7 };

		int data = 8;
		int startIndex = 0;

		System.out.println(lastIndex(arr, startIndex, data));
	}

	public static int lastIndex(int[] arr, int si, int data) {
		if (si == arr.length) {
			return -1;
		}

		int index = lastIndex(arr, si + 1, data);

		if (index == -1) {
			if (arr[si] == data) {
				return si;
			} else {
				return -1;
			}
		} else {
			return index;
		}
	}
}
