package Recursion;

public class FirstIndex {

	public static void main(String[] args) {

		int[] arr = { 6, 8, 1, 3, 8, 3, 4 };

		int data = 4;
		int startIndex = 0;

		System.out.println(firstIndex(arr, startIndex, data));
	}

	public static int firstIndex(int[] arr, int si, int data) {
		if (si == arr.length) {
			return -1;
		}
		if (arr[si] == data) {
			return si;
		}
		int index = firstIndex(arr, si + 1, data);

		System.out.println("executing " + si + " " + index);

		if (index == -1) {
			return -1;
		} else {
			if (arr[index] == data) {
				return index;
			} else {
				return -1;
			}
		}

	}
}
